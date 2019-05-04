package com.aca.carfabric.carparts;

public enum Interior {
    CLOTH_SEATS(200),
    LEATHER_SEATS(800);

    private int price;

    Interior(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
