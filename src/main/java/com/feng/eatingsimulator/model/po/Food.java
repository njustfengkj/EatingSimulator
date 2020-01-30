package com.feng.eatingsimulator.model.po;


public class Food {

    private long id;
    private String name;
    private long type;
    private double calorie;
    private String happinessFormula;
    private double fullFactor;
    private String guiltyFormula;
    private java.sql.Time digestPeriod;
    private String happinessDecayFormula;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }


    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }


    public String getHappinessFormula() {
        return happinessFormula;
    }

    public void setHappinessFormula(String happinessFormula) {
        this.happinessFormula = happinessFormula;
    }


    public double getFullFactor() {
        return fullFactor;
    }

    public void setFullFactor(double fullFactor) {
        this.fullFactor = fullFactor;
    }


    public String getGuiltyFormula() {
        return guiltyFormula;
    }

    public void setGuiltyFormula(String guiltyFormula) {
        this.guiltyFormula = guiltyFormula;
    }


    public java.sql.Time getDigestPeriod() {
        return digestPeriod;
    }

    public void setDigestPeriod(java.sql.Time digestPeriod) {
        this.digestPeriod = digestPeriod;
    }


    public String getHappinessDecayFormula() {
        return happinessDecayFormula;
    }

    public void setHappinessDecayFormula(String happinessDecayFormula) {
        this.happinessDecayFormula = happinessDecayFormula;
    }

}
