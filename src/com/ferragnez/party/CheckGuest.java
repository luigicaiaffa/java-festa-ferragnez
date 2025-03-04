package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
public static void main(String[] args) {
    String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", " J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
    
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = userInput.nextLine();
    userInput.close();

    boolean isGuestInvited = false;
    int i = 0;

    while (!isGuestInvited && i < guests.length) {
        if (guests[i].toLowerCase().equals(name.toLowerCase())) {
            isGuestInvited = true;
            name = guests[i];
        }
        i++;
    }

    if (isGuestInvited) {
        System.out.println("Welcome, " + name + "!");
    } else {
        System.out.println("Sorry, " + name + ", you are not invited.");
    }
}
}
