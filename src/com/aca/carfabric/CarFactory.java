package com.aca.carfabric;

import com.aca.carfabric.carparts.*;
import com.aca.carfabric.cartypes.Crossover;
import com.aca.carfabric.ui.CommandLineUserInterface;
import com.aca.carfabric.ui.GraphicalUserInterface;
import com.aca.carfabric.ui.UserInterface;

public class CarFactory {

    private UserInterface userInterface;
    private String carPartsNumbers;
    private int carBodyType;
    private int engine;
    private Engine engineType;
    private int leadingWheels;
    private LeadingWheels leadingWheelsType;
    private int interior;
    private Interior interiorType;
    private int exterior;
    private Exterior exteriorType;

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
        userInterface.output("Please type the numbers of car parts types, splitting them by spaces.");
        carPartsNumbers = userInterface.readStr();
        String[] parts = carPartsNumbers.split("\\s+");
        this.carBodyType = Integer.parseInt(parts[0]);

        this.engine = Integer.parseInt(parts[1]);
        engineType = checkEngineType(this.engine);
        this.leadingWheels = Integer.parseInt(parts[2]);
        leadingWheelsType = checkLeadingWheelsType(this.leadingWheels);
        this.interior = Integer.parseInt(parts[3]);
        interiorType = chechInteriorType(this.interior);
        this.exterior = Integer.parseInt(parts[4]);
        exteriorType = chechExteriorType(this.exterior);

        if (carBodyType == 0) {
            Car car = new Crossover(4, engineType, leadingWheelsType, interiorType, exteriorType );
        }

    }

    private CarBodyType checkCarBodyType(int bodyType) {
        switch (bodyType) {
            case 0:
                return CarBodyType.CROSSOVER;
            case 1:
                return CarBodyType.SEDAN;
            case 2:
                return CarBodyType.HATCHBACK;
            case 3:
                return CarBodyType.TRUCK;
            case 4:
                return CarBodyType.TRACTOR;
            case 5:
                return CarBodyType.MOTORCYCLE;
            default:
                return null;
        }
    }

    private Engine checkEngineType(int engineType) {
        switch (engineType) {
            case 0:
                return Engine.ELECTRICAL;
            case 1:
                return Engine.DIESEL;
            case 2:
                return Engine.PETROL;
            case 3:
                return Engine.HYBRID;
            default:
                return null;
        }
    }

    private LeadingWheels checkLeadingWheelsType(int leadingWheelsType) {
        switch (leadingWheelsType) {
            case 0:
                return LeadingWheels.FOUR_WHELL_DRIVE;
            case 1:
                return LeadingWheels.FRONT_WHEEL_DRIVE;
            case 2:
                return LeadingWheels.BACK_WHEEL_DRIVE;
            default:
                return null;
        }
    }

    private Interior chechInteriorType(int interiorType) {
        switch (interiorType) {
            case 0:
                return Interior.CLOTH_SEATS;
            case 1:
                return Interior.LEATHER_SEATS;
            default:
                return null;
        }
    }

    private Exterior chechExteriorType(int exteriorType) {
        switch (exteriorType) {
            case 0:
                return Exterior.HEADLIGHT;
            case 1:
                return Exterior.XENON;
            default:
                return null;
        }
    }
}
