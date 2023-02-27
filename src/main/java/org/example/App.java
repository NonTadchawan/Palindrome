package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String inputString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String ");
        inputString=scanner.next();
        System.out.print(inputString+" ");
        System.out.print(Palindrome.reword(inputString));


    }
}
