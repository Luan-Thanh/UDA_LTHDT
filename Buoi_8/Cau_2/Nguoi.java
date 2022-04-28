package Buoi_8.Cau_2;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public static Scanner sc = new Scanner(System.in);

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void nhapNguoi() {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.next();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.next();
        System.out.print("Nhap que quan: ");
        queQuan = sc.next();
    }

    public void inNguoi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Nguoi [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + "]";
    }

}
