package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        ArrayList<String> tlc = new ArrayList<>(Arrays.asList("The Lord's Prayer","He's Got The Whole World In His Hands","Every Praise","same God","I worship you", "WayMaker", "Promises", "fill the Room", "Than you"));

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Rooms for Squares", 700, 350, "CD-R", tlc);
        DVD dvd = new DVD("pirates of the Caribbean", 5000,3000,"DVD-R", tlc);

        CD myCd = new CD("Thank you",300,250,"Cd-R",tlc);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        dvd.spinDisc();

        cd.readDisc();
        dvd.readDisc();

        System.out.println(cd.writeData(300));
        System.out.println(dvd.writeData(10000));

    }
}
