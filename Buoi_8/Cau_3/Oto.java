package Buoi_8.Cau_3;

import java.util.Scanner;

import Buoi_4.nguoi;

public class Oto extends Xe {
    private int soCho;
    private double trongTai;

    public static Scanner sc = new Scanner(System.in);

    public Oto() {
    }

    public Oto(String nhanHieu, double gia, int namSanXuat) {
        super(nhanHieu, gia, namSanXuat);
    }

    public Oto(int soCho, double trongTai) {
        this.soCho = soCho;
        this.trongTai = trongTai;
    }

    public Oto(String nhanHieu, double gia, int namSanXuat, int soCho, double trongTai) {
        super(nhanHieu, gia, namSanXuat);
        this.soCho = soCho;
        this.trongTai = trongTai;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public void nhapOto() {
        System.out.print("Nhap so cho: ");
        soCho = sc.nextInt();
        System.out.print("Nhap trong tai: ");
        trongTai = sc.nextDouble();
    }

    public void inOto() {
        System.out.println("Nhan hieu: " + getNhanHieu() + " - Gia: " + getGia() + " - Nam san xuat: " + getNamSanXuat()
                + " - So Cho: " + soCho + " - Trong Tai: " + trongTai);
    }

    public void inOto1k() {
        if (trongTai > 1000) {
            System.out.println(
                    "Nhan hieu: " + getNhanHieu() + " - Gia: " + getGia() + " - Nam san xuat: " + getNamSanXuat()
                            + " - So Cho: " + soCho + " - Trong Tai: " + trongTai);
        }
    }

    public void inOtoKIA() {
        if (getNhanHieu().equals("KIA")) {
            System.out.println(
                    "Nhan hieu: " + getNhanHieu() + " - Gia: " + getGia() + " - Nam san xuat: " + getNamSanXuat()
                            + " - So Cho: " + soCho + " - Trong Tai: " + trongTai);
        }
    }
}
