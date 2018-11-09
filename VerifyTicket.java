package com.company;

import java.util.Scanner;

public class VerifyTicket {

        static void printMessage(int ticket) {
        if ( ticket % 19 == 0) {
            System.out.println("You WON!!!");
            return;}
            System.out.println("Not this time... Try another one");
    }
}
