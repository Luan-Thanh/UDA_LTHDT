package Buoi_8.Cau_3;

import java.util.Scanner;

public class Xe {
    private String nhanHieu;
    private double gia;
    private int namSanXuat;

    public static Scanner sc = new Scanner(System.in);

    public Xe() {
    }

    public Xe(String nhanHieu, double gia, int namSanXuat) {
        this.nhanHieu = nhanHieu;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void nhapXe() {
        System.out.print("Nhap nhan hieu: ");
        nhanHieu = sc.next();
        System.out.print("Nhap gia: ");
        gia = sc.nextDouble();
        System.out.print("Nhap nam san xuat: ");
        namSanXuat = sc.nextInt();
    }

    public void inXe() {
        System.out.println("Nhan Hieu: " + nhanHieu + " - Gia: " + gia + " - Nam San Xuat: " + namSanXuat);
    }

    // @Override
    // public String toString() {
    // return ;
    // }

}
