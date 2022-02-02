package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;
    //private boolean Rw;


    public BaseDisc(String name, int storageCapacity, int capacityUsed, String diskType, ArrayList<String> contents) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = spaceLeft();
        this.capacityUsed = capacityUsed;
        this.diskType = diskType;
        this.contents = contents;
    }

    private int checkCapacity(int dataWritten){
        if(storageCapacity < dataWritten){
            return storageCapacity;
        }
            return dataWritten;
    }

    private int spaceLeft(){
        return storageCapacity - capacityUsed;

    }
    public  String diskInfo(){
        String outPut = String.format("\nDisk name: %s\nMax capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, storageCapacity,capacityUsed,remainingCapacity);
        return outPut;
    }

    public String writeData(int dataSize){
        if(dataSize > remainingCapacity){
            return "Not enough disc space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;
        return "Data successfully written to disc. Remaining space = " + remainingCapacity;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getContents() {
        return contents;
    }
}
