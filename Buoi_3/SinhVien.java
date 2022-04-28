package Buoi_3;

public class SinhVien {

    // Thuộc tính
    private String hoTenSV;

    private int maSV;
    // Phương thức:

    public void inThongTinSV() {
        System.out.println("Ho va Ten SV: " + hoTenSV + ", Ma sinh vien:" + maSV);
    }

    // Phương thức gián
    public void ganMaSV(int m) {
        maSV = m;
        if (m < 0)
            System.out.println("ERROR!, Nhap nguyen duong...");
        else
            m = maSV;
    }

    public void ganHoTenSV(String t) {
        hoTenSV = t;
    }

    // Phương thức khởi tạo: Tạo đối tượng và gán có tên trùng với tên class không
    // có đối số trả dề " class "
    public SinhVien() {
        System.out.println("Mot doi tương sinh vien da duoc tao: ");
    }

    // Khơi tạo và gán
    public SinhVien(String hoTenSV, int maSV) {
        this.hoTenSV = hoTenSV;
        this.maSV = maSV;
    }

}
