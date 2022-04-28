package Buoi_5.Bai2;

public class Nguoi {
    private String hoVaTen;
    private int tuoi;
    private int maSoGV;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoVaTen, int tuoi, int maSoGV, String queQuan) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.maSoGV = maSoGV;
        this.queQuan = queQuan;
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
        this.tuoi = tuoi;
    }

    public int getMaSoGV() {
        return maSoGV;
    }

    public void setMaSoGV(int maSoGV) {
        this.maSoGV = maSoGV;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Nguoi: Ho Va Ten: " + hoVaTen + ", Tuoi: " + tuoi + ", Ma So GV: " + maSoGV + ", Que Quan: " + queQuan;
    }

    public void inThongTinNguoi() {
        System.out.println(toString());
    }

}
