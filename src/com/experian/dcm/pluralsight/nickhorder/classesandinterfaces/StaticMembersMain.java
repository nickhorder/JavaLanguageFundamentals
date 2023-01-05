package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;
import static com.experian.dcm.pluralsight.nickhorder.classesandinterfaces.StaticMembers.*;
public class StaticMembersMain {
    public static void main(String[] args) {
 /*
 Most commonly we have instance members - each time we create instances
 of the class, that instance has it's own copy of the values, and the methods
 on that instance interact with those members. Static members are different.
 They're shared class-wide. So they're not associated with an individual instance
 of the class.
  */
        //Field
        // Each instance accesses the same value. One value for the whole class
        //private int passengers = 150;
        //private static int allPassengers;
        // If there are multiple instances of the class that add to both
        // passengers and allPassengers, allPassengers would essentially allow
        // us to record all the passengers added across each instance. However
        // each instance would have it's own discrete value for passengers.

        //Method
        // Performs an action that's not tied to a specific instance. They
        // can't access instance members.

        // private int passengers; //not accessible outside the class. If we
        // want to make its value accessible, we wrap it in a getter:

        // public static int getAllPassengers(){
        // return allPassengers
        //    }
        int bookings = 5;
        //StaticMembers.resetAllPassengers(); Note that, if we use an import statement
        // (shown at the top of the code with wildcard) we don't have to declare the
        // class where the static method is kept:
                resetAllPassengers();

        StaticMembers laxToSlc = new StaticMembers();
        laxToSlc.add1Passenger(bookings); //5 passengers to SLC
        laxToSlc.add1Passenger(bookings); //Now 10 passengers to SLC

        StaticMembers dfwToNyc = new StaticMembers();
        dfwToNyc.add1Passenger(bookings); //5 passengers to NYC

        System.out.println("LAX to SLC has: " + laxToSlc.getPassengers() +
                " passengers");
        System.out.println("DFW to NYC has: " + dfwToNyc.getPassengers() +
                " passengers");
        System.out.println("Passengers on all flights: " +
                StaticMembers.getAllPassengers()); //15
        //Getting good at this!
    }
}
