package Project02;

import Project02.People;
import Project02.PeopleType;

public class NaveedWarrior extends People
{
    NaveedWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tNaveed Warrior";
    }

    public int encounterStrategy2(int additonalLifepoints)
    {
        int lifepoints = 0;
        // Checks if the current lifepoints are not over 100
        if (this.getLifePoints() < 100)
        {
            lifepoints = this.getLifePoints() + additonalLifepoints ;
        }
        else
        {
            lifepoints = this.getLifePoints();
        }
        return lifepoints;
    }

    @Override
    public int encounterStrategy(People otherPerson)
    {
        int lifepoints = 0;
        // Both players are from the same nation
        if (this.getNation().equals(otherPerson.getNation()))
        {
            // Can only heal if the other person is a healer
            if (otherPerson.getType().equals(PeopleType.healer))
            {
                // Both are from same tribe.
                if (otherPerson.getType().equals(this.getTribe()))
                {
                    lifepoints = encounterStrategy2(10);
                }
                // Both are from different tribes.
                else
                {
                    lifepoints = encounterStrategy2(5);
                }
            }
            // Warrior cannot increase their lifepoints without a healer
            else
            {
                lifepoints = this.getLifePoints();
            }
        }
        // Both players are not from the same nation.
        else
        {
            // Getting attacked by a wizard
            if (otherPerson.getType().equals(PeopleType.wizard))
            {
                lifepoints = this.getLifePoints() - 5;
            }

            // Getting attacked by a warrior
            if (otherPerson.getType().equals(PeopleType.warrior))
            {
                // Running away
                if (otherPerson.getLifePoints() > this.getLifePoints())
                {
                    lifepoints = -this.getLifePoints();
                }
                // Fighting the warrior, but loses 10 lifepoints
                else
                {
                    lifepoints = this.getLifePoints() - 10;
                }
            }
            // Fighting a healer, Does not do any damage
            else
            {
                lifepoints = this.getLifePoints();
            }
        }

        return lifepoints;
    }
}
