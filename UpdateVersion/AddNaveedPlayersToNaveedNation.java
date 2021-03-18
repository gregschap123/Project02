package Project02;

import java.util.ArrayList;


/**
 * Add the 3 different types of players into 3 tribes. Each tribe should have 6 players.
 * Each nation should have 18 players.
 */

public class AddNaveedPlayersToNaveedNation implements AddPlayers
{
    /**
     * @param members
     * @param nationName
     * @param tribeName
     * @param tribeLifePoints
     * @return nothing

     */
    public void add(ArrayList<People> members, String nationName, String tribeName, int tribeLifePoints)
    {
        // Tribe1
        if(tribeName.equals("Tribe1"))
        {
            // Tribe1 has 2 of each PeopleType
            // 2 Healers
            // 2 Warriors
            // 2 Wizards
            for (int i = 0; i <=1; i++)
            {
                members.add(new NaveedHealer(nationName, tribeName, tribeLifePoints / 6));
                members.add(new NaveedWarrior(nationName, tribeName, tribeLifePoints / 6));
                members.add(new NaveedWizard(nationName, tribeName, tribeLifePoints / 6));
            }
        }
        // Tribe2
        if(tribeName.equals("Tribe2"))
        {
            // 3 Warriors
            // 2 Healers
            // 1 Wizard
            for(int i = 0; i <= 2; i++) // Warriors
            {
                members.add(new NaveedWarrior(nationName, tribeName, tribeLifePoints / 6));
            }
            for(int i = 0; i <= 1; i++) // Healers
            {
                members.add(new NaveedHealer(nationName, tribeName, tribeLifePoints / 6));
            }
            members.add(new NaveedWizard(nationName, tribeName, tribeLifePoints / 6)); // Wizard
        }
        // Tribe3
        if(tribeName.equals("Tribe3"))
        {
            // 1 Warrior
            // 1 Healer
            // 4 Wizards
            for (int i = 0; i <=3; i++) // Wizards
            {
                members.add(new NaveedWizard(nationName, tribeName, tribeLifePoints / 6));
            }

            members.add(new NaveedHealer(nationName, tribeName, tribeLifePoints / 6)); // Healer
            members.add(new NaveedWarrior(nationName, tribeName, tribeLifePoints / 6)); // Warrior
        }
    }
}
