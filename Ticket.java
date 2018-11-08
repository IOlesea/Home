package com.company;

import java.util.Scanner;

public class Ticket {


       static void winerTicket() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please, enter the number ticket: ");
        int ticket = scaner.nextInt();
        printMessage(ticket);
         }

        static void printMessage(int ticket) {
            if (ticket % 19 == 0) {
                System.out.println("You WON!!!");
                return;}
                 System.out.println("Not this time... Try another one");
            }
    }
