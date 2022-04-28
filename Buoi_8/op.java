package Buoi_8;

import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        int N;
        System.out.println("Nhập vào N: ");
        Scanner keyboard = new Scanner(System.in);
        N = keyboard.nextInt();
        test[] std = new test[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập vào sinh viên thứ" + i);
            std[i] = new test();
            std[i].nhapvao();
        }

        // int temp = 0;
        // for (int i = 0; i < std.length; i++) {
        // for (int j = 0; j < std.length; j++) {
        // if (std[i]. < std[j].GioiTinh) {
        // temp = std[i].getGioiTinh();
        // std[i].getGioiTinh() = std[j].GioiTinh;
        // std[j].GioiTinh = temp;
        // }
        // }
        // }

        for (int i = 0; i < N; i++) {
            std[i].xuat();
        }
    }
}
