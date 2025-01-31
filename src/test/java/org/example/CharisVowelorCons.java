package org.example;

import java.util.Scanner;

public class CharisVowelorCons {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter char");
        char c=sc.next().charAt(0);


        if (c =='a' || c=='e' || c=='i' || c=='o' || c== 'u')
        {
            System.out.println("char is vowel");
        }
        else if (c >= 'a' && c <= 'z')

        {
            System.out.println("char is consonent");
        }
    }
}
