package oop.example;
import java.util.Scanner;
public class PizzaParty {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = scnr.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzacount = scnr.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesperpizza = scnr.nextInt();
        int totalslices = (slicesperpizza*pizzacount);
        int slicesperperson = (totalslices/people);
        int leftover = (totalslices % people);
        System.out.println( people + " people with " + pizzacount + " pizzas ("  +totalslices+ ") slices" );
        System.out.println("Each person gets " + (slicesperperson) + " piece(s) of pizza.");
        System.out.print("There are " + leftover + " leftover pieces.");
    }
}
