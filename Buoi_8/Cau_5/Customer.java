package Buoi_8.Cau_5;

public class Customer extends Person {
    private String tenCongTy;
    private double giaHoaDon;
    private String danhGia;

    @Override
    public String toString() {
        return "Customer [danhGia=" + danhGia + ", giaHoaDon=" + giaHoaDon + ", tenCongTy=" + tenCongTy + "]";
    }

}
