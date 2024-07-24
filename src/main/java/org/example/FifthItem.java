package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            items.add(input);
        }

        if (items.size() >= 5) {
            System.out.println("The fifth item in the list is: " + items.get(4));
        } else {
            System.out.println("Error message.");
        }

        scanner.close();
    }
}
