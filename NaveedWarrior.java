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
        // If the two people are from the same nation
        if (this.getNation().equals(otherPerson.getNation()))
        {
            // Getting healed by a healer
            if (otherPerson.getType().equals(PeopleType.healer) && (this.getLifePoints() < otherPerson.getLifePoints()))
            {
                lifepoints = (int)(this.getLifePoints() - otherPerson.getLifePoints())/2;
            }
            // Cannot get healed b/c other person is a warrior and wizard; So they do not fight.
            else
            {
                lifepoints = -this.getLifePoints();
            }
        }
        // If the two people are from the different nation
        else
        {
            lifepoints = 0;
        }

        return lifepoints;
    }
}
