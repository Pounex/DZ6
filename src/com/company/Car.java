package com.company;

public class Car extends Vehicle implements Costable {

    private int doorsCount;
    private int cost;


    public Car(int wheelCount, int doorsCount, int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }

    @Override
    protected void printInfo() {
        System.out.println("Машина - Количество дверей: "+this.doorsCount+ " - Количество колес: "+ this.wheelCount+ " Стоимость: "+ getCost()+ "$");

    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
