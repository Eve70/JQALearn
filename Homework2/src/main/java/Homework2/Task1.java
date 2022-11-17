package Homework2;

import java.util.Scanner;

public class Task1 {

    //defining method that takes 2 values and returns their sum
    public int Method() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for a :");
        int a = in.nextInt();
        System.out.println("Enter value for b :");
        int b = in.nextInt();
        System.out.println("The average of the two numbers is" +  ((a + b)/ 2));
        return a+b;
    }
    // calling the method to be executed
            public void main (String[] args){
            Method();
        }
}