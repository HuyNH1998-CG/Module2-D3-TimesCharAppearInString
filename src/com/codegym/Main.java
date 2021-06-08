package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String toCheck = input.nextLine();
        System.out.println("Enter a character to find");
        char X = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < toCheck.length(); i++) {
            if (toCheck.charAt(i) == X) {
                count++;
            }
        }
        System.out.println( X + " Appear " + count + " Time");
    }
}
