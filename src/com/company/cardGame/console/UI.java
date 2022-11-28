package com.company.cardGame.console;

import com.company.cardGame.cardSharks.Run;

import java.util.Scanner;

public class UI {
    public static final Scanner scanner = new Scanner(System.in);

    public static void showRunWithIndex(Run activeRun) {
        System.out.println(activeRun.displayRun());
        System.out.println("--------------------------------------------------------");
//        System.out.println("               Card Selection Index"                     );
        for (int i = 1; i < activeRun.getCards().size() + 1; i++) {
            System.out.print(i + "    ");
        }
    }

    public static void spaces() {
        int spaceCounter = 0;
        while (spaceCounter < 55) {

            System.out.println();
            spaceCounter++;
        }
    }
    public static int getInt(String prompt, int min, int max, String errMsg) {
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

    public static String getString(String prompt, boolean isRequired) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine();
            if (isRequired && input.length() == 0) {
                System.out.println("required input");
                continue;
            }
            break;

        } while(true);
        return input;
    }


}
