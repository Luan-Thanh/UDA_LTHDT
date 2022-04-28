package Buoi_6.Bt_Buoi6;

public class Bai_3 {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Le Thanh Luan", "Future Neo", 100, 35000000.01);
        Vehicle xe2 = new Vehicle("Nguyen Thanh A", "Ford Ranger", 3000, 250000000.02);
        Vehicle xe3 = new Vehicle("Hoang Thanh B", "Landscape", 1500, 10000000.03);

        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);

        System.out.println("\t ============================================================== \t");
        System.out.printf("%-20s %-15s %7s %9s \t %12s \n  ", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia",
                "Thue phai nop");
        System.out.println("\t ============================================================== \t");

        xe1.inThongTinMuaXe();
        xe2.inThongTinMuaXe();
        xe3.inThongTinMuaXe();
    }
}
