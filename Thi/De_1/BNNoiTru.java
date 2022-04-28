package Thi.De_1;

import java.util.Scanner;

public class BNNoiTru extends BenhNhan {
    private double phiNgay;
    private int soNgayNamVien;

    public static Scanner sc = new Scanner(System.in);

    public BNNoiTru() {
    }

    public BNNoiTru(int ma, String hoTen, double tienThuoc, double phiNgay, int soNgayNamVien) {
        super(ma, hoTen, tienThuoc);
        this.phiNgay = phiNgay;
        this.soNgayNamVien = soNgayNamVien;
    }

    public void nhapBNNoiTru() {
        System.out.print("Nhap phi ngay: ");
        phiNgay = sc.nextDouble();
        System.out.print("Nhap so ngay nam vien: ");
        soNgayNamVien = sc.nextInt();
    }

    public void inBNNoiTru() {
        System.out.println(
                "Ma: " + getMa() + " - Ho ten: " + getHoTen() + " - Tien thuoc: " + getTienThuoc() + " - Phi ngay: "
                        + phiNgay + " - So ngay nam vien: " +
                        soNgayNamVien + " - Vien phi: " +
                        vienPhi());
    }

    @Override
    public double vienPhi() {
        int phuPhi = 0;

        if (soNgayNamVien < 10) {
            phuPhi = 50;
        } else if (soNgayNamVien >= 10) {
            phuPhi = 100;

        }
        return (getTienThuoc() * soNgayNamVien) + (phiNgay * soNgayNamVien) + phuPhi;

    }

}
