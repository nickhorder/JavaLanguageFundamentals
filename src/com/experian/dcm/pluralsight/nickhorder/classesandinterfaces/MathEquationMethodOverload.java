package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class MathEquationMethodOverload {

    //Field Definitions
    double leftVal;
    double rightVal;
    char opCode;
    double result;
    private static int numberOfCalculations;
    private static double sumOfResults;
    // Doesn't matter how many instances of the class we create,
    // The two above will be updated by all.

    //GETTER/SETTER CHAINS:
    //Getter leftVal
    public double getLeftVal() {
        return leftVal;
    }
    //Setter leftVal
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    //Getter rightVal
    public double getRightVal() {
        return rightVal;
    }
    //Setter rightVal
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    //Getter opCode
    public char getOpCode() {
        return opCode;
    }
    //Setter opCode
    public void setOpCode(char opCode){
        this.opCode = opCode;
    }



    public MathEquationMethodOverload() {}
    public MathEquationMethodOverload(char opCode){
        this.opCode = opCode;
    }
    public MathEquationMethodOverload(char opCode, double leftVal, double rightVal){
        this(opCode); // 1. goes to 1st constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        numberOfCalculations++;
        sumOfResults += result;
    }
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }

    public static double getAverageResult(){
        return sumOfResults / numberOfCalculations;
    }
}
