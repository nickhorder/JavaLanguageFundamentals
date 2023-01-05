package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class ConstructorsMain {

    public static void main(String[] args) {
    Constructors bob = new Constructors(); //relies on default constructor being
        // present - i.e public Constructors () {}
    bob.setCheckedBags(3); //Requires above
    Constructors fred = new Constructors(2);
    }
}