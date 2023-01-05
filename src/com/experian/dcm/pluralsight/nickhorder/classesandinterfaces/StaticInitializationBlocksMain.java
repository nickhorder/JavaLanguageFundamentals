package com.experian.dcm.pluralsight.nickhorder.classesandinterfaces;

public class StaticInitializationBlocksMain {
    // This could all be done by loops, but the only thing I wanted
    // to train on is Static Init Blocks (in StaticInitializationBlocks
    // class) so I'm just calling the addBooking method repeatedly.
    public static void main(String[] args) {
    StaticInitializationBlocks rugbyTeamBooking = new StaticInitializationBlocks(
            100);
        rugbyTeamBooking.addBooking();

        StaticInitializationBlocks eurovisionFansBooking = new StaticInitializationBlocks(
                50);
        eurovisionFansBooking.addBooking();

        StaticInitializationBlocks businessTeamBooking = new StaticInitializationBlocks(
                30);
        businessTeamBooking.addBooking();

        StaticInitializationBlocks ladsOnTourBooking = new StaticInitializationBlocks(
                20);
        ladsOnTourBooking.addBooking();

        StaticInitializationBlocks unluckyCoupleBooking = new StaticInitializationBlocks(
                2);
        unluckyCoupleBooking.addBooking();

    }
}
