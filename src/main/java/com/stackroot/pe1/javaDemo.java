package com.stackroot.pe1;

public class javaDemo {
    public String concatAndUpperCase(String str1, String str2){
        if(str1==null || str2==null)
        {
            return ("null not allowed");
        }
        String concatenaedString=str1.concat(str2);
        return concatenaedString.toUpperCase();
    }
    public String reverseString(String str){
        //int lengthOfString=str.length();
        String result="";
        if(str==null)
        {
            return "enter not null string";
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            result=result+str.charAt(i);
        }
        return result;


    }
}
