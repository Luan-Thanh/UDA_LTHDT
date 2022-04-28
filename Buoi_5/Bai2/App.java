package Buoi_5.Bai2;

public class App {
    public static void main(String[] args) {
        Nguoi n1 = new Nguoi("Le Thanh Luan", 18, 95194, "Dak Nong");
        n1.inThongTinNguoi();

        CanBoGV cb1 = new CanBoGV(10000, 1254.89, 800, 209.46);
        cb1.inTienLuongCanBo();
    }
}
