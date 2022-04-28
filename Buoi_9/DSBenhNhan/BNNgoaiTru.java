package Buoi_9.DSBenhNhan;

import java.util.Scanner;

public class BNNgoaiTru extends BenhNhan {
    private double phiKham, phiXetNghiem;

    public BNNgoaiTru() {
    }

    public BNNgoaiTru(String ma, String hoTen, double tienThuoc, double phiKham, double phiXetNghiem) {
        super(ma, hoTen, tienThuoc);
        this.phiKham = phiKham;
        this.phiXetNghiem = phiXetNghiem;
    }

    @Override
    public double vienPhi() {
        return phiKham + phiXetNghiem + tienThuoc;
    }

    public void nhapBNNgoaiTru() {
        System.out.println("Moi nhap thong tin benh nhan ngoai tru");
        nhapBN();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phi kham: ");
        phiKham = sc.nextDouble();
        System.out.print("Nhap phi xet nghiem: ");
        phiXetNghiem = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "BNNgoaiTru [ "
                + "Ma: " + ma + " - Ho ten: " + hoTen + " - Tien thuoc: " + tienThuoc + " - Phi kham: "
                + phiKham + " - Phi xet nghiem: " +
                phiXetNghiem + " - Vien phi: " +
                vienPhi() + " ]";
    }
}
