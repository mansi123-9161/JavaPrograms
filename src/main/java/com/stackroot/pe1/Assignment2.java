package com.stackroot.pe1;

import java.util.Scanner;

public class Assignment2 {
    public String tomAndJerry(int num){
        //System.out.println("enter number");
        //Scanner sc=new Scanner(System.in);

       // int num=sc.nextInt();
        if(num<30 && num>20) {
            if (num % 2 == 0)
            {
                //System.out.println("JERRY");
                return "jerry";
            }
            else
            {
                //System.out.println("TOM");
                return "tom";
            }
        }
        else
            //System.out.println("nothing");

        return "out of bound value";

    }
}
