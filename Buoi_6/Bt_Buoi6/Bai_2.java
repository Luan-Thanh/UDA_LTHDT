package Buoi_6.Bt_Buoi6;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(95194, "Le Thanh Luan", 8f, 7.8f);

        SinhVien sv2 = new SinhVien(99999, "Hoang Van A", 9.5f, 10);

        SinhVien sv3 = new SinhVien();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        sv3.setMaSV(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap ho ten sinh vien: ");
        sv3.setHoVaTen(sc.nextLine());

        System.out.print("Nhap diem ly thuyet: ");
        sv3.setDiemLT(sc.nextFloat());

        System.out.print("Nhap diem thuc hanh: ");
        sv3.setDiemTH(sc.nextFloat());

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        System.out.printf("%6s \t %-30s %8s %8s \t %7s \n", "Ma SV", "Ho Ten SV", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("----------------------------------------------------------------------------------");
        sv1.inThongTinVS();
        sv2.inThongTinVS();
        sv3.inThongTinVS();

    }
}
