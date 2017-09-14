package com.company;

import java.util.Scanner;
//bad programming; should have used an array to keep track of numbers.
public class Question5 {


    public static void main(String[] args) {
        /*
        This is a dice game;
        The system will take input of the numbere of rolls from the user.
        The loop will be initialed based upon the input.
        At the sametime the loop will store the number of result in their repective sums.
        At last, final loop will be initiated to display the stars against the sum of all the expected results.

         */

	    Scanner in = new Scanner(System.in);
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5= 0;
        int sum6= 0;
        int sum7= 0;
        int sum8= 0;
        int sum9= 0;
        int sum10= 0;
        int sum11= 0;
        int sum12= 0;

        System.out.println("Enter the number of rolls");
        int rolls = in.nextInt();
        for(int i = 0; i < rolls; i++){
        int dice1= (int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
		//what if both the numbers are 0?
        int sum= dice1 + dice2;

        if(sum==2){
            sum2 = sum2 + 1;}
            else if ( sum == 3){
            sum3= sum3+1;
        }
            else if ( sum == 4){
                sum4 = sum4 + 1;
        }
        else if (sum == 5){
                sum5 = sum5 + 1;
        }
        else if (sum==6){
            sum6 = sum6 + 1;
        }
        else if(sum == 7){
            sum7 = sum7 +1;
        }
        else if (sum ==8 ){
            sum8 = sum8 +1;
        }
        else if(sum==9){
            sum9 = sum9 +1;
        }
        else if (sum == 10){
            sum10 = sum10 + 1;
        }
        else if( sum == 11){
            sum11 = sum11 + 1;
        }
        else {sum12 = sum12+ 1;
        }
        }
        System.out.print("2| ");
        for(int j = 0; j < sum2; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("3| ");
        for(int j = 0; j < sum3; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("4| ");
        for(int j = 0; j < sum4; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("5| ");
        for(int j = 0; j < sum5; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("6| ");
        for(int j = 0; j < sum6; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("7| ");
        for(int j = 0; j < sum7; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("8| ");
        for(int j = 0; j < sum8; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("9| ");
        for(int j = 0; j < sum9; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("10| ");
        for(int j = 0; j < sum10; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("11| ");
        for(int j = 0; j < sum11; j++){
            System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
        System.out.print("12| ");
        for(int j = 0; j < sum12; j++){
            System.out.print("*");
            System.out.print(" ");

        }




    }


    }






