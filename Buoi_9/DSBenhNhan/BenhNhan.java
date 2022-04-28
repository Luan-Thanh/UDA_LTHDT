package Buoi_9.DSBenhNhan;

import java.util.Scanner;

public class BenhNhan implements IBenhNhan {
    protected String ma;
    protected String hoTen;
    protected double tienThuoc;

    public BenhNhan() {
    }

    public BenhNhan(String ma, String hoTen, double tienThuoc) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tienThuoc = tienThuoc;
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

    public double getTienThuoc() {
        return tienThuoc;
    }

    public void setTienThuoc(double tienThuoc) {
        this.tienThuoc = tienThuoc;
    }

    @Override
    public double vienPhi() {
        return 0;
    }

    @Override
    public String toString() {
        return "BenhNhan [hoTen=" + hoTen + ", ma=" + ma + ", tienThuoc=" + tienThuoc + "]";
    }

    public void nhapBN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma: ");
        ma = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tien thuoc: ");
        tienThuoc = sc.nextDouble();
    }
}
