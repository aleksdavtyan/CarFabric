package com.aca.carfabric;

import com.aca.carfabric.carparts.CarBodyType;
import com.aca.carfabric.ui.CommandLineUserInterface;
import com.aca.carfabric.ui.GraphicalUserInterface;
import com.aca.carfabric.ui.UserInterface;
import com.aca.carfabric.vehicletypes.Crossover;

import static com.aca.carfabric.carparts.Engine.ELECTRICAL;

public class CarFactory {

    private UserInterface userInterface;
    private String carBodyType;

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
     * Start the car assembling.
     */
    public void start() {
        userInterface.output("Please type the car body type.");
        carBodyType = userInterface.readStr();
        if (carBodyType.equals(CarBodyType.CROSSOVER.getName())) {
            Car car = new Crossover(4,ELECTRICAL);

        }

    }
}
