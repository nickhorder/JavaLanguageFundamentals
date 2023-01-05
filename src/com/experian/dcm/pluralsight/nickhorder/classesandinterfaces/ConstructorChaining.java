package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class ConstructorChaining {

    private int checkedBags;
    private int freeBags;
    public static double perBagFee;

    //Constructor's name is always the same as Class name
    public ConstructorChaining(int freeBags){
        this(freeBags > 1 ? 25.0d : 50.0d); //3. That constructor then does the
        //business logic to determine the perBagFee..
        this.freeBags = freeBags; //6. Then set value for freeBags
    }
    //1. If we create a new instance of this class passing in two values, we hit the
    //2nd listed constructor:
    public ConstructorChaining(int freeBags, int checkedBags){
        this(freeBags); //2. We then call the constructor that accepts a value only
                        // for freeBags.
        this.checkedBags = checkedBags; //7. And go back to our original
        // constructor to set the checkedBags
    }
    public ConstructorChaining(double perBagFee){ //4. Then calls the
        //constructor that receives the value for perBagFee
        this.perBagFee = perBagFee; //5. Set field for perBagFee
    }
/* Remember that each constructor has to have a unique parameter list. The Constructors
need to differ in the amount of variables they contain, or differ in the amount of data types
they ingest. "Unique signature" is another way of putting this.

 */

}
