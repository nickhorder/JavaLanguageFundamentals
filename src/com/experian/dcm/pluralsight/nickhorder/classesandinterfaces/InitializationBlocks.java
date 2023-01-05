package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class InitializationBlocks {

    /*
    Initialization blocks have code that is shared across constructors.
    It runs no matter what Constructor is used to create an instance.
    They have no parameters. Class can have 0 or more inits.
    If you provide more than 1, all of the blocks will always run.
    Executed in order starting at the top of the source file.
     */

    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable = new boolean[seats];
    //remember that boolean defaults to false. We don't want this,
    //we want the value true, indicating that all the seats are available.
    //To make sure it's always initialised, we'd have to chain to the default
    //constructor this()

    //Here's the initialization block (this is an Instance IB):
    {
        for(int i = 0; i < seats; i++)
            isSeatAvailable[i] = true;
    }

    public InitializationBlocks(int flightNumber){

        this.flightNumber = flightNumber;
    }
    public InitializationBlocks(char flightClass){

        this.flightClass = flightClass;
    }
    //The above 2 constructors run after Initialization Block.
}
