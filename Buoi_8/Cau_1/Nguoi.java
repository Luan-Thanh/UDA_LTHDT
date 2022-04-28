package Buoi_8.Cau_1;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;

    public static Scanner sc = new Scanner(System.in);

    public Nguoi() {
    }

    public Nguoi(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void nhapNguoi() {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
    }

    public void inNguoi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ho Ten: " + hoTen + " - Gioi Tinh: " + gioiTinh + " - Ngay Sinh: " + ngaySinh;
    }

}
