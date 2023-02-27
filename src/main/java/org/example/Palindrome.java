package org.example;

public class Palindrome {

    public static char[] reword(String inputString) {
        char[] strToChar =inputString.toCharArray();
        char[] a=new char[strToChar.length];

        for (int i = a.length-1;i>=0;i--){
            a[i]=strToChar[(a.length-1)-i];
        }
      return a;
    }
}
