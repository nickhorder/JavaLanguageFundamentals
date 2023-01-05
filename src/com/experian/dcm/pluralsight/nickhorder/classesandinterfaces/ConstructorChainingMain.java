package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class ConstructorChainingMain {
    public static void main(String[] args) {
        ConstructorChaining bob = new ConstructorChaining(1,3);
        System.out.println(ConstructorChaining.perBagFee);
        //Writes 25.0 if over 1, 50.0 if 1
    }
}
