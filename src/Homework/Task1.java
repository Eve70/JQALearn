package Homework;

import java.util.Scanner;

public class Task1 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter first number");
        int i = in.nextInt();
        System.out.println("The number you entered is " + i);

        System.out.println("Please enter second number");
        int d = in.nextInt();
        System.out.println("The number you entered is " + d);

        System.out.println("Please enter third number");
        int f = in.nextInt();

        if (i<f && f<d || i>f && f>d) {
            System.out.println("Third number is between first and second numbers");
        }
        else{
            System.out.println("Third number isn't between first and second numbers");
        }
    }
}