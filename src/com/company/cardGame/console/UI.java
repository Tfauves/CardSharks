package com.company.cardGame.console;

import java.util.Scanner;

public class UI {
    public static final Scanner scanner = new Scanner(System.in);

    public int getInt(String prompt, int min, int max, String errMsg) {
        int option = min -1;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                option = Integer.parseInt(input);
            }catch (NumberFormatException err) {
                System.out.println(errMsg);
            }
        } while (option < min && option > max);

        return option;
    }

}
