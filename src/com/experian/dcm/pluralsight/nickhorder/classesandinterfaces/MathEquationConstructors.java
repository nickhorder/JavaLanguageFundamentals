package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class MathEquationConstructors {

    //Field Definitions
    double leftVal;
    double rightVal;
    char opCode;

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

    double result;

  //  public MathEquationConstructors () {}
    public MathEquationConstructors(char opCode){

        this.opCode = opCode;
    }
    public MathEquationConstructors(char opCode, double leftVal, double rightVal){
        this(opCode); // 1. goes to 1st constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute() {
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
    }
}
