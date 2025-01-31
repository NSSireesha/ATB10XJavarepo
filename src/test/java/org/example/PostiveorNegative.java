package org.example;

import java.util.Scanner;

public class PostiveorNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

postiveorNegative( num);
    }

    public static void postiveorNegative(int num)
    {
        if (num>0)
        {
            System.out.println("positive");
        } else if (num<0) {
            System.out.println("negative");

        }
        else
        {
            System.out.println("number is 0");
        }
    }

}


