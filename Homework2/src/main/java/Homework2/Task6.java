package Homework2;
import java.util.Arrays;

//Дадени са два масива със стойности {1, 2, 3} и  {1, 2, 3} да се състави програма, която проверява дали масивите са еднакви
public class Task6 {
    public static boolean main(String[] args){
    int array1[]={1, 2, 3};
    int array2[]={1, 2, 3};

    int n=array1.length;
    int m=array2.length;

    System.out.println("Are the two arrays the same?");

    if (n!=m){
        return false;
    } else if (n == m) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i=0; i<n; i++)
            if (array1[i] != array2[i]) {
                return false;
            } else
                return true;
        }
        return false;
    }
}
