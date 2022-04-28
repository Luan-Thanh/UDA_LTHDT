package Buoi_8.Cau_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = sc.nextInt();

        SinhVien[] svs = new SinhVien[soLuong];
        for (int i = 0; i < svs.length; i++) {
            System.out.println("Nhap vao sinh vien thu [" + (i + 1) + "]: ");
            svs[i] = new SinhVien();
            svs[i].nhapNguoi();
            svs[i].nhapSv();
            System.out.println("-------------------------------------");
        }

        System.out.printf("%-20s %7s \t %7s \t %3s %5s \n", "Ho ten", "Gioi Tinh",
                "Ngay Sinh", "Diem Thi", "Lop");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < svs.length; i++) {
            svs[i].inSv();
        }
    }
}
