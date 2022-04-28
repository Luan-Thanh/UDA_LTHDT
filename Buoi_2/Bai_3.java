package Buoi_2;

import java.util.Scanner;

public class Bai_3 {

    public static Scanner sc = new Scanner(System.in);

    public static int getUserChoice() {
        boolean checkChoice = true;
        int choice = 0;
        System.out.println("===============================================");
        System.out.println("Press 1: Enter array");
        System.out.println("Press 2: Display array");
        System.out.println("Press 3: Element min array");
        System.out.println("Press 4: Element max odd array");
        System.out.println("Press 5: Sum max row array");
        System.out.println("Press 6: Quit");
        System.out.println("===============================================");

        do {
            try {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                checkChoice = true;
            } catch (Exception e) {
                System.out.println("ERROR!!");
                checkChoice = false;
                sc.nextLine();
            }
        } while (!checkChoice);

        return choice;
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        int userChoiceNumber;
        System.out.println("================== .M.E.N.U. ==================");

        int rows = 0, cols = 0;
        int[][] arr = new int[rows][cols];
        boolean checkInput = true;

        do {
            userChoiceNumber = getUserChoice();
            switch (userChoiceNumber) {
                case 1:
                    do {
                        try {
                            System.out.print("Enter rows = ");
                            rows = sc.nextInt();
                            System.out.print("Enter colums = ");
                            cols = sc.nextInt();
                            checkInput = true;
                        } catch (Exception e) {
                            System.out.println("ERROR!!");
                            checkInput = false;
                            sc.nextLine();
                        }
                    } while (!checkInput);
                    arr = enterArr(rows, cols);
                    break;
                case 2:
                    displayArr(rows, cols, arr);
                    break;
                case 3:
                    minArr(rows, cols, arr);
                    break;
                case 4:
                    maxOddArr(rows, cols, arr);
                    break;
                case 5:
                    sumMaxRow(rows, cols, arr);
                    break;
                case 6:
                    System.out.println("Press 8: Quit.");
                    return;
                default:
                    System.out.println("Invalid!!");
                    break;
            }
        } while (userChoiceNumber >= 1 && userChoiceNumber <= 6);
    }

    private static void sumMaxRow(int rows, int cols, int[][] arr) {
        int sumRow = 0, rowMax = 0, sumMaxRow = 0;

        for (int i = 0; i < rows; i++) {
            sumMaxRow = arr[i][0];
            sumRow = 0;

            for (int j = 0; j < cols; j++) {
                sumRow += arr[i][j];
                arr[i][j] = sumRow;
            }
            if (sumRow > sumMaxRow) {
                sumMaxRow = sumRow;
                rowMax = i + 1;
            }
        }
        System.out.println("Sum row max is " + sumMaxRow + " in " + rowMax);
    }

    private static void maxOddArr(int rows, int cols, int[][] arr) {
        int maxOdd = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 != 0 && maxOdd < arr[i][j])
                    maxOdd = arr[i][j];
            }
        }
        System.out.println("Element max odd array is: " + maxOdd);
    }

    private static void minArr(int rows, int cols, int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (min > arr[i][j])
                    min = arr[i][j];
            }
        }
        System.out.println("Element min array is: " + min);
    }

    private static void displayArr(int rows, int cols, int[][] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t"); // tab 1 khoảng
            }

            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
    }

    private static int[][] enterArr(int rows, int cols) {
        boolean checkInput;
        System.out.println("Enter array:");
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                do {
                    try {
                        System.out.print("Enter element [" + i + "][" + j + "] = ");
                        arr[i][j] = sc.nextInt();
                        checkInput = true;
                    } catch (Exception e) {
                        System.out.println("ERROR!!");
                        checkInput = false;
                        sc.nextLine();
                    }
                } while (!checkInput);
            }
        }
        return arr;
    }
}
