package com.company;
import java.util.*;
public class Question1 {
/*
THis program will show the sum of all term preceding the input.
User will be asked to input his desired term and the Program will take sum of all the terms.
Later the sum will be displayed.
 */
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x;
	int sum = 0;
	System.out.println("Enter The Number");
	x = input.nextInt();
	if( x < 0){
        System.out.println("Enter a number grater then 0");
        x = input.nextInt();
    }
    for ( int i = 1; i <= x; i++){
	    sum= sum + i; }

        System.out.printf("The Sum is " + sum);


    }
}
