package Buoi_3;

public class GiangVien {
    private String hoTenGV;
    private double hsl;

    public void inThongTinGV() {
        System.out.println("Ho ten GV: " + hoTenGV + " ,So luong: " + hsl * 1490000);
    }

    // Phương thức gián
    public void ganHSL(double h) {
        hsl = h;
        if (h < 0)
            System.out.println("ERROR!, Nhap thuc duong...");
        else
            h = hsl;
    }

    public void ganHoTenGV(String t) {
        hoTenGV = t;
    }

    // Phương thức khởi tạo: Tạo đối tượng và gán có tên trùng với tên class không
    // có đối số trả dề " class "
    public GiangVien() {
        System.out.println("Mot doi tuong giang vien da duoc tao: ");
    }

    // Khơi tạo và gán
    public GiangVien(String hoTenGV, double hsl) {
        this.hoTenGV = hoTenGV;
        this.hsl = hsl;
    }
}
