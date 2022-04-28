package Buoi_9.DSBenhNhan;

import java.util.ArrayList;
import java.util.Scanner;

public class DSBenhNhan {

    public static Scanner sc = new Scanner(System.in);

    // Lớp cha có thể nhận dữ liệu từ các lớp con nên dùng BenhNhan
    static ArrayList<BenhNhan> dsBenhNhan = new ArrayList<BenhNhan>();

    // Thêm ngoai trú
    public static void themBNNgoaiTru() {
        BNNgoaiTru ngts = new BNNgoaiTru();
        ngts.nhapBNNgoaiTru();
        dsBenhNhan.add(ngts);
    }

    // Thêm nội trú
    public static void themBNNoiTru() {
        BNNoiTru nts = new BNNoiTru();
        nts.nhapBNNoiTru();
        dsBenhNhan.add(nts);
    }

    // In danh sách
    public static void inDanhSach() {
        for (BenhNhan benhNhan : dsBenhNhan) {
            System.out.println(benhNhan);
        }
    }

    // Tim bệnh nhân nội trú 3K
    public static void timBNNoiTru3K() {
        for (BenhNhan benhNhan : dsBenhNhan) {
            if (benhNhan instanceof BNNoiTru) // KT benhNhan có thuộc BNNoiTru không
            {
                if (benhNhan.vienPhi() >= 3000)
                    System.out.println(benhNhan);
            }
        }
    }

    // Tim theo ma
    public static void timTheoMa() {
        System.out.print("Nhap ma can tim: ");
        String n = sc.nextLine();

        for (BenhNhan benhNhan : dsBenhNhan) {
            if (benhNhan.ma.equals(n))
                System.out.println(benhNhan);
        }
    }

    public static int inMenu() {
        int luaChon = 0;

        System.out.println("======================================");
        System.out.println("============= Muc Luc ================");
        System.out.println("======================================");
        System.out.println("Muc 1: Them BNNgoaiTru");
        System.out.println("Muc 2: Them BNNoiTru");
        System.out.println("Muc 3: In danh sach");
        System.out.println("Muc 4: Tim va in BNNoiTru co vien phi > 3000");
        System.out.println("Muc 5: Tim va hien thi thong tin BN theo ma");
        System.out.println("Muc 0: Thoat!");
        System.out.println("======================================");
        System.out.print("Nhap lua chon: ");
        luaChon = sc.nextInt();

        return luaChon;
    }

    public static void main(String[] args) {
        // dsBenhNhan.add(new BNNgoaiTru("95194", "Luan", 500, 100, 50));

        // dsBenhNhan.add(new BNNoiTru("456", "ABC", 3000, 1500, 15));

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
                    themBNNgoaiTru();
                    break;
                case 2:
                    themBNNoiTru();
                    break;
                case 3:
                    inDanhSach();
                    break;
                case 4:
                    timBNNoiTru3K();
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
