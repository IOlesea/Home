package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Ticket ticket = new Ticket();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please, enter the number ticket: ");
        int ticketNr = scaner.nextInt();
        ticket.setNumber(ticketNr);

        VerifyTicket.printMessage(ticketNr);
    }
}
