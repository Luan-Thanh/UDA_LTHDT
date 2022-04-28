package Buoi_6.Bt_Buoi6;

public class Bai_4 {
    public static void main(String[] args) {
        Account a1 = new Account(123, "luanthanh", 1000);
        System.out.println(a1);
        a1.napTien();
        a1.rutTien();
        a1.daoHan();
        a1.chuyenKhoan();

        // System.out.println("===================================================");
        // System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-30s \n", "So tai
        // khoan", "Ten tai khoan",
        // "So tien trong TK",
        // "So tien nap", "So tien rut", "Dao han", "So tien chuyen khoan");
        // System.out.println("===================================================");
        // a1.inThongTinAcount();
    }
}
