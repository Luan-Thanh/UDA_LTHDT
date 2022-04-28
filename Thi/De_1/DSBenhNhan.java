package Thi.De_1;

import java.util.Scanner;

public class DSBenhNhan {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BNNgoaiTru ngts = new BNNgoaiTru();
        BNNoiTru nts = new BNNoiTru();
        int luaChon = 0;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("------------------ Muc Luc ------------------");
            System.out.println("---------------------------------------------");
            System.out.println("Muc 1: Them benh nhan ngoai tru");
            System.out.println("Muc 2: Them benh nhan noi tru");
            System.out.println("Muc 3: In danh sach");
            System.out.println("Muc 4: Tim va in benh nhan noi tru co vien phi > 3000");
            System.out.println("Muc 5: Tim va hien thi thong tin dua theo ma");
            System.out.println("Muc 0: Thoat!");
            System.out.println("---------------------------------------------");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    ngts.nhapBN();
                    ngts.nhapBNNgoaiTru();
                    break;
                case 2:
                    nts.nhapBN();
                    nts.nhapBNNoiTru();
                    break;
                case 3:
                    System.out.println(
                            "------------------------------------------ DS BNNgoaiTRu ------------------------------------------");
                    ngts.inBNNgoaiTru();
                    System.out.println(
                            "------------------------------------------ DS BNNoiTRu ------------------------------------------");
                    nts.inBNNoiTru();
                    break;
                case 4:
                    if (nts.vienPhi() >= 3000) {
                        nts.inBNNoiTru();
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma can tim: ");
                    int kiemTra = sc.nextInt();

                    if (kiemTra == ngts.getMa()) {
                        ngts.inBNNgoaiTru();
                    } else if (kiemTra == nts.getMa()) {
                        nts.inBNNoiTru();
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
