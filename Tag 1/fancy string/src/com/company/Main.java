package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter phrase: ");
        String phrase = scan.nextLine();
        if (hasMoreThan(phrase)==true){
            System.out.println("Has more than  20 chars.");
        }
        else System.out.println("Has less than 20 chars.");
        System.out.println("Does the phrase contain 'fancy'? -" +containsFancy(phrase));
    }
    public static boolean hasMoreThan(String phrase){
        if (phrase.length()>20){
            return true;
        }
        else return false;
    }
    public static String containsFancy(String phrase){
        if (phrase.contains("fancy")) {
            return "Yay";
        }
        else return "Nay";
    }
}
