package Buoi_3.Bt_Buoi3;

public class Bai_2 {
    public static void main(String[] args) {
        Point2D A = new Point2D(0, -3.5f);
        Point2D B = new Point2D(2.75f, 0);

        A.move(0, 0.5f);
        B.move(0.25f, 0);

        System.out.print("Toa do diem A: ");
        A.display();
        System.out.print("Toa do diem B: ");
        B.display();

        System.out.printf("Khoang cach giua 2 diem A va B la: %.2f", A.distance(B));
    }
}
