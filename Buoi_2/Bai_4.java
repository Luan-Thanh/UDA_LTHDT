package Buoi_2;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int c = 0, l = 0, n = 0, s = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++)
            if (64 < (int) str.charAt(i) && (int) str.charAt(i) < 91)
                c++;
            else if (96 < (int) str.charAt(i) && (int) str.charAt(i) < 123)
                l++;
            else if (47 < (int) str.charAt(i) && (int) str.charAt(i) < 58)
                n++;
            else if ((int) str.charAt(i) == 32)
                s++;

        System.out.println("Capital: " + c);
        System.out.println("Lowercase: " + l);
        System.out.println("Number: " + n);
        System.out.println("Space: " + s);

        sc.close();
    }
}