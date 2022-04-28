package Exception;

public class lesson_2 {

    public static double giaTriPhanSo(int tu, int mau) throws ArithmeticException {
        if (mau == 0)
            throw new ArithmeticException("Mau so = 0");
        else
            return (double) tu / mau;
    }

    public static void main(String[] args) {
        try {
            System.out.println(giaTriPhanSo(3, 0));
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
