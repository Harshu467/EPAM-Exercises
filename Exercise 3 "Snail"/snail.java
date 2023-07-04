package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        int a,b,h;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        h = sc.nextInt();
        sc.nextLine();
        int days = calculateDays(a,b,h);
        if(days==-1)
        {
            System.out.println("Impossible");
        }
        else{
            System.out.println(days);
        }
        sc.close();
    }
    private static int calculateDays(int a,int b,int h){
        int days = 0;
        int distance = 0;
        while(true)
        {
            days++;
            distance+=a;
            if(distance>=h)
            {
                return days;
            }
            distance-=b;
            if(distance<0)
            {
                return -1;
            }
        }
    }
}
