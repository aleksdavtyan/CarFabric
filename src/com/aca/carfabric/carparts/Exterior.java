package com.aca.carfabric.carparts;

public enum Exterior {

    HEADLIGHT(100),
    XENON(150),
    TIRES_WHEELS(400);

    private int price;

    Exterior(int price) {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
}
