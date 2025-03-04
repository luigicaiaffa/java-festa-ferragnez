package com.ferragnez.bonus;

import java.util.Scanner;

public class CheckGuestBonus {
    public static void main(String[] args) {
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", " J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = userInput.nextLine();
        userInput.close();

        boolean isGuestInvited = false;

        for (int i = 0; i < guests.length; i++) {
            if (guests[i].toLowerCase().equals(name.toLowerCase())) {
                isGuestInvited = true;
                name = guests[i];
                break;
            }
        }

        if (isGuestInvited) {
            System.out.println("Welcome, " + name + "!");
        } else {
            System.out.println("Sorry, " + name + ", you are not invited.");
        }
    }
}
