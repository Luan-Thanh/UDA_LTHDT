package Buoi_2;

import java.util.Random;
import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        int count = 7, check = 0, rd, restart, n = 0;
        boolean checkInput = true;

        Random rand = new Random();
        System.out.println(rand);
        Scanner sc = new Scanner(System.in);
        rd = rand.nextInt(100);

        while (true) {
            if (count == 0 || check == 1) {
                System.out.println("Do you want to play again?");
                System.out.print("Press 1: Play again/Press 0: Exit the game: ");
                restart = sc.nextInt();
                if (restart == 1) {
                    count = 7;
                    check = 0;
                    rd = rand.nextInt(10);

                } else
                    break;
            }
            do {
                try {
                    System.out.print("Enter n = ");
                    n = sc.nextInt();
                    checkInput = true;
                } catch (Exception e) {
                    System.out.println("ERROR!!");
                    checkInput = false;
                    sc.nextLine();
                }
            } while (!checkInput);

            count--;
            if (n == rd) {
                System.out.print("Successful!!");
                check = 1;
            } else if (n > rd)
                System.out.println("Bigger!! - Number of guesses: " + count);
            else
                System.out.println("Smaller!! - Number of guesses: " + count);
        }

        sc.close();
    }
}
