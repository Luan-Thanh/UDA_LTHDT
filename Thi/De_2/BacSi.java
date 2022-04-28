package Thi.De_2;

import java.util.Scanner;

public class BacSi implements IBacSi {

    private int ma;
    private String hoTen;
    private double mucLuong;

    public static Scanner sc = new Scanner(System.in);

    public BacSi() {
    }

    public BacSi(int ma, String hoTen, double mucLuong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.mucLuong = mucLuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getmucLuong() {
        return mucLuong;
    }

    public void setmucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void nhapBS() {
        System.out.print("Nhap ma: ");
        ma = sc.nextInt();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.next();
        System.out.print("Nhap muc luong: ");
        mucLuong = sc.nextDouble();
    }

    @Override
    public double luongHangThang() {
        return 0;
    }

}
