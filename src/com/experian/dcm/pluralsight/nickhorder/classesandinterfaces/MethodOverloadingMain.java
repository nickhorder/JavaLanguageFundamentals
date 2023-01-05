package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class MethodOverloadingMain {

    public static void main(String[] args) {
    /*
    Primitive types are passed by value.
    Objects are passed by reference. We don't pass copy of the entire
    Object into the method. We pass a reference to the object.
    The method can make changes to the reference of object, but that
    Instance can't be used outside the method.

    Members within a Method CAN be modified with the resulting change
    being passed outside the Method.
    */

    /* OVERLOADING
    Every constructor and every method must have a unique signature.
    There are a number of parts that make up the signature.
    - Number of parameters
    - Data type of each parameter
    - Method Name

     */
        MethodOverloading f = new MethodOverloading();
    /* Calls INSTANCE 1 - the method that takes no parameters:
    */
        f.add1Passenger();

    /* Calls INSTANCE 2 - the method that takes one data type,
    of type int. That will increment checked bags, and then call
    INSTANCE 1:
    */
        f.add1Passenger(2);

    /* Calls INSTANCE 3 - the method that accepts a reference to the
    Constructors class. Then INSTANCE2,INSTANCE1 are called
    */
        Constructors p1 = new Constructors(1);
        f.add1Passenger(p1);

    /* Calls INSTANCE 5 - the method that accepts a reference to the
    Constructors class and int for carryOns.
    Then INSTANCE4,3,2,1
    */
        Constructors p2 = new Constructors(1);
        f.add1Passenger(p2,1);

    /*

    */
        Constructors luisa = new Constructors(1);
        Constructors john = new Constructors(2);
        // Parameters as array into method:
        f.addPassengers1(new Constructors[] {luisa, john});
        // Variable length parameter list:
        f.addPassengers2(luisa, john);
    }
}


