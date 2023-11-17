import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<t; i++) {
            String input = scanner.nextLine();
            String [] stringNumbers = input.split(" ");
            int sizeOfTable = Integer.parseInt(stringNumbers[0]);
            for (int j=1; j<=sizeOfTable; j++) {
                System.out.printf("%d ",Integer.parseInt(stringNumbers[sizeOfTable-j+1]));
            }
            System.out.printf("\r\n");

        }
    }
}