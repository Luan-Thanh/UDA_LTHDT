package Thi.De_2;

import java.util.Scanner;

public class BSToanTG extends BacSi {
    private double phiKham, phiXetNghiem;

    public static Scanner sc = new Scanner(System.in);

    public BSToanTG() {
    }

    public BSToanTG(double phiKham, double phiXetNghiem) {
        this.phiKham = phiKham;
        this.phiXetNghiem = phiXetNghiem;
    }

    public BSToanTG(int ma, String hoTen, double mucLuong, double phiKham, double phiXetNghiem) {
        super(ma, hoTen, mucLuong);
        this.phiKham = phiKham;
        this.phiXetNghiem = phiXetNghiem;
    }

    @Override
    public double luongHangThang() {
        return phiKham + phiXetNghiem + getmucLuong();
    }

    public void nhapBSToanTG() {
        System.out.print("Nhap phi kham: ");
        phiKham = sc.nextDouble();
        System.out.print("Nhap phi xet nghiem: ");
        phiXetNghiem = sc.nextDouble();
    }

    public void inBSToanTG() {
        System.out.println(
                "Ma: " + getMa() + " - Ho ten: " + getHoTen() + " - Muc luong: " + getmucLuong() + " - Phi kham: "
                        + phiKham + " - Phi xet nghiem: " +
                        phiXetNghiem + " - Luong hang thang: " +
                        luongHangThang());
    }
}
