package com.company;

public class Motorcycle extends Vehicle {

    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }


    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл - Количество колес: " + this.wheelCount + " - Максимальная скорость: " + this.maxSpeed + " км/ч");

    }
}
