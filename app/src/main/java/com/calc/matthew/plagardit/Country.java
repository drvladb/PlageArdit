package com.calc.matthew.plagardit;

public class Country {
    private String name;
    private int socialLevel;
    private int transportationLevel;
    private int population;
    private int infectedPopulation;

    public Country(String name, int socialLevel, int transportationLevel, int population, int infectedPopulation)
    {
        this.name = name;
        this.socialLevel = socialLevel;
        this.transportationLevel = transportationLevel;
        this.population = population;
        this.infectedPopulation = infectedPopulation;
    }

    public void addInfected(int infectedAdd)
    {
        this.infectedPopulation += infectedAdd;
        this.population -= infectedAdd;
    }

}
