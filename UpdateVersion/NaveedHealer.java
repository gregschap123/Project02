package Project02;

public class NaveedHealer extends People
{

    NaveedHealer(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.healer, lifePoints);
        myDescription = "\tNaveed Healer";
    }

    public int encounterStrategy(People otherPerson)
    {
        int lifepoints = 0;
        // If the two players are from the same nation, heal each other
        if((this.getNation().equals(otherPerson.getNation())))
        {
            if(this.getLifePoints() < otherPerson.getLifePoints())
            {
                lifepoints = (int)(this.getLifePoints() - otherPerson.getLifePoints()) / 2;
            }
            else
            {
                lifepoints = 0;
            }

        }
        // If the two players are not from the same nation
        else
        {
            // Running away
            if(otherPerson.getType().equals(PeopleType.warrior) || otherPerson.getType().equals(PeopleType.wizard))
            {
                lifepoints = -this.getLifePoints();
            }
            // Fighting a healer
            else
            {
                lifepoints = (int)(this.getLifePoints() / 2);
            }
        }

        return lifepoints;
    }
}