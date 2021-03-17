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

    @Override
    public int encounterStrategy(People otherPerson)
    {
        int lifepoints = 0;
        if (this.getNation().equals(otherPerson.getNation()))
        {
            if (this.getLifePoints() != 111)
            {
                // Getting healed
                if (otherPerson.getType().equals(PeopleType.healer) && this.getLifePoints() < 45)
                {
                    lifepoints = this.getLifePoints() + 3;
                }
                else
                {
                    lifepoints = 0;
                }
            }
            else
            {
                lifepoints = 0;
            }

        }

        else
        {
            // Getting attacked by a wizard
            if (otherPerson.getType().equals(PeopleType.wizard))
            {
                lifepoints = this.getLifePoints() - 2;
            }

            // Getting attacked by a warrior
            if (otherPerson.getType().equals(PeopleType.warrior))
            {
                // Running away
               if (otherPerson.getLifePoints() > this.getLifePoints())
               {
                   lifepoints = -this.getLifePoints();
               }
               else
               {
                   lifepoints = this.getLifePoints() - 10;
               }
            }
            else
            {
                lifepoints = 0;
            }
        }

        return lifepoints;
    }
}
