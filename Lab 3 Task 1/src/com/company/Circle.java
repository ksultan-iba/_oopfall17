package com.company;
import java.util.*;
public class Circle {
/*
This program wil generate output on the input theat is provided.
It can calculate area.
Later it can recalculate radius as well.


 */
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Components c = new Components();
        float x;
        double d;
        float temp;

        System.out.println("To input Radius press R");
        System.out.println("To input Diameter press D");
        System.out.println("To input Area press A");


        System.out.println("Enter your Character ");
        char s = in.next().charAt(0);
        System.out.println("********************************************************");


        System.out.println("For Output of Area input A");
        System.out.println("For Output of Diameter input D");
        System.out.println("For Output of Radius input R");


        System.out.println("Enter your Character ");
        char r = in.next().charAt(0);
        System.out.println("*******************************************************");
/*
Based upon user input it will be having three programs choices to execute.
As soon as the condition mathes it will proceed to that method.
 */
        if(s == 'R' && r == 'A'){
            System.out.println("Please enter our desired radius");
        c.setRadius(in.nextFloat());
            c.setArea(c.areaofcircle(c.getRadius(),s));
            System.out.println("The area of a circle with radius " + c.radius + " is ");
            System.out.printf("%.2f",  c.area) ;
        }

        else if(s == 'R' && r == 'D'){
            System.out.println("Please enter our desired radius");
            c.setRadius(in.nextFloat());
            c.setDiameter(c.getRadius()*2);
            System.out.println("The Diameter of a circle with radius " + c.radius + " is " );
            System.out.printf("%.2f",  c.diameter) ;
        }
        else if (s == 'D' && r == 'A' ){
            System.out.println("Please enter our desired Diameter");
            c.setDiameter(in.nextFloat());
            c.setArea(c.areaofcircle(c.getDiameter(),s));
            System.out.println("The area of a circle with diameter " + c.diameter + " is ");
            System.out.printf("%.2f",  c.area) ;
        }
        else if (s == 'D' && r == 'R' ){
            System.out.println("Please enter our desired Diameter");
            c.setDiameter(in.nextFloat());
            c.setRadius(c.getDiameter()/2);
            System.out.println("The radius of a circle with diameter " + c.diameter + " is ");
            System.out.printf("%.2f",  c.radius) ;
        }
        else if (s == 'A' && r == 'R'){
            System.out.println("Please enter our desired Area");
            c.setArea(in.nextDouble());
           // temp = (float)c.area;
            c.radiusofcircle(c.area);
            System.out.println("The radius of a circle with area " + c.area + " is ");
            System.out.printf("%.2f",  c.radius) ;
        }
        else {
            System.out.println("Please enter our desired Area");
            c.setArea(in.nextDouble());
            c.diamterofcircle(c.area);
            System.out.println("The radius of a circle with area " + c.area + " is ");
            System.out.printf("%.2f",  c.diameter) ;

        }


    }
}
