package org.example;

import java.util.ArrayList;

public class SumOfList {
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Hardcoding the numbers
        numbers.add(11);
        numbers.add(4);
        numbers.add(64);
        numbers.add(-22);
        numbers.add(-9);

        // Printing the items in the list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.print(" were the items in the list.");
            }
        }
        System.out.println();

        int sum = calculateSum(numbers);

        System.out.println("The sum of that list is: " + sum);
    }
}


