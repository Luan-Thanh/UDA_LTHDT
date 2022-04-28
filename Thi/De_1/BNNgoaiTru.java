package Thi.De_1;

import java.util.Scanner;

public class BNNgoaiTru extends BenhNhan {
    private double phiKham, phiXetNghiem;

    public static Scanner sc = new Scanner(System.in);

    public BNNgoaiTru() {
    }

    public BNNgoaiTru(double phiKham, double phiXetNghiem) {
        this.phiKham = phiKham;
        this.phiXetNghiem = phiXetNghiem;
    }

    public BNNgoaiTru(int ma, String hoTen, double tienThuoc, double phiKham, double phiXetNghiem) {
        super(ma, hoTen, tienThuoc);
        this.phiKham = phiKham;
        this.phiXetNghiem = phiXetNghiem;
    }

    @Override
    public double vienPhi() {
        return phiKham + phiXetNghiem + getTienThuoc();
    }

    public void nhapBNNgoaiTru() {
        System.out.print("Nhap phi kham: ");
        phiKham = sc.nextDouble();
        System.out.print("Nhap phi xet nghiem: ");
        phiXetNghiem = sc.nextDouble();
    }

    public void inBNNgoaiTru() {
        System.out.println(
                "Ma: " + getMa() + " - Ho ten: " + getHoTen() + " - Tien thuoc: " + getTienThuoc() + " - Phi kham: "
                        + phiKham + " - Phi xet nghiem: " +
                        phiXetNghiem + " - Vien phi: " +
                        vienPhi());
    }
}
