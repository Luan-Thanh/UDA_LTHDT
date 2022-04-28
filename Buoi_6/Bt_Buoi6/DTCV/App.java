package Buoi_6.Bt_Buoi6.DTCV;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7.4, 8);
        System.out.printf("Dien tich hinh chu nhat la: %.2f \n", r1.area());
        System.out.printf("Chu vi hinh chu nhat la: %.2f \n", r1.perimeter());

        Circle c1 = new Circle(5.3);
        System.out.printf("Dien tich hinh tron la: %.2f \n", c1.area());
        System.out.printf("Chu vi hinh tron la: %.2f \n", c1.perimeter());
    }
}
