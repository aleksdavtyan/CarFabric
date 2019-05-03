package com.aca.carfabric.carparts;

public enum LeadingWheels {
    FOUR_WHELL_DRIVE(1000),
    FRONT_WHEEL_DRIVE(700),
    BACK_WHEEL_DRIVE(500);

    private int price;

    LeadingWheels(int price)  {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

}
