import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<t; i++) {
            String input = scanner.nextLine();
            String [] chars = input.split(" ");
            String resultString = "";
            int numberOfChars;

            if (chars[0].length() < chars[1].length()) numberOfChars = chars[0].length();
            else numberOfChars = chars[1].length();

            for (int j = 0; j < numberOfChars; j++) resultString += string_merge(chars[0].charAt(j), chars[1].charAt(j));

            System.out.println(resultString);

        }
    }

    public static String string_merge(char a, char b) {
        String merge = "";
        merge += String.valueOf(a);
        merge += String.valueOf(b);
        return merge;
    }
}
