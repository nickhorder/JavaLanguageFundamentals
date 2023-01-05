package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class MathEquationMethodOverloadMain {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {

        // Declare an Array of Classes
        MathEquationStaticMembers[] equations = new MathEquationStaticMembers[4];
        // Creating an array of 4 references of type MathEquation.
        // Each of the elements of this array will need to create an
        // instance of the MathEquation class.
        equations[0] = new MathEquationStaticMembers('d', 100.0d, 50.0d);
        equations[1] = new MathEquationStaticMembers('a', 25.0d, 92.0d);
        equations[2] = new MathEquationStaticMembers('s', 225.0d, 17.0d);
        equations[3] = new MathEquationStaticMembers('m', 11.0d, 3.0d);

        for(MathEquationStaticMembers blah : equations) {
            blah.execute();
            System.out.println("result = " + blah.result);
        }
        System.out.println("Average Result = " +
                MathEquationStaticMembers.getAverageResult());

        System.out.println();
        System.out.println("Using execute overloads");
        System.out.println();

        MathEquationMethodOverload overloaded = new
                MathEquationMethodOverload('d');
        double leftDouble = 9;
        double rightDouble = 4;
        overloaded.execute(leftDouble,rightDouble);
        System.out.println("Overloaded with doubles: " +
                overloaded.result);

        //Here, Java performs a widening conversion (int to double)
        //And the method call doesn't fail.
        int leftInt = 9;
        int rightInt = 4;
        overloaded.execute(leftInt, rightInt);
        System.out.println("Overloaded with ints: " +
                 overloaded.result);

        //More info about how Java selects the right Overload:
        // bit.ly/psjavamethodselection
    }


  }




















