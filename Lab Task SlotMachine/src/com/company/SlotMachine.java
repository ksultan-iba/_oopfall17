package com.company;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
public class SlotMachine {



            public static final int INITIAL_CREDITS = 10; // a "constant" for the amount of credit a slot machines gives the user to start off

            // INSTANCE PROPERTIES HERE
            Dial[] dials = new Dial[3];;
            int credit;

            //  Constructor initializes the machine with 10 credits.
            public SlotMachine() {
                // initialize instance properties
                credit = INITIAL_CREDITS;
                for (int i = 0; i < 3; i++) {
                    dials[i] = new Dial();
                }
            }
            public int getBet() {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter a bet amount : ");
                String stringBet = scanner.next();
                int intBet = Integer.parseInt(stringBet);
                return intBet; }

               public void pullLever() {
                for (int i = 0; i < 3; i++) {
                dials[i].spin(); } }

                 public String readSlot() {
                  String image = "";
                 for (int i = 0; i < 3; i++) {
                    image =image + dials[i].getPicture();}
                 return image;    }

                  public int computeWinnings(int bet) {
                  if (dials[0].getValue() == dials[1].getValue() && dials[0].getValue() == dials[2].getValue() && dials[1].getValue() == dials[2].getValue()) {
                  return bet;
                  } else if (dials[0].getValue() == dials[1].getValue() || dials[0].getValue() == dials[2].getValue() || dials[1].getValue() == dials[2].getValue()) {
                 return 0;
                  } else {
                     return INITIAL_CREDITS - bet;
                  }}
                  public String finalresult() {
                String Success = "Won";
                String Lost = "You Lost";
                String NR = "You neigther won nor lost";
                if (dials[0].getValue() == dials[1].getValue() && dials[0].getValue() == dials[2].getValue() && dials[1].getValue() == dials[2].getValue()) {
                    return Success;
                } else if (dials[0].getValue() == dials[1].getValue() || dials[0].getValue() == dials[2].getValue() || dials[1].getValue() == dials[2].getValue()) {
                    return NR;}
                    else { return Lost; }
    }


    public static void main(String[] args) throws IOException {
                // declare a variable and assign it a new instance of a SlotMachine
        long start = System.currentTimeMillis();
                SlotMachine mySlot = new SlotMachine();
                int bet; // for the current bet value from the user
                System.out.println("Welcome to the Slot Machine!!!\nYou have " + mySlot.credit + " credits.\n");
                bet = mySlot.getBet();
                mySlot.pullLever();
                System.out.println(mySlot.readSlot());
                System.out.println(mySlot.finalresult());
                bet = mySlot.computeWinnings(bet);
                System.out.println("Remaing credits: " + bet);
        long end = System.currentTimeMillis();
        System.out.print("Execution time is " + (end-start) + " seconds");
            }


    }

