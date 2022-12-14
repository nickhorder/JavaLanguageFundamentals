package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

import java.util.Random;
// Called by StaticInitializationBlocks
public class AdminService {
    Random random;
    public void connect() {
        // Simulate connecting to the service
        // Just creates a random value generator
        random = new Random();
    }

    public void close() {
        // empty method to simulate disconnecting from the service
    }

    public boolean isRestricted() {
        // randomly return true/false
        boolean isRestricted = random.nextBoolean();
        return isRestricted;

    }


    public int getMaxFlightPassengers() {
        // return a random number between 0 and 200
        int max = random.nextInt(200);
        return max;
    }

}