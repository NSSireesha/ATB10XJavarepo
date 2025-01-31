package org.example;

import java.util.Scanner;

public class pallindrome {

    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
     String str= sc.next();
     //madam--5
String rev="";
        for (int i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }

        System.out.println("reverse string is"+rev);

        if (str.equals(rev))
        {
            System.out.println("String is pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }
    }
}
