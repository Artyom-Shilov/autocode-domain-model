package com.epam.tat.domainmodel.candies;

public abstract class CandyBase {

    String name;
    int weight;

    abstract String getName();

    abstract void setName(String name);

    abstract int getWeight();

    abstract void setWeight(int weight);
}
