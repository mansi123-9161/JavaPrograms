package com.stackroot.pe1;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter a number");
         int sum=0,sum1=0,r;
        String str=Integer.toString(n);
        String reverse = "";
        for(int i = str. length() - 1; i >= 0; i--) {
            reverse = reverse + str. charAt(i);
        }
        System.out.println("sorted number is:"+reverse);
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
            if(r%2==0)
            {
                sum1=sum1+r;
            }
        }
        System.out.println("sum of even number is:" +sum1);
        if(sum1>15){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
