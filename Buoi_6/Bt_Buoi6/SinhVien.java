package Buoi_6.Bt_Buoi6;

public class SinhVien {
    private int maSV;
    private String hoVaTen;
    private float diemLT, diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoVaTen, float diemLT, float diemTH) {
        if (maSV > 0)
            this.maSV = maSV;
        else
            System.out.println("ERROR!, Nhap nguyen duong...");

        this.hoVaTen = hoVaTen;

        if (diemLT > 0)
            this.diemLT = diemLT;
        else
            System.out.println("ERROR!, Nhap nguyen duong...");

        if (diemTH > 0)
            this.diemTH = diemTH;
        else
            System.out.println("ERROR!, Nhap nguyen duong...");
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        if (maSV > 0)
            this.maSV = maSV;
        else
            System.out.println("ERROR!, Nhap nguyen duong...");
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        if (diemLT > 0)
            this.diemLT = diemLT;
        else
            System.out.println("ERROR!, Nhap nguyen duong...");
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        if (diemTH > 0)
            this.diemTH = diemTH;
        else
            System.out.println("ERROR!, Nhap nguyen duong...");
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return "Ho va Ten: " + hoVaTen + " - Ma SV: " + maSV + " - Diem TB: " + tinhDiemTB();
    }

    public void inThongTinVS() {
        System.out.printf("%6d \t %-30s %7.2f %7.2f \t %7.2f \n", maSV, hoVaTen, diemLT, diemTH, tinhDiemTB());
    }

}
