import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int test=0; test<t; test++) {
            String temp = scanner.nextLine();
            String specs[] = temp.split(" ");
            double N = Integer.parseInt(specs[0]);
            double M = Integer.parseInt(specs[1]);
            double summaryCookies = 0;

            for (int i=0; i<N; i++)
                summaryCookies += 86400/Integer.parseInt(scanner.nextLine());

            System.out.println((int)Math.ceil(summaryCookies/M));
        }
    }
}