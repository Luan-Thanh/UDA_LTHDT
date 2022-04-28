package Buoi_8.Cau_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong cu nhan: ");
        int soLuong = sc.nextInt();
        Nguoi[] ng = new Nguoi[soLuong];
        CuNhan[] cn = new CuNhan[soLuong];

        for (int i = 0; i < cn.length; i++) {
            System.out.println("Nhap cu nha thu [" + (i + 1) + "]: ");
            ng[i] = new Nguoi();
            ng[i].nhapNguoi();

            cn[i] = new CuNhan();
            cn[i].nhapCuNhan();
        }

        for (int i = 0; i < cn.length; i++) {
            ng[i].inNguoi();
            cn[i].inCuNhan();
        }
    }
}
