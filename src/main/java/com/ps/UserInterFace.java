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
                System.out.println("1) Enter name");
                System.out.println("2) Enter email");
                System.out.println("3) vehicle sold");
                System.out.println("4) vehicle price");
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
