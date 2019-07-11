package com.stackroot;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        if(num<30 && num>20) {
            if (num % 2 == 0)
            {
                System.out.println("JERRY");
            }
            else
            {
                System.out.println("TOM");
            }
        }
        else
            System.out.println("nothing");

    }
}
