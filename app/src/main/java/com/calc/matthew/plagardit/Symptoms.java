package com.calc.matthew.plagardit;

public class Symptoms {
    private String name;
    private int spreadLevel;
    private int lethality;

    public Symptoms(String setName, int setSpreadLevel, int setLethality)
    {
        this.name = setName;
        this.spreadLevel = setSpreadLevel;
        this.lethality = setLethality;
    }

    public int getSpreadLevel()
    {
        return this.spreadLevel;
    }
    public int getLethality()
    {
        return this.lethality;
    }

    public String getName()
    {
        return this.name;
    }
}
