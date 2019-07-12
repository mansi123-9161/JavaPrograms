package com.stackroot.pe1;
import java.util.Scanner;

class Assignment8 {
    public String guessTheNumber(int num) {
        int n = 54;
        boolean guess = false;
        String result="";

        //System.out.println("guess a number");
        //Scanner sc = new Scanner(System.in);
        //  int input = sc.nextInt();
        while (guess == false) {
            //  System.out.println("you guessed wrong !!! please enter again");
            //input = sc.nextInt();

            if ( num < 100 && num > 0) {
                if (n == num) {
                   result="you guessed right!!! congrats";
                    guess = true;
                } else if (n> num) {
                    result="you guessed wrong !!! input is greater than number";
                } else if (n < num) {
                    result="you guessed wrong !!! input is lesser than number";
                } else {
                 result ="you guessed right!!! congrats please enter again input out of range";
                }
            }
        }
        return result;

    }
}
