package com.epam.rd.autotasks.meetastranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner sc = new Scanner(System.in);
        int strangers = sc.nextInt();
        // Input Number of Strangers
        if(strangers==0) // Condition 1
        {
            System.out.println("Oh, it looks like there is no one here");
        }
        else if(strangers<0) // Condition 2
        {
            System.out.println("Seriously? Why so negative?");
        }
        else // Default Condition
        {
            for(int i=1;i<=strangers;i++) // Take input of names and print Hello name
            {
                String name = sc.next();
                System.out.println("Hello, "+name);
            }
        }    
        sc.close();    
    }
}
