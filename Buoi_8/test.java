package Buoi_8;

import java.util.Scanner;

public class test {

    String Ten;
    private int GioiTinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public void nhapvao() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        Ten = keyboard.nextLine();
        System.out.println("Nhập vào giới tính: ");
        GioiTinh = keyboard.nextInt();

    }

    @Override
    public String toString() {
        return "test [GioiTinh=" + GioiTinh + ", Ten=" + Ten + "]";
    }

    public void xuat() {
        System.out.println(toString());

    }
}