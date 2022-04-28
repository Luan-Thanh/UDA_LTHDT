package Buoi_5.Bai1;

public class App {
    public static void main(String[] args) {
        CanBo cb1 = new CanBo("Le Thanh Luan", 18, "Nam", "Da Nang");
        cb1.inThongTinCanBo();
        System.out.println();

        CongNhan cn1 = new CongNhan();
        cn1.setHoVaTen("Nguyen Van A");
        cn1.setTuoi(20);
        cn1.setGioiTinh("Nam");
        cn1.setDiaChi("Sai Gon");
        cn1.setBac(5);
        cn1.inThongTinCongNhan();
        System.out.println();

        KySu ks1 = new KySu("Hoang Thi B", 20, "Nu", "Da Nang", "Ky Su Phan Mem");
        ks1.inThongTinKySu();
        System.out.println();

        NhanVien nv1 = new NhanVien("Phan Van C", 35, "Nam", "Quang Ngai", "Nhan Vien Van Phong");
        nv1.inThongTinNhanVien();
        System.out.println();
    }
}
