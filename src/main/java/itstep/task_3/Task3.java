package itstep.task_3;

import java.util.*;

public class Task3 {

//    V13.
//    Array Rotation: Write a Java program that takes an array of integers and rotates it by a given number of positions. Your program should prompt the user to enter the array size and the elements of the array, and then the number of positions to rotate the array. Finally, your program should output the rotated array.
//    Make LinkedList from the result array and performs the following operations: a) Add an element to the beginning of the list; b) Add an element to the end of the list; c) Remove the first element from the list; d) Remove the last element from the list; e) Print the elements of the list in reverse order;
//    Make up the situation for ArithmeticException. Catch it and display the explanation for your custom case.

    public static void main(String[] args) {
        System.out.print("Please enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Please enter the elements of array: ");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + ". ");
            arr[i - 1] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();

        arrayRotation(arr, n, scanner);
        linkedListOperations(arr, scanner);
        raisingArithmeticException();
    }

    private static void arrayRotation(Integer[] arr, int n, Scanner scanner){
        System.out.println("******************");
        System.out.println("* Array Rotation *");
        System.out.println("******************");

        System.out.print("Please enter the number of positions to rotate: ");
        int positions = scanner.nextInt();
        Integer[] tempArr = new Integer[positions];
        System.out.print("Please enter the direction of rotation (0 - left; 1 - right): ");
        boolean toRight = scanner.nextInt() > 0;
        if (toRight) {
            System.arraycopy(arr, n - positions, tempArr, 0, positions);
            System.arraycopy(arr, 0, arr, positions, n - positions);
            System.arraycopy(tempArr, 0, arr, 0, positions);
        } else {
            System.arraycopy(arr, 0, tempArr, 0, positions);
            System.arraycopy(arr, positions, arr, 0, n - positions);
            System.arraycopy(tempArr, 0, arr, n - positions, positions);
        }
        System.out.print("Rotated array: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    private static void linkedListOperations(Integer[] arr, Scanner scanner){
        System.out.println("*************************");
        System.out.println("* LinkedList Operations *");
        System.out.println("*************************");

        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(arr));
        System.out.print("LinkedList: ");
        System.out.println(l);

        System.out.print("Enter an element to add to the beginning of the list: ");
        l.addFirst(scanner.nextInt());
        System.out.println(l);

        System.out.print("Enter an element to add to the end of the list: ");
        l.addLast(scanner.nextInt());
        System.out.println(l);

        System.out.print("Removing the first element of the list: ");
        l.removeFirst();
        System.out.println(l);

        System.out.print("Removing the last element of the list: ");
        l.removeLast();
        System.out.println(l);

        System.out.print("List in reverse order: ");
        ListIterator<Integer> listIterator = l.listIterator(l.size());
        while (listIterator.hasPrevious()) System.out.print(listIterator.previous() + " ");
        System.out.println();
    }

    private static void raisingArithmeticException(){
        System.out.println("***********************");
        System.out.println("* ArithmeticException *");
        System.out.println("***********************");

        System.out.println("Divide 4 by 0");
        try {
            System.out.println(4 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Have caught " + e.getMessage());
        } finally {
            System.out.println("Still working after exception");
        }
    }
}
