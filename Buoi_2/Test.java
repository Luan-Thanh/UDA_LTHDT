package Buoi_2;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String traLoi;
        do {
            gameDoanSo();
            System.out.println("Ban muon tiep tuc khong: Y/N");
            traLoi = sc.nextLine();
        } while (!(traLoi.equals("n")) || (traLoi.equals("N")));
    }

    private static void gameDoanSo() {
        Random rd = new Random();
        int kq = rd.nextInt(101);
        // System.out.println("So random: " + kq);
        int soLan = 1;
        do {
            System.out.print("Nhap so: ");
            int soDoan = sc.nextInt();

            if (soDoan == kq) {
                System.out.println("So ban doan dung la: " + kq);
                break;
            } else if (soDoan > kq)
                System.out.println("So ban doan lon hon ket qua!");
            else
                System.out.println("So ban doan nho hon ket qua!");
            soLan++;
        } while (soLan <= 7);

        System.out.println("Game Over!!");
    }
}
