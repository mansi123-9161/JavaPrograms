package com.stackroot;

import java.util.*;

class Assignment10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("enter a string");
        int n = sc.nextInt();
        String result="";
        System.out.println("enter a number");
        String subString = str1.substring(n);
        for (int i = 0; i < n; i++) {

          result=result+subString;
        }
        System.out.println(str1+result);
    }

}
