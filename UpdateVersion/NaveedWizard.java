package Project02;

public class NaveedWizard extends People
{
    NaveedWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tNaveed Wizard";
    }
    @Override
    public int encounterStrategy(People otherPerson)
    {
        int lifePoints = 0;
        if (!(this.getNation().equals(otherPerson.getNation())))
        {
            if (otherPerson.getLifePoints() < this.getLifePoints())
            {
                if (otherPerson.getType() == PeopleType.warrior) // run away
                {
                    lifePoints = -this.getLifePoints();
                }
                else // attack a wizard
                {
                    lifePoints = (int) (this.getLifePoints()/2);
                }
            }
        }
        else
        {
            if (otherPerson.getType().equals(PeopleType.healer) && this.getLifePoints() < 30) // heal a friend
            {
                System.out.println("Healing a friend");
                lifePoints = this.getLifePoints() + 2;
            }
            else
            {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}
