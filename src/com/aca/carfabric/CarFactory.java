package com.aca.carfabric;

import com.aca.carfabric.carparts.CarBodyType;
import com.aca.carfabric.ui.CommandLineUserInterface;
import com.aca.carfabric.ui.GraphicalUserInterface;
import com.aca.carfabric.ui.UserInterface;
import com.aca.carfabric.cartypes.Crossover;

import static com.aca.carfabric.carparts.Engine.ELECTRICAL;
import static java.lang.Integer.parseInt;

public class CarFactory {

    private UserInterface userInterface;
    private String carPartsNumbers;
    private int carBodyType;
    private int engine;
    private int leadingWheels;
    private int interior;
    private int exterior;

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
        userInterface.output("Please type the car parts type number splitting them by spaces.");
        carPartsNumbers = userInterface.readStr();
        String[] parts = carPartsNumbers.split("\\s+");
        this.carBodyType = Integer.parseInt(parts[0]);
        this.engine = Integer.parseInt(parts[1]);
        this.leadingWheels = Integer.parseInt(parts[2]);
        this.interior = Integer.parseInt(parts[3]);
        this.exterior = Integer.parseInt(parts[4]);

        if (carBodyType == 0) {
            Car car = new Crossover(4, ELECTRICAL);

        }

    }

    void checkParts(int partNumber) {

    }

}
