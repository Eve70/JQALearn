package Homework2;
//Да се състави масив със следните стойности {10 12 1 8 4}.
// След създаването на масива да се копират стойностите в нов масив
public class Task5 {
    public static void main(String[] args){
        int array1[]={10, 12, 1, 8, 4};
        // copy array1
        int array2[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
            array2[i] = array1[i];

        //print array2 (the copied array)
        System.out.println("Contents of array2[] ");
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");
    }
}
