package Buoi_8.Cau_5;

public class Student extends Person {
    private double diemMH1, diemMH2;

    public Student() {
    }

    public Student(String name, String address) {
        super(name, address);
    }

    public Student(double diemMH1, double diemMH2) {
        this.diemMH1 = diemMH1;
        this.diemMH2 = diemMH2;
    }

    public Student(String name, String address, double diemMH1, double diemMH2) {
        super(name, address);
        this.diemMH1 = diemMH1;
        this.diemMH2 = diemMH2;
    }

    public double tinhDiemTB() {
        return (diemMH1 + diemMH2) / 2;
    }

    @Override
    public String toString() {
        return "Student [ Diem MH1: " + diemMH1 + " - Diem MH2: " + diemMH2 + " - Diem trung binh: " + tinhDiemTB()
                + " ]";
    }

}
