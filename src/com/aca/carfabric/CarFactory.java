package com.aca.carfabric;

import com.aca.carfabric.carparts.*;
import com.aca.carfabric.cartypes.*;
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
        userInterface.output("Please type the number of car body type.");
        for (CarBodyType carBodyType : CarBodyType.values()) {
            System.out.printf("%s - %s ", carBodyType.ordinal(), carBodyType + "; ");
        }
        this.carBodyType = userInterface.readInt();

        userInterface.output("Please type the number of engine type.");
        for (Engine engineType : Engine.values()) {
            System.out.printf("%s - %s ", engineType.ordinal(), engineType + "; ");
        }
        this.engine = userInterface.readInt();
        this.engineType = checkEngineType(this.engine);

        userInterface.output("Please type the number of leading wheels type.");
        for (LeadingWheels leadingWheelsType : LeadingWheels.values()) {
            System.out.printf("%s - %s ", leadingWheelsType.ordinal(), leadingWheelsType + "; ");
        }
        this.leadingWheels = userInterface.readInt();
        this.leadingWheelsType = checkLeadingWheelsType(this.leadingWheels);

        userInterface.output("Please type the number of interior type.");
        for (Interior interiorType : Interior.values()) {
            System.out.printf("%s - %s ", interiorType.ordinal(), interiorType + "; ");
        }
        this.interior = userInterface.readInt();
        this.interiorType = checkInteriorType(this.interior);

        userInterface.output("Please type the number of exterior type.");
        for (Exterior exteriorType : Exterior.values()) {
            System.out.printf("%s - %s ", exteriorType.ordinal(), exteriorType + "; ");
        }
        this.exterior = userInterface.readInt();
        this.exteriorType = checkExteriorType(this.exterior);

        buildCar(this.carBodyType);

    }

    private void buildCar(int bodyType) {
        switch (bodyType) {
            case 0:
                new Crossover(engineType, leadingWheelsType, interiorType, exteriorType);
                break;
            case 1:
                new Sedan(engineType, leadingWheelsType, interiorType, exteriorType);
                break;
            case 2:
                new Hatchback(engineType, leadingWheelsType, interiorType, exteriorType);
                break;
//            case 3:
//                new Truck(engineType, leadingWheelsType, interiorType, exteriorType);
//                break;
//            case 4:
//                new Tractor(engineType, leadingWheelsType, interiorType, exteriorType);
//                break;
//            case 5:
//                new Motorcycle(engineType, leadingWheelsType, interiorType, exteriorType);
//                break;
            default:
                break;
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

    private Interior checkInteriorType(int interiorType) {
        switch (interiorType) {
            case 0:
                return Interior.CLOTH_SEATS;
            case 1:
                return Interior.LEATHER_SEATS;
            default:
                return null;
        }
    }

    private Exterior checkExteriorType(int exteriorType) {
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
