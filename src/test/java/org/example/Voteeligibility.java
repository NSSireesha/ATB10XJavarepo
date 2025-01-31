package org.example;

import java.util.Scanner;

public class Voteeligibility {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter age");
       int age= sc.nextInt();

      String message= voteEligibility(age);
        System.out.println(message);

    }

    public static String voteEligibility(int age)
    {

        if (age>=18)
        {
            return " person is eligibile for voting";
        }

        else
        {
            return "not eligible";
        }
    }
}
