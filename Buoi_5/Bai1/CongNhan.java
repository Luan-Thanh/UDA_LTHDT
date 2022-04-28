package Buoi_5.Bai1;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        if (bac >= 1 && bac <= 10)
            this.bac = bac;
        else
            System.out.println("Ban Da Nhap Sai Bac!");
    }

    public CongNhan(String hoVaTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);

        if (bac >= 1 && bac <= 10)
            this.bac = bac;
        else
            System.out.println("Ban Da Nhap Sai Bac!");
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void inThongTinCongNhan() {
        super.inThongTinCanBo();
        System.out.println("Cong Nhan Co Bac: " + bac);
    }
}
