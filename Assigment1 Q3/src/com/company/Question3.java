package com.company;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        //incorrect comments
      /*
Below is a nested loop that will display a 12 * 12 matrix

 */

       Scanner in = new Scanner(System.in);
       int[][] table = new int[13][13];
       System.out.println("Enter Your Number");
       int n;
       n = in.nextInt();


//missing displaying of numbers that are multiplied. 
        for(int i=1; i <= table.length-1; i++)
        {
            for (int j=1; j <= table[0].length-1; j++)
            {
                table[i][j] = i*j % n;
                if (table[i][j] < 10)
                    System.out.print("  " + table[i][j] + " ");
                else
                if (table[i][j] > 10 && table[i][j] < 100)
                    System.out.print(" " + table[i][j] + " ");
                else
                    System.out.print(table[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}

