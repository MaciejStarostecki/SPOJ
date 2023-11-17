package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int D = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < D; i++) {
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            int a = Integer.parseInt(numbers[0])%10;
            int b = Integer.parseInt(numbers[1]);
            if (b > 0) {
                if (b%4==0) b=4;
                else b = b%4;
                int wynik = a;
                for (int j = 1; j<b; j++) {
                    wynik *= a;
                }
                System.out.println(wynik % 10);
            }
            else System.out.println("1");


        }
    }
}
