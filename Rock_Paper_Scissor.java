package com.Mak;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        //generating random no.

        int a = ran.nextInt(3);

        //printing basic rules and structure

        System.out.println("Play Rock, Paper and Scissor With Computer.");
        System.out.println("");
        System.out.println("For");
        System.out.println("Rock : Choose '0'");
        System.out.println("Paper : Choose '1'");
        System.out.println("Scissor : Choose '2'");

        // Taking Input From User

        int inp = scan.nextInt();

        switch(inp) {
            case 0 :
                // code block
                System.out.println("You choose Rock.");
                break;
            case 1:
                // code block
                System.out.println("You choose Paper.");
                break;
            default:
                // code block
                System.out.println("You choose Scissor.");
        }


        // code for random no. output
        switch(a) {
            case 0 :
                // code block
                System.out.println("Computer chooses Rock.");
                break;
            case 1:
                // code block
                System.out.println("Computer chooses Paper.");
                break;
            default:
                // code block
                System.out.println("Computer chooses Scissor.");
        }
        System.out.println("");
        // code for checking

        if (inp==0 && a==0) {
            System.out.println("Match Tie :|");
        }
        else if(inp==0 && a==1) {
            System.out.println("Computer Defeated You :(");
        }
        else if (inp==0 && a==2) {
            System.out.println("You Won :)");
        }
        else if (inp==1 && a==0) {
            System.out.println("You Won :)");
        }
        else if(inp==1 && a==1) {
            System.out.println("Match Tie :|");
        }
        else if (inp==1 && a==2) {
            System.out.println("Computer Defeated You :(");
        }
        else if (inp==2 && a==0) {
            System.out.println("Computer Defeated You :(");
        }
        else if(inp==2 && a==1) {
            System.out.println("You Won :)");
        }
        else if (inp==2 && a==2) {
            System.out.println("Match Tie :|");
        }

    }
}
