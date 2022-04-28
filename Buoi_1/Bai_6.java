package Buoi_1;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = sc.nextDouble();
        System.out.print("Enter b = ");
        b = sc.nextDouble();
        System.out.print("Enter c = ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("First degree equation!!");
        } else {
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has 2 solutions: " + "x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("The quation has only 1 solution: x1 = x2 = " + x1);
            } else {
                System.out.println("The equation has no solution!!");
            }
        }
    }
}
