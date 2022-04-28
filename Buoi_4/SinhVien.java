package Buoi_4;

public class SinhVien extends nguoi { // extends: kế thừa, kế thừa lớp "nguoi"
    private double diem;

    public SinhVien() {

    }

    public SinhVien(double diem) {
        this.diem = diem;
    }

    public SinhVien(String ten, int tuoi, double diem) {
        super(ten, tuoi);
        this.diem = diem;
    }

    public void inSinhVien() {
        super.inNguoi(); // Gọi ha của lớp SinhVien là lớp người

        System.out.println("Diem: " + diem);
    }
}
