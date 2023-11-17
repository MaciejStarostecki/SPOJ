package pl.maciejstarostecki.easy.FLAMASTE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int C = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < C; i++) {
            String string = scanner.nextLine();
            String newString = "";
            int chCount = 1, j = 0;
            while (j < string.length()) {
                char presentChar = string.charAt(j);
                j++;
                for (; j < string.length() && string.charAt(j) == presentChar; j++) chCount++;
                if (chCount < 3) {
                    if (chCount == 2) newString += presentChar;
                    newString += presentChar;
                }
                else {
                    newString += presentChar+String.valueOf(chCount);
                }

                chCount = 1;
            }
            System.out.println(newString);
        }
    }
}