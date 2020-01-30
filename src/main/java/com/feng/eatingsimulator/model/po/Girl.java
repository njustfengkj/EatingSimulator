package com.feng.eatingsimulator.model.po;


public class Girl {

    private long id;
    private String name;
    private long age;
    private double appetite;
    private double weightCareFactor;
    private double gluttonyFactor;


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


    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }


    public double getAppetite() {
        return appetite;
    }

    public void setAppetite(double appetite) {
        this.appetite = appetite;
    }


    public double getWeightCareFactor() {
        return weightCareFactor;
    }

    public void setWeightCareFactor(double weightCareFactor) {
        this.weightCareFactor = weightCareFactor;
    }


    public double getGluttonyFactor() {
        return gluttonyFactor;
    }

    public void setGluttonyFactor(double gluttonyFactor) {
        this.gluttonyFactor = gluttonyFactor;
    }

}
