package Learn_LDHDT;

import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();
        person[] a = new person[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = new person();
            System.out.print("Enter name [" + i + "] = ");
            a[i].name = sc.next();
            System.out.print("Enter age [" + i + "] = ");
            a[i].age = sc.nextInt();
            System.out.print("Enter height [" + i + "] = ");
            a[i].height = sc.nextFloat();
            System.out.println();
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Name [" + i + "] is: " + a[i].name);
            System.out.println("Age [" + i + "] is: " + a[i].age);
            System.out.println("Height [" + i + "] is: " + a[i].height);
            System.out.println();
        }
    }
}
