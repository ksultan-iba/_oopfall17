package com.company;
import java.util.*;
public class Question2 {

    public static void main(String[] args) {

       /*
       This program will give you the factor of the given number.
       The user will be asked to enter his desired number.
       Program using the for loop will find the factorial sum.
       The result will be displayed.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than or equal to 0: ");
        int x = scanner.nextInt();
        int fact=1;

        for (int i=1; i<=x;i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of the number is: "+fact);
    }
}
