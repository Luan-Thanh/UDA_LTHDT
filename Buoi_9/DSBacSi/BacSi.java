package Buoi_9.DSBacSi;

import java.util.Scanner;

public class BacSi implements IBacSi {
    protected String ma;
    protected String hoTen;
    protected double mucLuong;

    public static Scanner sc = new Scanner(System.in);

    public BacSi() {
    }

    public BacSi(String ma, String hoTen, double mucLuong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.mucLuong = mucLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void nhapBS() {
        System.out.print("Nhap ma: ");
        ma = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap muc luong: ");
        mucLuong = sc.nextDouble();
    }

    @Override
    public double luongHangThang() {
        return 0;
    }
}
