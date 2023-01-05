package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class MathEquationConstructorsMain {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {

        // Declare an Array of Classes
        MathEquationConstructors[] equations = new MathEquationConstructors[4];
        // Creating an array of 4 references of type MathEquation.
        // Each of the elements of this array will need to create an
        // instance of the MathEquation class.
        equations[0] = new MathEquationConstructors('d', 100.0d, 50.0d);
        equations[1] = new MathEquationConstructors('a', 25.0d, 92.0d);
        equations[2] = new MathEquationConstructors('s', 225.0d, 17.0d);
        equations[3] = new MathEquationConstructors('m', 11.0d, 3.0d);

        for(MathEquationConstructors blah : equations) {
            blah.execute();
            System.out.println("result = " + blah.result);
        }
    }


  }




















