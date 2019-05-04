package com.aca.carfabric.cartypes;

import com.aca.carfabric.Car;
import com.aca.carfabric.carparts.Engine;
import com.aca.carfabric.carparts.Exterior;
import com.aca.carfabric.carparts.Interior;
import com.aca.carfabric.carparts.LeadingWheels;

import static com.aca.carfabric.carparts.CarBodyType.SEDAN;

public class Sedan extends Car {
    private static final int NUMBER_OF_WHEELS = 4;
    private Engine engine;
    private LeadingWheels leadingWheels;
    private Interior interiorPart;
    private Exterior exteriorPart;

    // Constructing/assembling the car
    public Sedan(Engine engine, LeadingWheels leadingWheels, Interior interior, Exterior exterior) {
        this.engine = engine;
        this.leadingWheels = leadingWheels;
        this.interiorPart = interior;
        this.exteriorPart = exterior;

        // Calculate the price after assembling
        int carPrice = SEDAN.getPrice() + engine.getPrice() + leadingWheels.getPrice() + interior.getPrice() + exterior.getPrice();
        System.out.println("The price of " + SEDAN + " = " + carPrice);
    }
}
