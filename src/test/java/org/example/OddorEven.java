package org.example;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter number1");
       int num1= sc.nextInt();


      if (num1 %2==0)
      {
          System.out.println("Even");
      }
      else
      {
          System.out.println("odd");
      }

    }
}
