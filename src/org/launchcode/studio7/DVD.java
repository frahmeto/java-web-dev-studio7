package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final int discSpeed = 1600;

    public DVD(String name, int maxCapacity, int usedCapacity, String type, ArrayList<String> contents) {
        super(name, maxCapacity, usedCapacity, type, contents);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        //System.out.println(getName() +"spins at" + discSpeed + "RPMs");
        System.out.println("A Cd spins at a rate of 570-1600 rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("I'm sorry, I don't like this movie.");

    }





}
