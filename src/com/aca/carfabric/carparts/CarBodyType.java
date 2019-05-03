package com.aca.carfabric.carparts;

public enum CarBodyType {

    CROSSOVER(2000),
    SEDAN(1000),
    HATCHBACK(1500),
    TRUCK(1100),
    TRACTOR(500),
    MOTORCYCLE(800);

    private int price;

    CarBodyType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name();
    }
}
