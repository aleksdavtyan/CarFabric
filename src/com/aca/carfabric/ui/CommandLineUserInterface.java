package com.aca.carfabric.ui;

public class CommandLineUserInterface extends UserInterface {

    @Override
    public boolean output(String[] message) {
        System.out.println("Please choose a Car Type."+ message);
        return true;
    }

    @Override
    public String readStr() {
        return null;
    }
}
