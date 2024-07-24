package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        if (strings.isEmpty()) {
            System.out.println("Error message.");
        } else {
            String lastItem = strings.get(strings.size() - 1);
            System.out.println("The last item in the list is: " + lastItem);
        }

        scanner.close();
    }
}

