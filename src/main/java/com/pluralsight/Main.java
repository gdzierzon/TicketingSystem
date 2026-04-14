package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    static void main()
    {

        // get user input
        Reservation theReservation = getReservationDetails();


        // display user output
        displayReservationConfirmation(theReservation);


    }

    // get all user input for the reservation
    static Reservation getReservationDetails()
    {
        Reservation theReservation = new Reservation();

        // ask for user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        theReservation.setName(name);

        // ask for reservation date
        System.out.print("Enter the reservation date (yyyy-mm-dd): ");
        String dateInput = scanner.nextLine();
        LocalDate reservationDate = LocalDate.parse(dateInput);
        theReservation.setReservationDate(reservationDate);


        // ask for number of tickets
        System.out.print("Enter the number of tickets you need ($9.95 each): ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();
        theReservation.setNumberOfTickets(numberOfTickets);

        return theReservation;

    }

    static void displayReservationConfirmation(Reservation theReservation)
    {
        String ticketLabel = (theReservation.getNumberOfTickets() > 1)
                ? "Tickets:"
                : "Ticket:";

        System.out.println();
        System.out.println("Reservation Details");
        System.out.println("---------------------------------------");
        System.out.printf("Name:               %s \n", theReservation.getName());
        System.out.printf("Reservation Date:   %tD \n", theReservation.getReservationDate());
        System.out.println("Cost per Ticket:    $ 9.95");
        System.out.printf("%-8s            %d \n", ticketLabel, theReservation.getNumberOfTickets());
        System.out.printf("Total Cost:         $ %.2f \n", theReservation.getReservationTotal());
    }
}
