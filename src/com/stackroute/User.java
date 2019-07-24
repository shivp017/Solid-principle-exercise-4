package com.stackroute;

import java.util.Scanner;

public class User {

    public static void main(String args[]){
        System.out.println("Enter 1 for ON and 2 For OFF ");
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();
       Bulb obj=new Bulb();
        switch (input) {
            case 1:obj.bulbOn();
                break;
            case 2:
                obj.bulbOff();
                break;
            default:
                System.out.println("enter valid input or exit");
        }

    }
}

