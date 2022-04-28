package Exception;

import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) {
        // Nhập vào một số nguyên, nếu nhập sai thì báo lỗi và nhập lại cho đến khi nhap
        // dung
        System.out.print("Nhap vao mot so nguyen: ");
        Scanner sc = new Scanner(System.in);
        int so = 0;
        try {
            so = sc.nextInt(); // nhập sai lỗi sẽ do lệnh này
        } catch (Exception e) {
            System.out.println("Ban nhap sai roi, nho nhap so nguyen");
        }
        System.out.println("Ban vua nhap so: " + so);
        sc.close();
    }
}
