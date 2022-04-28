package Buoi_8.Cau_2;

import java.util.Scanner;

public class CuNhan extends Nguoi {
    private String nganhHoc;
    private int namTotNghiep;

    public static Scanner sc = new Scanner(System.in);

    public CuNhan() {
    }

    public CuNhan(String hoTen, String ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
    }

    public CuNhan(String nganhHoc, int namTotNghiep) {
        this.nganhHoc = nganhHoc;
        this.namTotNghiep = namTotNghiep;
    }

    public CuNhan(String hoTen, String ngaySinh, String queQuan, String nganhHoc, int namTotNghiep) {
        super(hoTen, ngaySinh, queQuan);
        this.nganhHoc = nganhHoc;
        this.namTotNghiep = namTotNghiep;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public int getNamTotNghiep() {
        return namTotNghiep;
    }

    public void setNamTotNghiep(int namTotNghiep) {
        this.namTotNghiep = namTotNghiep;
    }

    public void nhapCuNhan() {
        System.out.print("Nhap nganh hoc: ");
        nganhHoc = sc.next();

        System.out.print("Nhap nam tot nghiep: ");
        namTotNghiep = sc.nextInt();
    }

    public void inCuNhan() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CuNhan [namTotNghiep=" + namTotNghiep + ", nganhHoc=" + nganhHoc + "]";
    }

}
