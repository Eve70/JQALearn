package Homework;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many work hours for the day?");
        int workHours =in.nextInt();
        System.out.println("How much money do you have?");
        double money = in.nextDouble();
        System.out.println("Is it a holiday?");
        boolean isHoliday=in.nextBoolean();

        if(isHoliday==false){
            System.out.println("I will work!");
        }
        else if(money>0 && isHoliday==true){
            System.out.println("I will go to the cinema");
        }
        else if(money == 0){
            System.out.println("I will stay home and watch TV");
        }
        else if(isHoliday=true && money<10){
           System.out.println("I will have some ice-cream.");
        }
    }
}
