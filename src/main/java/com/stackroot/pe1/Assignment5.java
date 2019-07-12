package com.stackroot;
import java.util.Scanner;
class Assignment5{
    public static void main(String[] args){
        int total=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total numbers user want to enter");

        int  i=sc.nextInt();
        int [] num= new int[i];
        System.out.println("Please enter number");
        for (int j = 0; j < num.length; j++)
        {

            num[j] = sc.nextInt();

            total=total+num[j];

        }

        System.out.println("sum"+total);
    }
}


