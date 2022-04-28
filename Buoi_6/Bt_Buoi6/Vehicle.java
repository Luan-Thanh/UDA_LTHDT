package Buoi_6.Bt_Buoi6;

public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double tinhThue() {
        double thue;
        if (dungTich < 100)
            thue = triGia * 0.01;
        else if (dungTich >= 100 && dungTich <= 200)
            thue = triGia * 0.03;
        else
            thue = triGia * 0.05;
        return thue;
    }

    @Override
    public String toString() {
        return "Ten chu xe: " + tenChuXe + ", Loai xe: " + loaiXe + "Dung tich: " + dungTich + ", Tri gia: " + triGia;
    }

    public void inThongTinMuaXe() {
        System.out.printf("%-20s %-15s %7d %15.2f \t %12.3f \n ", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}