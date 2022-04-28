package Buoi_6.Bt_Buoi6;

import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;

    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    @Override
    public String toString() {
        return "Account: [ So tai khoan: " + soTK + " - So tien trong TK: " + soTienTrongTK + " - Ten tai khoan: "
                + tenTK + " ]";
    }

    public double napTien() {
        double nap;

        System.out.print("Nhap so tien can nap: ");
        nap = sc.nextDouble();

        if (nap >= 0) {
            soTienTrongTK = nap + soTienTrongTK;
            System.out.println("Ban vua nap " + soTienTrongTK + "$ vao tai khoan.");
        } else {
            System.out.println("So tien nap khong hop le!");
        }
        return nap;
    }

    public double rutTien() {
        double phi = 5;
        double rut;

        System.out.print("Nhap so tien can rut: ");
        rut = sc.nextDouble();

        if (rut >= 0 && rut <= (soTienTrongTK - phi)) {
            soTienTrongTK = soTienTrongTK - (rut + phi);
            System.out.println("Ban vua rut " + soTienTrongTK + "$ tu tai khoan. Phi la $5.");
        } else {
            System.out.println("So tien rut KHONG hop le!");
            // return rutTien();
        }
        return rut;
    }

    public double daoHan() {
        double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
        System.out.println("Ban vua duoc " + soTienTrongTK + "$ tu dao han 1 thang.");
        return soTienTrongTK;
    }

    public double chuyenKhoan() {
        double chuyenKhoan;

        System.out.print("Nhap so tien can chuyen khoan: ");
        chuyenKhoan = sc.nextDouble();

        if (chuyenKhoan >= 0 && chuyenKhoan <= soTienTrongTK) {
            soTienTrongTK = soTienTrongTK - chuyenKhoan;
            System.out.println("Ban vua chuyen khoan " + soTienTrongTK + "$ vao tai khoan.");
        } else {
            System.out.println("So tien chuyen khoan khong hop le!");
        }
        return chuyenKhoan;
    }

    // public void inThongTinAcount() {
    // System.out.printf("%-10d %-20s %-10.3f %-10.3f %-10.3f %-10.3f %-10.3f \n",
    // soTK, tenTK, soTienTrongTK,
    // napTien(), rutTien(), daoHan(), chuyenKhoan());
    // }

    
}
