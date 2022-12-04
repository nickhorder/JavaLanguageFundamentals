package com.experian.dcm.pluralsight.nickhorder.gettingstartedinjava11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// MORE ABOUT DATA FORMATS //

class MoreAboutDataFormats {
    public static void main(String[] args) {

        // Tracking Time of Events - interested in sequencing & timestamp
        // Local human-friendly time - date/time of day
        // Global human-friendly time. Above but diff time zones
        // Human Friendly Time
        // LocalTime is time of day = 09:15:10.000000
        // LocalDate = 2022-12-25
        // LocalDateTime = Date and Time of Day
        // ZonedDateTime = above but understands time zones

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter ukDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(ukDateFormat)); //03/12/2022

        String ukDateString = "03/12/2022";
        // LocalDate failedDate = LocalDate.parse(ukDateString);//Errors

        LocalDate theDate = LocalDate.parse(ukDateString, ukDateFormat);
        System.out.println(theDate);

        //PRIMITIVE TYPE WRAPPER CLASSES
        // Primitive types (i.e byte, short, double etc) refer only to data.
        // We can use Primitive Wrapper Classes to enhance primitive types. And
        // Enable functionality for richer aspects of Java type system.
        // Each primitive type has a wrapper class.


    }

    // Tracking Time of Events - Usually use Instant Class.
    static void checkRelationship(Instant otherInstant) {
        Instant nowInstant = Instant.now();
        if (otherInstant.compareTo(nowInstant) > 0)
            System.out.println("Instant is in the future");
        else if (otherInstant.compareTo(nowInstant) < 0)
            System.out.println("Instant is in the past");
        else
            System.out.println("Instant is now");
    }

}

