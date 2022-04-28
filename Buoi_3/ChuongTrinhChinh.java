package Buoi_3;

public class ChuongTrinhChinh {
    public static void main(String[] args) {
        // Sinh viên
        SinhVien sv1 = new SinhVien();
        // Gán giá trị cho đối tượng
        sv1.ganMaSV(5);
        sv1.ganHoTenSV("Luan");
        // Gọi phương thức
        sv1.inThongTinSV();

        SinhVien sv2 = new SinhVien("A", 6);
        sv2.inThongTinSV();

        // Giảng viên
        GiangVien gv1 = new GiangVien();
        // Gán giá trị cho đối tượng
        gv1.ganHSL(5);
        gv1.ganHoTenGV("Luan");
        // Gọi phương thức
        gv1.inThongTinGV();

        GiangVien gv2 = new GiangVien("A", 6);
        gv2.inThongTinGV();
    }
}
