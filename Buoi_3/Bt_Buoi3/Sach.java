package Buoi_3.Bt_Buoi3;

import java.util.Scanner;

public class Sach {
    private String tenSach;
    private String tacGia;
    private int soLuong;
    private int namXuatBan;

    public Sach() {

    }

    public Sach(String tenSach, String tacGia, int soLuong, int namXuatBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
        this.namXuatBan = namXuatBan;
    }

    public void nhapThongTinSach() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();

        System.out.print("Nhap nam san xuat: ");
        namXuatBan = sc.nextInt();

        sc.close();
    }

    public void inThongTinSach() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Thong tin sach: Ten sach: " + tenSach + ", Tac gia: " + tacGia + ", So luong: " + soLuong
                + ",  Nam xuat ban: " + namXuatBan;
    }
}
