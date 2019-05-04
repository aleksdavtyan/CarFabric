package com.aca.carfabric.ui;

import com.aca.carfabric.carparts.CarBodyType;

import java.util.Scanner;

public class CommandLineUserInterface extends UserInterface {

    @Override
    public boolean output(String message) {
        System.out.println(message);
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

    @Override
    public int readInt() {
        Scanner intScanner = new Scanner(System.in);
        int carPartNumber;
        carPartNumber = intScanner.nextInt();
        return carPartNumber;
    }
}
