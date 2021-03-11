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
    public int encounterStrategy(People otherPerson) {
        return 0;
    }
}
