package pl.ml;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author pmatusiak
 */
public class Main {
    /**
     * Program ma za zadanie wylosować liczbę, a użytkownik ma ją zgadnąć.
     * Jeśli użytkownik poda mniejszą niż wylosowana - program wypisuje tekst "za mała liczba", jeśli poda większą wypisuje "za duża liczba".
     */

    static Random random = new Random();
    static int rand = random.nextInt(100) + 1;
    static int guessed;

    public static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            guessed = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Input number!");
        }
    }

    public static void main(String[] args) {
        inputNumber();
        while (guessed != rand) {
            if (guessed > rand){
                System.out.println("Too high!");
            } else if (guessed < rand) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You won!");
            }
            inputNumber();
        }
    }
}
