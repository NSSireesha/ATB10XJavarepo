package org.example;

import java.util.Scanner;

public class GreaterNum {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter num1");
        int num1=sc.nextInt();

        int num2=sc.nextInt();

        greaternum(num1, num2);
    }

    public static void greaternum(int num1, int num2)
    {
        if (num1>num2)
        {
            System.out.println("greater num is" + num1);
        }
        else
        {
            System.out.println("greater num is "+ num2);
        }
    }
}
