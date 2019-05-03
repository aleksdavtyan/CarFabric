package com.aca.carfabric.cartypes;

import com.aca.carfabric.Car;
import com.aca.carfabric.carparts.Engine;
import com.aca.carfabric.carparts.Exterior;
import com.aca.carfabric.carparts.Interior;
import com.aca.carfabric.carparts.LeadingWheels;

import static com.aca.carfabric.carparts.CarBodyType.CROSSOVER;

public class Crossover extends Car {

    private int numberOfWheels;
    private Engine engine;
    private LeadingWheels leadingWheels;
    private Interior interiorPart;
    private Exterior exteriorPart;

    public Crossover(int numberOfWheels, Engine engine) { //LeadingWheels leadingWheels, Interior interior, Exterior exterior
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
//        this.leadingWheels = leadingWheels;
//        this.interiorPart = interior;
//        this.exteriorPart = exterior;
        System.out.println("The price of CROSSOVER = " + CROSSOVER.getPrice());
    }
}
