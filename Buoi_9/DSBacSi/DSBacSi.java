package Buoi_9.DSBacSi;

import java.util.ArrayList;
import java.util.Scanner;

public class DSBacSi {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<BacSi> dsBacSi = new ArrayList<BacSi>();

    // Them bac si ban thoi gian
    static void themBSBanTG() {
        BSBanTG btgs = new BSBanTG();
        btgs.nhapBSBanTG();
        dsBacSi.add(btgs);
    }

    // Them bac si toan thoi gian
    static void themBSToanTG() {
        BSToanTG ttgs = new BSToanTG();
        ttgs.nhapBSToanTG();
        dsBacSi.add(ttgs);
    }

    // In danh sach
    static void inDSBacSi() {
        for (BacSi bacSi : dsBacSi) {
            System.out.println(bacSi);
        }
    }

    // Tim bac si ban thoi gian 10k
    static void timBSBanTG10K() {
        for (BacSi bacSi : dsBacSi) {
            if (bacSi instanceof BSBanTG) // KT BacSi có thuộc BSBanTG không
            {
                if (bacSi.luongHangThang() >= 10000)
                    System.out.println(bacSi);
            }
        }
    }

    // Tim theo ma
    static void timTheoMa() {
        System.out.print("Nhap ma can tim: ");
        String n = sc.next();

        for (BacSi bacSi : dsBacSi) {
            if (bacSi.ma.equals(n))
                System.out.println(bacSi);
        }
    }

    static int inMenu() {
        int luaChon = 0;

        System.out.println("======================================");
        System.out.println("============= Muc Luc ================");
        System.out.println("======================================");
        System.out.println("Muc 1: Them BSBanTG");
        System.out.println("Muc 2: Them BSToanTG");
        System.out.println("Muc 3: In danh sach");
        System.out.println("Muc 4: Tim va in BSBanTG co luong hang thang > 10000");
        System.out.println("Muc 5: Tim va hien thi thong tin BS theo ma");
        System.out.println("Muc 0: Thoat!");
        System.out.println("======================================");
        System.out.print("Nhap lua chon: ");
        luaChon = sc.nextInt();

        return luaChon;
    }

    public static void main(String[] args) {
        // dsBacSi.add(new BNNgoaiTru("95194", "Luan", 500, 100, 50));

        // dsBacSi.add(new BNNoiTru("456", "ABC", 3000, 1500, 15));

        // themBNNgoaiTru();
        // themBNNoiTru();
        // inDanhSach();
        // timBNNoiTru3K();
        // timTheoMa();
        int chonSo;
        do {
            chonSo = inMenu();
            switch (chonSo) {
                case 1:
                    themBSBanTG();
                    break;
                case 2:
                    themBSToanTG();
                    break;
                case 3:
                    inDSBacSi();
                    break;
                case 4:
                    timBSBanTG10K();
                    break;
                case 5:
                    timTheoMa();
                    break;
                case 0:
                    System.out.println("Thoat!");
                    return;
                default:
                    System.out.println("Xay ra loi!!");
                    break;
            }
        } while (chonSo != 0);
    }
}
