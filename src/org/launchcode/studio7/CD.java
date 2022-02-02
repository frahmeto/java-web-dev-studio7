package org.launchcode.studio7;

import java.util.ArrayList;

public class CD  extends BaseDisc implements OpticalDisc {

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final int discSpeed = 500;
    private ArrayList<String> contents;


    public CD(String name, int maxCapacity, int usedCapacity, String type, ArrayList<String> contents) {
        super(name, maxCapacity, usedCapacity, type, contents);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println(getName() + " spins at " + discSpeed + " RPMs");
        //System.out.println("A Cd spins at a rate of 200-500 rpm.");
    }

    @Override
    public void readDisc() {
        int i = 1;
        for(String track : getContents()){
            System.out.println(i +":" + track);
            i++;
        }
        System.out.println("Wow,This is my Jam!!");

    }

}
