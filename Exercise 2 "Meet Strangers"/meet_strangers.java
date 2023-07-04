package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        // Write a program, asks for a number - amount of strangers to meet.
        // Then reads stranger names line by line and prints line by line "Hello, ...".
        // Write a program, which read a String from System.in and print "Hello, <input
        // string>"
        Scanner sc = new Scanner(System.in);
        int strangers = sc.nextInt();
        sc.nextLine();
        // Input Number of Strangers
        if (strangers == 0) // Condition 1
        {
            System.out.println("Oh, it looks like there is no one here");
        } else if (strangers < 0) // Condition 2
        {
            System.out.println("Seriously? Why so negative?");
        } else // Default Condition
        {
            for (int i = 1; i <= strangers; i++) // Take input of names and print Hello name
            {
                String name = sc.nextLine();
                System.out.println("Hello, " + name);
            }
        }
        sc.close();
    }
}
