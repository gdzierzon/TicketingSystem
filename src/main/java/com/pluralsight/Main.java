package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    static void main()
    {
        final double TICKET_PRICE = 9.95;

        // **********************************
        // get reservation info from user
        // **********************************

        // ask for user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // ask for reservation date
        System.out.print("Enter the reservation date (yyyy-mm-dd): ");
        String dateInput = scanner.nextLine();
        LocalDate resrvationDate = LocalDate.parse(dateInput);

        // ask for number of tickets
        System.out.print("Enter the number of tickets you need ($9.95 each): ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();


        // **********************************
        // Calculate ticket cost etc
        // **********************************

        // calculate price
        double reservationTotal = numberOfTickets * TICKET_PRICE;
        String ticketLabel = (numberOfTickets > 1)
                                ? "Tickets:"
                                : "Ticket:";


        // **********************************
        // display reservation /confirmation info
        // **********************************

        System.out.println();
        System.out.println("Reservation Details");
        System.out.println("---------------------------------------");
        System.out.printf("Name:               %s \n", name);
        System.out.printf("Reservation Date:   %tD \n", resrvationDate);
        System.out.println("Cost per Ticket:    $ 9.95");
        System.out.printf("%-8s            %d \n", ticketLabel, numberOfTickets);
        System.out.printf("Total Cost:         $ %.2f \n", reservationTotal);


    }
}
