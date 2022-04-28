package Buoi_9.DSBacSi;

import java.util.Scanner;

public class BSToanTG extends BacSi {
    private double luongKham, luongXetNghiem;

    public static Scanner sc = new Scanner(System.in);

    public BSToanTG() {
    }

    public BSToanTG(String ma, String hoTen, double mucLuong, double luongKham, double luongXetNghiem) {
        super(ma, hoTen, mucLuong);
        this.luongKham = luongKham;
        this.luongXetNghiem = luongXetNghiem;
    }

    @Override
    public double luongHangThang() {
        return luongKham + luongXetNghiem + mucLuong;
    }

    public void nhapBSToanTG() {
        System.out.print("Nhap luong kham: ");
        System.out.print("Nhap luong xet");
    }

    @Override
    public String toString() {
        return "BSToanTG[ Ma: " + ma + " - Ho ten: " + hoTen + " - Muc luong: " + mucLuong + " - Luong kham: "
                + luongKham + " - Luong xet nghiem: " + luongXetNghiem + " - Luong hang thang: " + luongXetNghiem;
    }
}
