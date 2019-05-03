package com.aca.carfabric.carparts;

public enum Interior {

    LEATHER_SEATS(500),
    CLOTH_SEATS(500);

    private int price;
    Interior(int price) {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
}
