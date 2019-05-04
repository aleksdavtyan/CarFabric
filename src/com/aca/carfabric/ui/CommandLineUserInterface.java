package com.aca.carfabric.ui;

import com.aca.carfabric.carparts.CarBodyType;

import java.util.Scanner;

public class CommandLineUserInterface extends UserInterface {

    @Override
    public boolean output(String message) {
        System.out.println(message);
        for(CarBodyType carBodyType : CarBodyType.values())
            System.out.printf("%s - %s ", carBodyType.ordinal(), carBodyType + "; ");
            return true;
    }

    @Override
    public String readStr() {
        //get Car Body Type
        Scanner strScanner = new Scanner(System.in);
        String carPartsNumbers;
        carPartsNumbers = strScanner.nextLine();
        return carPartsNumbers;
    }
}
