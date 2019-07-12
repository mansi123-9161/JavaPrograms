package com.stackroot;
import java.util.Scanner;

class Assignment8 {
    public static void main(String args[]) {
       /* int  first, last, middle, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");


        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < search )
                first = middle + 1;
            else if ( array[middle] == search )
            {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            }
            else
                last = middle - 1;

            middle = (first + last)/2;
        }
        if (first > last)
            System.out.println(search + " isn't present in the list.\n");*/
        int num = 54;
        int input;
        boolean guess = false;
        System.out.println("guess a number");
        Scanner sc = new Scanner(System.in);
      //  int input = sc.nextInt();
        while (guess == false) {
          //  System.out.println("you guessed wrong !!! please enter again");
            input = sc.nextInt();

            if (input <100 && input > 0) {
                if (input == num) {
                    System.out.println("you guessed right!!! congrats ");
                    guess = true;
                } else if (input > num) {
                    System.out.println("you guessed wrong !!! input is greater than number");
                } else if (input < num) {
                    System.out.println("you guessed wrong !!! input is lesser than number");
                } else {
                    System.out.println("you guessed right!!! congrats please enter again input out of range");
                }
            }
        }


    }
}