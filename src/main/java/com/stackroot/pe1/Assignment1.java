package com.stackroot.pe1;

import  java.util.Scanner;
class Assignment1{
    public String checkPalindromAndData(int number) {
        //Scanner sc=new Scanner(System.in);
        int r, sum = 0, temp;
        int sum1 = 0;
        //int n=sc.nextInt();

        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
            if (r % 2 == 0) {
                sum1 = sum1 + r;
            }
        }
        if ((temp == sum) && (sum1 > 25)) {
            return "the given number palindrome number and greater than 25";
        } else if ((temp == sum) && (sum1 < 25)) {
            return "the given number not palindrome and less than 25";}
           else {
            return "not palindrome";
        }
        }

    }
