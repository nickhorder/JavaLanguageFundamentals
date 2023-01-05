package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class Constructors {

    long circumferenceInMiles; //default value of 0
//    long circumferenceInMiles = 24901; Will be 24901 when we call class

    // Constructors
    // Code that runs during object creation
    private int checkedBags;
    public int passengers;
    private int freeBags;
    private double perBagFee;

    //Getter getCheckedBags
    public int getCheckedBags() {
        return checkedBags;
    }
    //Setter
   public void setCheckedBags(int checkedBags){
       this.checkedBags = checkedBags;
   }
    //Getter freeBags
    public int freeBags() {

        return freeBags;
    }
    //Setter
    public void getfreeBags (int freeBags){

        this.freeBags = freeBags;
    }
    public Constructors(int freeBags){
        this.freeBags = freeBags;
    }
    public Constructors () {}

 //   public () {} //Empty constructor allows class to
    // be created without passing arguments. This is a Default Constructor.
    // Java only does this if a Class contains no constructor at all.
    // If you include one or more, args will then need to be passed.
    // Unless, you explicitly provide a Default Constructor - as I have
    // done above in comment.

}
