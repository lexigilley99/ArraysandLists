package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Done entering integers to the list");

        System.out.println("What number are you looking for in the list?");
        int target = scanner.nextInt();

        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                indices.add(i);
            }
        }

        if (indices.isEmpty()) {
            System.out.println("Number not found in the list.");
        } else {
            System.out.print(target + " is at index ");
            for (int i = 0; i < indices.size(); i++) {
                System.out.print(indices.get(i));
                if (i < indices.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".");
        }

        scanner.close();
    }
}


