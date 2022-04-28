package Buoi_1;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = sc.nextDouble();
        System.out.print("Enter b = ");
        b = sc.nextDouble();
        System.out.print("Enter c = ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("These are the 3 sides of a triangle");
        else
            System.out.println("These aren't the 3 sides of a triangle");
    }
}
