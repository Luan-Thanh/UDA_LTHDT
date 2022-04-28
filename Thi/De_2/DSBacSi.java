package Thi.De_2;

import java.util.Scanner;

public class DSBacSi {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BSToanTG ttgs = new BSToanTG();
        BSBanTG btgs = new BSBanTG();
        int luaChon = 0;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("------------------ Muc Luc ------------------");
            System.out.println("---------------------------------------------");
            System.out.println("Muc 1: Them bac si toan thoi gian");
            System.out.println("Muc 2: Them bac si ban thoi gian");
            System.out.println("Muc 3: In danh sach");
            System.out.println("Muc 4: Tim va in bac si ban thoi gian co luong hang thang > 10000");
            System.out.println("Muc 5: Tim va hien thi thong tin dua theo ma");
            System.out.println("Muc 0: Thoat!");
            System.out.println("---------------------------------------------");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    ttgs.nhapBS();
                    ttgs.nhapBSToanTG();
                    break;
                case 2:
                    btgs.nhapBS();
                    btgs.nhapBSBanTG();
                    break;
                case 3:
                    System.out.println(
                            "------------------------------------------ DS BSToanTG ------------------------------------------");
                    ttgs.inBSToanTG();
                    System.out.println(
                            "------------------------------------------ DS BSBanTG ------------------------------------------");
                    btgs.inBSBanTG();
                    break;
                case 4:
                    if (btgs.luongHangThang() >= 10000) {
                        btgs.inBSBanTG();
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma can tim: ");
                    int kiemTra = sc.nextInt();

                    if (kiemTra == ttgs.getMa()) {
                        ttgs.inBSToanTG();
                    } else if (kiemTra == btgs.getMa()) {
                        btgs.inBSBanTG();
                    } else {
                        System.out.println("Ma ban nhap khong ton tai!");
                    }
                    break;
                case 0:
                    System.out.println("Thoat!!");
                    return;
                default:
                    System.out.println("Xay ra loi!!");
                    break;
            }
        } while (luaChon != 0);
    }
}
