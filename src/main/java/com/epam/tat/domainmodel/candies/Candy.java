package com.epam.tat.domainmodel.candies;

public class Candy extends CandyBase {

    public Candy(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Candy() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
