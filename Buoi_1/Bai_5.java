package Buoi_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        int a, b;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        a = sc.nextInt();
        System.out.print("Enter b = ");
        b = sc.nextInt();

        System.out.println(a + "x + " + b + " = 0");
        double x;
        if (a != 0) {
            x = (double) -b / a;
            System.out.println("x = " + decimalFormat.format(x));
        } else {
            System.out.println("ERROR!!");

        }
    }
}
