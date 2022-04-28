package Buoi_1;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        int n1, n2;
        char math;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 = ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2 = ");
        n2 = sc.nextInt();

        System.out.print("Enter math: ");
        math = sc.next().charAt(0);

        switch (math) {
            case '+':
                System.out.println("Addition 2 numbers is: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Subtract of 2 numbers is: " + (n1 - n2));

                break;
            case '*':
                System.out.println("Multiplication of 2 numbers is: " + (n1 * n2));

                break;
            case '/':
                System.out.println("Division of 2 numbers is: " + (n1 / n2));

                break;
            default:
                System.out.println("ERROR!!");
                break;
        }

    }
}
