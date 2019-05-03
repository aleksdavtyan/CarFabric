package com.aca.carfabric;

import com.aca.carfabric.carparts.*;

public abstract class Vehicle {

    int numberOfWheels;

    
    CarBodyType carBodyType;
    Engine engine;
    LeadingWheels leadingWheels;
    Interior interiorPart;
    Exterior exteriorPart;
}
