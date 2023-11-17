package pl.maciejstarostecki.easy.BFN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int howManyTests = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<howManyTests; i++) {
            int howManyAdd = 0;
            int number = Integer.parseInt(scanner.nextLine());
            while (true) {
                int reversingNumber = reverse(number);
                if (reversingNumber == number) {
                    System.out.println(number+" "+howManyAdd);
                    break;
                }
                else number += reversingNumber;
                howManyAdd++;
            }
        }
    }

    public static int reverse(int number) {
        int result = 0;
        for (; number!=0; number/=10) {
            int temp = number % 10;
            result = result * 10 + temp;
        }
        return result;
    }
}