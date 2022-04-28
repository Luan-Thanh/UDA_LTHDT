package Buoi_2;

import java.util.Scanner;

public class Bai_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        n = sizeArr(sc, n);

        int[] arr = elementArr(sc, n);

        checkSumArr(sc, arr);

    }

    // Sum
    private static void checkSumArr(Scanner sc, int[] arr) {
        int x;
        boolean checkInput;
        do {
            try {
                System.out.print("Enter x = ");
                x = sc.nextInt();
                boolean check = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] + arr[i + 1] == x)
                        check = true;
                }
                System.out.println(check);
                checkInput = true;
            } catch (Exception e) {
                System.out.println("ERROR!!");
                checkInput = false;
                sc.nextLine();
            }
        } while (!checkInput);
    }

    // Element
    private static int[] elementArr(Scanner sc, int n) {
        boolean checkInput;
        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                try {
                    System.out.print("Enter element [" + i + "] = ");
                    arr[i] = sc.nextInt();
                    checkInput = true;
                } catch (Exception e) {
                    System.out.println("ERROR!!");
                    checkInput = false;
                    sc.nextLine();
                }
            } while (!checkInput);
        }
        return arr;
    }

    // Size
    private static int sizeArr(Scanner sc, int n) {
        boolean checkInput;
        do {
            try {
                System.out.print("Enter size array = ");
                n = sc.nextInt();
                checkInput = true;
            } catch (Exception e) {
                System.out.println("ERROR!!");
                checkInput = false;
                sc.nextLine();
            }
        } while (!checkInput);
        return n;
    }
}