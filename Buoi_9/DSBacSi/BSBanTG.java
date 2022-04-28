package Buoi_9.DSBacSi;

import java.util.Scanner;

public class BSBanTG extends BacSi {
    private double luongNgay;
    private int soNgayLamViec;

    public static Scanner sc = new Scanner(System.in);

    public BSBanTG() {
    }

    public BSBanTG(String ma, String hoTen, double mucLuong, double luongNgay, int soNgayLamViec) {
        super(ma, hoTen, mucLuong);
        this.luongNgay = luongNgay;
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double luongHangThang() {
        double phiPhiLuong;
        if (soNgayLamViec < 7)
            phiPhiLuong = 500;
        else
            phiPhiLuong = 1000;
        return (mucLuong * (30 / 100)) + (luongNgay + soNgayLamViec) + phiPhiLuong;
    }

    public void nhapBSBanTG() {
        nhapBS();
        System.out.print("Nhap luong ngay: ");
        luongNgay = sc.nextDouble();
        System.out.print("Nhap so ngay lam viec: ");
        soNgayLamViec = sc.nextInt();
    }

    @Override
    public String toString() {
        return "BSBanTG[ Ma: " + ma + " - Ho ten: " + hoTen + " - Muc luong: " + mucLuong + " - Luong ngay: "
                + luongNgay + " - So ngay lam viec: " + soNgayLamViec + " - Luong hang thang: " + luongHangThang();
    }
}
