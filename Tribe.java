package Project02;

import java.util.Collection;
import java.util.Collections;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import Project02.People;
import Project02.PeopleType;
import Project02.SchaperWarrior;
import Project02.SchaperWizard;

public class Tribe
{
    private String nationName;
    private String tribeName;
    private int tribeLifePoints;
    private ArrayList<People> members = new ArrayList<>();
    private ArrayList<People> livingMembers = new ArrayList<>();

    public Tribe(String nation, String tribe, int lifePoints, int numWarriors, int numWizards, int numHealers)
    {
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints;

        addWarriors(numWarriors);
        addWizards(numWizards);
        addHealers(numHealers);

        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }

    /**
     * adds appropriate number of Warriors to the tribe of a certain nation
     * @param numWarriors number of Warriors to be added to the tribe
     */
    private void addWarriors(int numWarriors) {
        //add warriors to tribe
        for(int i = 0 ; i < numWarriors ; i++){
            People warrior;
            switch(nationName) {
                case "Toyberg":
                    warrior = new Project02.ToybergWarrior(nationName, tribeName, tribeLifePoints / 6);
                    break;
                case "Smilons":
                    warrior = new Project02.SmilonsWarrior(nationName, tribeName, tribeLifePoints / 6);
                    break;
                case "Perez":
                    warrior = new Project02.PerezWarrior(nationName, tribeName, tribeLifePoints / 6);
                    break;
                default:
                    warrior = new Project02.NaveedWarrior(nationName, tribeName, tribeLifePoints / 6);
                    break;
            }

            members.add(warrior);
        }
    }

    /**
     * adds appropriate number of healers to the tribe of a certain nation
     * @param numWizards number of Wizards to be added to certain nation
     */
    private void addWizards(int numWizards) {
        for(int i = 0 ; i < numWizards ; i++){
            People wizard;
            switch(nationName) {
                case "Toyberg":
                    wizard = new Project02.ToybergWizard(nationName, tribeName, tribeLifePoints / 6);
                    break;
                case "Smilons":
                    wizard = new Project02.SmilonsWizard(nationName, tribeName, tribeLifePoints / 6);
                    break;
                case "Perez":
                    wizard = new Project02.PerezWizard(nationName, tribeName, tribeLifePoints / 6);
                    break;
                default:
                    wizard = new Project02.NaveedWizard(nationName, tribeName, tribeLifePoints / 6);
                    break;
            }
            members.add(wizard);
        }
    }

    /**
     * adds appropriate number of healers to the tribe of a certain nation
     * @param numHealers the number of healers to be added to the tribe
     */
    private void addHealers(int numHealers) {
        for(int i = 0 ; i < numHealers ; i++){
            People healer;
            switch(nationName) {
                case "Toyberg":
                    healer = new Project02.ToybergHealer(nationName, tribeName, tribeLifePoints / 6);
                    break;
                case "Smilons":
                    healer = new Project02.SmilonsHealer(nationName, tribeName, tribeLifePoints / 6);
                    break;
                case "Perez":
                    healer = new Project02.PerezHealer(nationName, tribeName, tribeLifePoints / 6);
                    break;
                default:
                    healer = new Project02.NaveedHealer(nationName, tribeName, tribeLifePoints / 6);
                    break;
            }
            members.add(healer);
        }
    }


    public ArrayList<People> getLivingTribeMembers()
    {
        livingMembers.clear();
        tribeLifePoints = 0;
        for(int person = 0; person < members.size(); person++)
        {
            if(members.get(person).isPersonAlive())
            {
                livingMembers.add(members.get(person));
                tribeLifePoints += members.get(person).getLifePoints();
                //System.out.println(members.get(person));
            }
            else
            {
                if(!(members.get(person).getDead()))
                {
                    members.get(person).setDead();
                    System.out.println("\t\t" + members.get(person) + " is dead!");
                }
            }
        }
        //System.out.println(livingMembers);
        return livingMembers;
    }
    /*
    public void printMembers()
    {
        for(int i = 0; i < 2; i++)
        {
            System.out.println(people.get(i));
        }
    }
*/


    public int getTribeSize()
    {
        return livingMembers.size();
    }

    public Boolean isTribeAlive()
    {
        return (tribeLifePoints > 0);
    }


    public int getTribeLifePoints()
    {
        return tribeLifePoints;
    }

    public String getTribeName()
    {
        return tribeName;
    }

    public String toString()
    {
        String result = "\0";

        result = tribeName;
        for(int i = 0; i < members.size(); i++)
        {
            result = result + '\n' + members.get(i).toString();
        }
        result = result + '\n';
        return result;
    }

}
