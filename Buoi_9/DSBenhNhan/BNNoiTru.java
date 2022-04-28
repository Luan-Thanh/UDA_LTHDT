package Buoi_9.DSBenhNhan;

import java.util.Scanner;

public class BNNoiTru extends BenhNhan {
    private double phiNgay;
    private int soNgayNamVien;

    public BNNoiTru() {
    }

    public BNNoiTru(String ma, String hoTen, double tienThuoc, double phiNgay, int soNgayNamVien) {
        super(ma, hoTen, tienThuoc);
        this.phiNgay = phiNgay;
        this.soNgayNamVien = soNgayNamVien;
    }

    @Override
    public double vienPhi() {
        double phuPhi;

        if (soNgayNamVien < 10)
            phuPhi = 50;
        else
            phuPhi = 100;

        return soNgayNamVien + (tienThuoc + phiNgay) + phuPhi;
    }

    public void nhapBNNoiTru() {
        System.out.println("Moi nhap thong tin benh nhan noi tru");
        nhapBN();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phi ngay: ");
        phiNgay = sc.nextDouble();
        System.out.print("Nhap so ngay nam vien: ");
        soNgayNamVien = sc.nextInt();
    }

    @Override
    public String toString() {
        return "BNNoiTru [ " + "Ma: " + ma + " - Ho ten: " + hoTen + " - Tien thuoc: " + tienThuoc + " - Phi ngay: "
                + phiNgay + " - So ngay nam vien: " +
                soNgayNamVien + " - Vien phi: " +
                vienPhi() + " ]";
    }

}
