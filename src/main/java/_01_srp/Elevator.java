package _01_srp;

import _02_ocp.Grain;

public class Elevator {

    private ConveyorBeltEngine conveyorBeltEngine;
    private ConveyorLoadUnint conveyorLoadUnint;

    public Elevator(ConveyorBeltEngine conveyorBeltEngine, ConveyorLoadUnint conveyorLoadUnint) {
        this.conveyorBeltEngine = conveyorBeltEngine;
        this.conveyorLoadUnint = conveyorLoadUnint;
    }

    public void conveyGrain(){
        conveyorLoadUnint.openHatch();
        conveyorBeltEngine.start();
    }

    public void processGrain(Grain grain) {
        //ProcessGrain
    }

    public void shipGrain (Grain grain) {
        // ship Grain
    }

}

