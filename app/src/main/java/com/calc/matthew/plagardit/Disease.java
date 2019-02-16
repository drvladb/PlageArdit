package com.calc.matthew.plagardit;

import java.util.ArrayList;

public class Disease {
    private int spreadLevel;
    private int lethality;
    private ArrayList<Symptoms> symptoms;

    public Disease(int setSpreadLevel, int setLethality)
    {
        this.spreadLevel = setSpreadLevel;
        this.lethality = setLethality;
        symptoms = new ArrayList<Symptoms>();
    }

    public void levelUpSpread()
    {
        spreadLevel += 1;
    }

    public void LevelUpLethality()
    {
        lethality += 1;
    }

    public void addSymptom(Symptoms symptom)
    {
        symptoms.add(symptom);
    }


}
