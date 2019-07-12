package com.stackroot.pe1;

import java.util.*;

class Assignment10 {
    public String addingSubStringByNumber(String str, int n) {
        // str ="";
        System.out.println("enter a string");

        String result = "";
        System.out.println("enter a number");
        String subString = str.substring(n,str.length()).toUpperCase();
        for (int i = 0; i < n; i++) {

            result = result + subString;
        }
        //System.out.println(str1 + result);
        return str.toUpperCase()+result;
    }

}
