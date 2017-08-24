package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String first; // Person’s first name
        String last; // Person’s last name
        String middle; // Person’s middle initial
        String firstLast; // Name in first-last format
        String lastFirst;// Name in last-first format
        String givenformat; //Task to do
        BufferedReader in; // Input stream for strings
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Name"); // Prompt for first name
        first = in.readLine(); // Get first name
        System.out.println("Enter last name: "); // Prompt for last name
        last = in.readLine(); // Get last name
        System.out.println("Enter middle initial:"); // Prompt for middle initial
        middle = in.readLine(); // Get middle initial
        firstLast = first + "" + last; // Generate first format
        System.out.println("Name in first-last format is " + firstLast);
        lastFirst = last + ", " + first + ","; // Generate second format
        System.out.println("Name in last-first-initial format is " + lastFirst + middle + ".");
        System.out.println("Name in First-name Middle-initial. Last-name format is ");
        System.out.println(newformat(first,missle,last));

    }

    /**
     *
     * @param first: It is the variable that will retrieve the first name of the user from the above method of the main class.
     * @param Middle: It is the variable that will retrieve the Middle initial of the user from the above method of the main class.
     * @param Last: It is the variable that will retrieve the Last Name of the user from the above method of the main class.
     * @return is used to display the complete string.
     */
    private static String newformat(String first,String Middle,String Last ){
        String Firstmiddleinitial = first + " " + Middle + "." + " " + Last;
        return Firstmiddleinital;

    }


}
