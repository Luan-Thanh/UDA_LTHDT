package Buoi_2;

import java.util.Scanner;

public class Bai_2 {

    public static Scanner sc = new Scanner(System.in);

    public static int getUserChoice() {
        boolean checkChoice = true;
        int choice = 0;
        System.out.println("===============================================");
        System.out.println("Press 1: Enter array");
        System.out.println("Press 2: Display array");
        System.out.println("Press 3: Display value min and max in array");
        System.out.println("Press 4: Count number even");
        System.out.println("Press 5: Display number prime");
        System.out.println("Press 6: Display ascending order in array");
        System.out.println("Press 7: Display check element in array");
        System.out.println("Press 8: Quit");
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

        int size = 0;
        int[] arr = new int[size];

        boolean checkInput = true;

        do {
            userChoiceNumber = getUserChoice();
            switch (userChoiceNumber) {
                case 1:
                    do {
                        try {
                            System.out.print("Enter size array = ");
                            size = sc.nextInt();
                            checkInput = true;
                        } catch (Exception e) {
                            System.out.println("ERROR!!");
                            checkInput = false;
                            sc.nextLine();
                        }
                    } while (!checkInput);
                    arr = new int[size];
                    arr = elementArr(sc, size);
                    break;
                case 2:
                    displayNumArr(arr);
                    break;
                case 3:
                    displayMinMaxArr(arr);
                    break;
                case 4:
                    displayEven(arr);
                    break;
                case 5:
                    displayPrime(arr);
                    break;
                case 6:
                    displayOrderArr(arr);
                    break;
                case 7:
                    displayCheckArr(arr);
                    break;
                case 8:
                    System.out.println("Press 8: Quit.");
                    return;
                default:
                    System.out.println("Invalid!!");
                    break;
            }
        } while (userChoiceNumber >= 1 && userChoiceNumber <= 8);
    }

    private static void displayCheckArr(int[] arr) {
        boolean check = false;

        System.out.print("Enter check value = ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i])
                check = true;
        }

        System.out.println("Check value: " + check);
    }

    private static void displayOrderArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("Ascending order in array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    private static void displayMinMaxArr(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

            if (max < arr[i])
                max = arr[i];
        }

        System.out.println("Value min array is: " + min);
        System.out.println("Value max array is: " + max);
    }

    public static boolean isNumberPrime(int n) {
        boolean check = false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i == 0)) {
                count++;
            }
        }

        if (count == 2) {
            check = true;
        }
        return check;
    }

    private static void displayPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isNumberPrime(arr[i])) {
                System.out.println("Number " + arr[i] + " is Prime");
            }
        }
    }

    private static void displayEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number even: " + count);
    }

    // Dislay Number Array
    private static void displayNumArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // Enter Number
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
}
