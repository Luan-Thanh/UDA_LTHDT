package Buoi_5.Bai1;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void inThongTinNhanVien() {
        super.inThongTinCanBo();
        System.out.println("Nhan Vien Co cong Viec: " + congViec);
    }
}
