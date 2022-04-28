package Buoi_2;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        char c = 'a';

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        do {
            try {
                System.out.print("Enter char: ");
                c = (char) sc.next().charAt(0);
                check = true;
            } catch (Exception e) {
                System.out.println("ERROR!!");
                check = false;
                sc.nextLine();
            }
        } while (!check);

        int conut = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c)
                conut++;

        System.out.print("Count char '" + c + "' : " + conut);

        sc.close();
    }
}
