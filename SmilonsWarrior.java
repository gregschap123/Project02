package Project02;

import Project02.People;
import Project02.PeopleType;

public class SmilonsWarrior extends People{
    SmilonsWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tSmilons Warrior";
    }

}
