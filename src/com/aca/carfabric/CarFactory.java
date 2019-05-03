package com.aca.carfabric;

import com.aca.carfabric.ui.CommandLineUserInterface;
import com.aca.carfabric.ui.GraphicalUserInterface;
import com.aca.carfabric.ui.UserInterface;

public class CarFactory {

    private UserInterface userInterface;

    public CarFactory(InterfaceType interfaceType) {
        switch (interfaceType) {
            case COMMAND_LINE:
                userInterface = new CommandLineUserInterface();
                break;
            case GRAPHICAL_UI:
                userInterface = new GraphicalUserInterface();
                break;
        }
    }

    /**
     * Start the Vehicle Assembling.
     */

}
