package Buoi_5.Bai2;

public class CanBoGV extends Nguoi {
    public double luongCung;
    public double luongThuong;
    public double luongPhat;
    public double luongThuc;

    public CanBoGV() {
    }

    public CanBoGV(double luongCung, double luongThuong, double luongPhat, double luongThuc) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
        this.luongThuc = (this.luongCung + this.luongThuong) - this.luongPhat;
    }

    public CanBoGV(String hoVaTen, int tuoi, int maSoGV, String queQuan, double luongCung, double luongThuong,
            double luongPhat, double luongThuc) {
        super(hoVaTen, tuoi, maSoGV, queQuan);

        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
        this.luongThuc = (this.luongCung + this.luongThuong) - this.luongPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(double luongPhat) {
        this.luongPhat = luongPhat;
    }

    public double getLuongThuc() {
        return luongThuc;
    }

    public void setLuongThuc(double luongThuc) {
        this.luongThuc = (this.luongCung + this.luongThuong) - this.luongPhat;
    }

    public void inTienLuongCanBo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Tien Luong Can Bo Giao Vien: Luong Cung: " + luongCung + ", Luong Thuong: " + luongThuong
                + ", Luong Phat: "
                + luongPhat + ", Luong Thuc: " + luongThuc;
    }

}