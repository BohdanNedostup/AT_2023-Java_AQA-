package itstep.task_2;

public class Task2 {

    public static void main(String[] args) {
//  V 13: Int Arrays
//  Objective: To understand and use arrays with the int type in Java.
//  Instructions:
//  Declare and initialize an array of int.
//          Use a for loop to print the elements of the array to the console.
//          Use a for loop to find the number of odd in the array.

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        int[] arr = new int[]{1};

        System.out.println("Array: ");
        for (int i: arr) System.out.print(i + " ");
        System.out.println();

        int odds = 0;
        for (int i : arr)
            if (i % 2 != 0) odds++;
        System.out.println("Array has " + odds + " odd " + (odds > 1 ? "numbers" : "number"));
    }
}
