package com.pluralsight;

import java.time.LocalDate;

public class Reservation
{
    public static final double TICKET_PRICE = 9.95;

    private String name = "";
    private LocalDate reservationDate = LocalDate.now();
    private int numberOfTickets = 0;
    private double reservationTotal = 0;

    // getters allow read access to a variable
    public String getName()
    {
        return name;
    }
    // setters allow write access to a variable
    public void setName(String name)
    {
        // this.name refers to the class/instance variable (line 9)
        // name refers to the function local variable (line 20)
        this.name = name;
    }

    public LocalDate getReservationDate()
    {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate)
    {
        this.reservationDate = reservationDate;
    }

    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets)
    {
        // store the number of tickets
        this.numberOfTickets = numberOfTickets;

        // AND update the reservationTotal
        reservationTotal = numberOfTickets * TICKET_PRICE;
    }

    public double getReservationTotal()
    {
        return reservationTotal;
    }
}
