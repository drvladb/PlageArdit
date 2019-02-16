package com.calc.matthew.plagardit;

public class Country {
    private String name;
    private int socialLevel;
    private int transportationLevel;
    private int population;
    private int infectedPopulation;
    private int dead;

    public Country(String name, int socialLevel, int transportationLevel, int population, int infectedPopulation)
    {
        this.name = name;
        this.socialLevel = socialLevel;
        this.transportationLevel = transportationLevel;
        this.population = population;
        this.infectedPopulation = infectedPopulation;
        this.dead = 0;
    }

    public void addInfected(int infectedAdd)
    {
        this.infectedPopulation += infectedAdd;
        this.population -= infectedAdd;
    }

    public int getSocialLevel()
    {
        return this.socialLevel;
    }

    public int getTransportationLevel()
    {
        return this.transportationLevel;
    }

    public int getPopulation()
    {
        return this.population;
    }

    public int getInfectedPopulation()
    {
        return this.infectedPopulation;
    }
}
