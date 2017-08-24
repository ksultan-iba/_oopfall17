package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String command = " In my grandmother’s trunk I packed ";
	String Temp;
	String[] objects = new String[4];
        BufferedReader in; // Input stream for strings
        in = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 1; i <= 5; i++){
            System.out.println("Player" + " " + i + " " + "Enter your object for the game");
            objects[i] = in.readLine();
            command = command + objects[i] ;
            System.out.println(command + ".");
            command = command + " " + "and" + " ";

        }

    }
}
