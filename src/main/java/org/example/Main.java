package org.example;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String dateTimeString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString);
        ZonedDateTime zonedDateTime = offsetDateTime.toZonedDateTime();

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        String fullDateTime = zonedDateTime.format(fullFormatter);
        String mediumDateTime = zonedDateTime.format(mediumFormatter);
        String shortDateTime = zonedDateTime.format(shortFormatter);

        System.out.println("Full format: " + fullDateTime);
        System.out.println("Medium format: " + mediumDateTime);
        System.out.println("Short format: " + shortDateTime);
    }
}