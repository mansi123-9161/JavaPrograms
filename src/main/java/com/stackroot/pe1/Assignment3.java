package com.stackroot.pe1;

import java.util.Scanner;

public class Assignment3 {
    public String vowelOrConsonent(String input)
     {
         String result="";
       // Scanner sc = new Scanner(System.in);
       // String input=sc.next();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a' ||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            {
               result= "vowel";
            }
            else
            {
              result= "consonent";
            }
        }
        return result;

    }
}
