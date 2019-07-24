package com.stackroute;

import java.util.Scanner;

public class User {

    public static void main(String args[]) {
        int input;
        do {
            System.out.println("Enter 1 for ON, 2 For OFF and 0 to exit");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            Bulb obj = new Bulb();
            switch (input) {
                case 1:
                    obj.bulbOn();
                    break;
                case 2:
                    obj.bulbOff();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("enter valid input");
            }

        } while (input != 0);
    }
}

