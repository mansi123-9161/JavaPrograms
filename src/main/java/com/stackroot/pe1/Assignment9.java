package com.stackroot.pe1;
import java.util.*;
public class Assignment9 {

    public String reverseString(String str)
        {
            String reverse = "";




            int length = str.length();

            for (int i = length - 1 ; i >= 0 ; i--)
                reverse = reverse + str.charAt(i);

           return reverse;
        }
    }

