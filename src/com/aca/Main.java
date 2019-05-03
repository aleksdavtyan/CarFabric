package com.aca;

import com.aca.carfabric.CarFactory;
import com.aca.carfabric.InterfaceType;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory(InterfaceType.COMMAND_LINE);
        carFactory.start();
    }
}
