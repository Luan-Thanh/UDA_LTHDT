package Buoi_8.Cau_1;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private double diemThi;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String gioiTinh, String ngaySinh) {
        super(hoTen, gioiTinh, ngaySinh);
    }

    public SinhVien(double diemThi, String lop) {
        if (diemThi > 0)
            this.diemThi = diemThi;
        else
            System.out.println("Xay ra loi!");
        this.lop = lop;
    }

    public SinhVien(String hoTen, String gioiTinh, String ngaySinh, double diemThi, String lop) {
        super(hoTen, gioiTinh, ngaySinh);
        if (diemThi > 0)
            this.diemThi = diemThi;
        else
            System.out.println("Xay ra loi!");
        this.lop = lop;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
        if (diemThi > 0)
            this.diemThi = diemThi;
        else
            System.out.println("Xay ra loi!");
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void nhapSv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem thi: ");
        diemThi = sc.nextDouble();
        System.out.print("Nhap lop: ");
        lop = sc.next();
    }

    public void inSv() {
        System.out.printf("%-20s %3s \t %10s \t %2.2f \t %10s \n", getHoTen(),
                getGioiTinh(), getNgaySinh(), diemThi,
                lop);
    }

    @Override
    public String toString() {
        return "Diem Thi: " + diemThi + " - Lop: " + lop;
    }

}
