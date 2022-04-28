package Thi.De_1;

import java.util.Scanner;

public class BenhNhan implements IBenhNhan {

    private int ma;
    private String hoTen;
    private double tienThuoc;

    public static Scanner sc = new Scanner(System.in);

    public BenhNhan() {
    }

    public BenhNhan(int ma, String hoTen, double tienThuoc) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tienThuoc = tienThuoc;
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

    public double getTienThuoc() {
        return tienThuoc;
    }

    public void setTienThuoc(double tienThuoc) {
        this.tienThuoc = tienThuoc;
    }

    public void nhapBN() {
        System.out.print("Nhap ma: ");
        ma = sc.nextInt();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.next();
        System.out.print("Nhap tien thuoc: ");
        tienThuoc = sc.nextDouble();
    }

    @Override
    public double vienPhi() {

        return 0;
    }

}
