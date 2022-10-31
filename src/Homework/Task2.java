package Homework;
import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
    Scanner in= new Scanner(System.in);

    System.out.println("Please enter value for a");
    int a = in.nextInt();
    System.out.println("Please enter value for b");
    int b = in.nextInt();
    System.out.println("Please enter value for c");
    double c = in.nextDouble();
    System.out.println("Please enter value for d");
    double d = in.nextDouble();

    a= (int) c;
    c= (double)a;
    b = (int) d;
    d = (double) b;

    System.out.println("The new value for a is :" + a);
    System.out.println("The new value for b is :" + b);
    System.out.println("The new value for c is :" + c);
    System.out.println("The new value for d is :" + d);

    }
}
