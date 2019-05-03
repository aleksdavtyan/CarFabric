package com.aca.carfabric.carparts;

public enum Engine {

    ELECTRICAL(5000),
    DIESEL(1500),
    PETROL(1000),
    HYBRID(3000);

    private int price;

    Engine(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

}
