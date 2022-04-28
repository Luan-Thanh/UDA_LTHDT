package Thi.De_2;

import java.util.Scanner;

public class BSBanTG extends BacSi {
    private double luongNgay;
    private int soNgayLamViec;

    public static Scanner sc = new Scanner(System.in);

    public BSBanTG() {
    }

    public BSBanTG(int ma, String hoTen, double mucLuong, double luongNgay, int soNgayLamViec) {
        super(ma, hoTen, mucLuong);
        this.luongNgay = luongNgay;
        this.soNgayLamViec = soNgayLamViec;
    }

    public void nhapBSBanTG() {
        System.out.print("Nhap phi ngay: ");
        luongNgay = sc.nextDouble();
        System.out.print("Nhap so ngay nam vien: ");
        soNgayLamViec = sc.nextInt();
    }

    public void inBSBanTG() {
        System.out.println(
                "Ma: " + getMa() + " - Ho ten: " + getHoTen() + " - Muc luong: " + getmucLuong() + " - Phi ngay: "
                        + luongNgay + " - So ngay lam viec: " +
                        soNgayLamViec + " - Luong hang thang: " +
                        luongHangThang());
    }

    @Override
    public double luongHangThang() {
        int phuPhiLuong = 0;

        if (soNgayLamViec < 7) {
            phuPhiLuong = 500;
        } else if (soNgayLamViec >= 7) {
            phuPhiLuong = 1000;

        }
        return (getmucLuong() * (30 / 100)) + (luongNgay * soNgayLamViec) + phuPhiLuong;

    }

}
