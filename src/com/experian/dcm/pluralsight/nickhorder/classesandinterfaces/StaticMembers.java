package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class StaticMembers {
    private int passengers = 0;
    int seats = 150;
    private static int allPassengers;

    //Getter passengers
    public int getPassengers() {

        return passengers;
    }
    //Getter to make allPassengers accessible outside the class.
     public static int getAllPassengers(){

        return allPassengers;
        }

     //Might want to reset passengers every now and then.
        public static void resetAllPassengers(){

        allPassengers = 0;
        }

        public void add1Passenger(int bookings){
         if(passengers < seats){
             passengers += bookings;
             allPassengers += bookings;
         }
        }



}
