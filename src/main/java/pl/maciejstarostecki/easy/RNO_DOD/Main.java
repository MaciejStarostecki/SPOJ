package pl.maciejstarostecki.easy.RNO_DOD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int howManyTests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<howManyTests; i++) {
            int howManyNumbers = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            String[] stringNumbers = input.split(" ");
            int result = 0;

            for (int j=0; j<howManyNumbers; j++)
                result += Integer.parseInt(stringNumbers[j]);

            System.out.println(result);
        }
    }
}