package pl.maciejstarostecki.easy.Prime_T;

import java.util.Scanner;

/*

Sprawdź, które spośród danych liczb są liczbami pierwszymi

Input
n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]

Output
Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.

 */
public class Main {
    public static void main(String[] args) {

        // Inicjacja zmiennych
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isPrime;

        int n = Integer.parseInt(scanner.nextLine());

        //Wprowadzanie sprawdzanej liczby z przedziału [1..10000]
        for (int i = 0; i<n; i++) {

            number = Integer.parseInt(scanner.nextLine());
            isPrime = checkPrime(number);

            if (isPrime == true) System.out.println("TAK");
            else System.out.println("NIE");

            }
    }

    //metoda sprawdzająca, czy dana liczba jest liczbą pierwszą
    public static boolean checkPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i < (number/2) + 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}