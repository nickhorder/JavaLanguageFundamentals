package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class MethodOverloading {

    int passengers, seats = 150, totalCheckedBags;

    //add1Passenger INSTANCE 1
    public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
    }

    //add1Passenger INSTANCE 2
    public void add1Passenger(int bags) {  //Overload that accepts the number of bags
        if(hasSeating()) { //if passengers less than seats, continue
                           //this stops totalCheckedBags being added to
                           //even if hasSeating is false, which we don't want
            add1Passenger();
            totalCheckedBags += bags;
        }
    }
    private boolean hasSeating() {
        return passengers < seats;
    }
    private boolean hasMultipleSeating(int count) {
        return passengers + count <= seats;
    }

    // Just because you're adding an overload of a method, it doesn't
    // have to be adding a brand new feature.
    // Here we take a reference to Constructors class. So here,
    // we take in getCheckedBags from that class

    //add1Passenger INSTANCE 3
    public void add1Passenger(Constructors p){
        add1Passenger(p.getCheckedBags());
    }

    //add1Passenger INSTANCE 4
    public void add1Passenger(int bags, int carryOns){
        if(carryOns <= 2)
            add1Passenger(bags);
    }

    //add1Passenger INSTANCE 5
    public void add1Passenger(Constructors p, int carryOns){
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    // What if we wanted to add multiple passengers at one time?
    // addPassengers method below accepts an array of type
    // Constructors. hasMultipleSeating will take in the count of
    // passengers you want to add, and if we have enough seats,
    // return true.

    public void addPassengers1(Constructors[] list) {
        if (hasMultipleSeating(list.length)) {
            passengers += list.length;
            for (Constructors constructor : list)
                totalCheckedBags += constructor.getCheckedBags();
        }
    }
    //But that's quite a burden. We always have to pass a list of
    //Passengers as an array.
    //Instead, we want to pass a variable number of Constructor references.
    //Only the last parameter for the method is allowed to be variable length.
    //The method receives the parameters as an array.
    public void addPassengers2(Constructors... list){
            if (hasMultipleSeating(list.length)) {
            passengers += list.length;
            for (Constructors constructor : list)
            totalCheckedBags += constructor.getCheckedBags();
            }
        }


    }

