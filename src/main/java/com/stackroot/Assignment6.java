package com.stackroot;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char m = sc.next().charAt(0);

            System.out.print("Enter any alphabet:");
            if(m >= 97 && m <= 123)
            {
                System.out.println("Lower Case");
            }
            else if(m >= 65 && m <= 96)
            {
                System.out.println("Upper Case");
            }
            else if(m >= 48 && m <= 57)
            {
                System.out.println("Digit");
            }
        }
    }


