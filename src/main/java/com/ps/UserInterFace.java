package com.ps;

import java.util.Scanner;

public class UserInterFace {
    {
        private static Dealership dealership;
        private static Scanner commandScanner = new Scanner(System.in);


        private static Scanner inputScanner = new Scanner(System.in);

        private static void init () {
        zoo = FileManager.readZoo():


        public static void display () {
            init();

            int mainMenuCommand;
            do {
                System.out.println("what would you like to do");
                System.out.println("1) Add Animal");
                System.out.println("2) Remove Animal");
                System.out.println("3) Show Animals");
                System.out.println("4) Filter All Animals By Age Range");
                System.out.println("Command: ");

                switch (mainMenuCommand) {
                    case 1:
                        break;

                    case 0:
                        System.out.println("Exiting...");
                    default:
                        System.out.print("Invalid command, try again");
                }

            } while (mainMenuCommand != 0);
        }

    }
    }
}
