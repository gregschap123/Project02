package Project02;

public enum PeopleType
{
    wizard  ("wizard"),
    warrior ("warrior"),
    healer ("Medic");

    private String description;

    PeopleType (String types)
    {
        description = types;
    }


    public String getDescription()
    {
        return description;
    }
}
