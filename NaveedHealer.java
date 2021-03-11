package Project02;

public class NaveedHealer extends People
{
    NaveedHealer(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tNaveed Healer";
    }

    @Override
    public int encounterStrategy(People otherPerson) {
        return 0;
    }
}
