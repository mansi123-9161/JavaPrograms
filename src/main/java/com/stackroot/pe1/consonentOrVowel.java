package com.stackroot.pe1;

import java.util.Scanner;
import java.lang.*;
public class consonentOrVowel {
   // public String consonentOrVowel

    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
            {
              //  return ("vowel");
            } else
                {
              //  return("consonent");
                }
        }
    }
}