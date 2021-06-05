package oop.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class PaintCalculator {
    public static void main(String[] args){

    Scanner scnr = new Scanner(System.in);
    System.out.print("What is the length of the ceiling? ");
        int length = scnr.nextInt();
    System.out.print("What is the width of the ceiling? ");
        int width = scnr.nextInt();
        int sqrft = (width*length);
        int gallons = ((sqrft / 350)+1);
    System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + sqrft +" square feet");
    }
}