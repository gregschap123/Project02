package Project02;

public class NaveedWizard extends People
{
    NaveedWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tNaveed Wizard";
    }
    @Override
    public int encounterStrategy(People otherPerson) {
        return 0;
    }
}
