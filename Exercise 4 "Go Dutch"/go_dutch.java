package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        int friends = sc.nextInt();
        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }
        int totalbill = bill+(bill*10/100);
        int each = totalbill/friends;
        System.out.println(each);
    }
}
