package Homework;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int temp;

    System.out.println("Please enter value for a");
    int a = in.nextInt();
    System.out.println("Please enter value for b");
    int b = in.nextInt();
    System.out.println("Please enter value for c");
    int c = in.nextInt();

    a=b;
    b=c;
    c=a;
    System.out.println("After swapping a =" + a +", b = "+ b+", c = " +c);

        int sum = a+b;
        System.out.println("Sum of a and b is: " + sum);
        int diff = sum - c;
        System.out.println("Difference between sum and c is: " + diff);
    }
}
