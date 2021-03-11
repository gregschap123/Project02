package Project02;

import Project02.People;
import Project02.PeopleType;

public class SmilonsHealer extends Project02.People{
    SmilonsHealer(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tSmilons Wizard";
    }
}
