package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class StaticInitializationBlocks {

    /*
    Static Initialization Blocks perform one-time type initialization,
    before a type's first use.
    They have access to static members only
    Created similarily to instance intialization blocks.
    It's a statement enclosed in brackets, preceded by the static
    keyword, and outside any method.
     */
    private int passengersThisBooking;
    private static int allPassengers, tsaPassengersLimit,
            seatsAvailable = 200;

    /*
       Only need Getter/Setter/Constructor if passing in args (int of
       passenger for e.g) from StaticInitializationBlocksMain class.
    */
    //Getter passengers
    public int getPassengersThisBooking() {

        return passengersThisBooking;
    }

    //Setter passengers
    public void setPassengersThisBooking(int passengersThisBooking) {
        this.passengersThisBooking = passengersThisBooking;
    }

    //Constructor
    public StaticInitializationBlocks(int passengersThisBooking) {
        this.passengersThisBooking = passengersThisBooking;
    }

    /*
    Imagine the instance where there is a limit of passengers
    per flight, which could be lower than what we intend to
    use (400).
    The limit will be the same for all flight instances.

    Here's the IB:

     */

    static {
        // Create instance of AdminService
        AdminService admin = new AdminService();
        // Connect to the service
        admin.connect();
        // If there are restrictions, getMax. Otherwise,
        // return largest possible integer. Gives us a value
        // That there is no administrative limit.
        tsaPassengersLimit = admin.isRestricted() ?
                admin.getMaxFlightPassengers() :
                Integer.MAX_VALUE;

        // Close service:
        admin.close();
        if (tsaPassengersLimit == Integer.MAX_VALUE) {
            System.out.println("No Passenger Limit currently set by TSA. Continuing to check available seats..");
        } else
            System.out.println("There is currently a maximum passenger limit of "
                    + tsaPassengersLimit + " set by the TSA. This may impact" +
                    " the feasability of this booking.");
        // The code will run once, before we use the StaticInitializationBlocks
        // class. So MaxFlight is initialized before we use the class.
    }

    //leaving this for now, but it would be best reworked by having separate
    // booking methods dependant on whether there is a TSA passenger limit.
    // would reduce the IF statement
    public void addBooking() {
        System.out.println("Running addBooking service. Seats available before booking: " +
                seatsAvailable);

        // We only add a passenger if seat is available and tsaPassengersLimit
        // Haven't been exceeded.
        if (tsaPassengersLimit <= (allPassengers + passengersThisBooking)) {
            System.out.println("BOOKING FAILED." + "\n" +
                    "The limit of passengers set by the TSA has been reached" +
                    ", and this booking cannot be made.");
        } else {
            if (passengersThisBooking <= seatsAvailable && allPassengers <= tsaPassengersLimit) {
                seatsAvailable -= passengersThisBooking;
                allPassengers += passengersThisBooking;
                System.out.println("BOOKING COMPLETE!" + "\n" +
                        allPassengers + " passengers are now booked on this flight." +
                        " There are " + seatsAvailable + " seats remaining.");
            } else {
                System.out.println("BOOKING FAILED." + "\n" +
                        "This flight is fully booked, with " + allPassengers +
                        " passengers. " + "\n" +
                        "Please book the passengers on a separate flight. ");
            }

        }


    }
}

