package Buoi_5.Bai1;

public class CanBo {
    private String hoVaTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoVaTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoVaTen = hoVaTen;

        if (tuoi > 0)
            this.tuoi = tuoi;
        else
            System.out.println("Ban da Nhap sai Tuoi!");

        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0)
            this.tuoi = tuoi;
        else
            System.out.println("Ban da Nhap sai Tuoi!");
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inThongTinCanBo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Can Bo Co: Ho Va Ten : " + hoVaTen + ", Tuoi : " + tuoi
                + ", Gioi Tinh : " + gioiTinh + ", Dia Chi : " + diaChi;
    }
}
