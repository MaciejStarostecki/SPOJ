package pl.maciejstarostecki.easy.PP0501A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<N; i++) {
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            int result = nwd(a,b);
            System.out.println(result);
        }
    }

    public static int nwd(int p, int q) {
        if (q == 0) return p;
        else return nwd(q, p % q);
    }
}