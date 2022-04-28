package Buoi_8.Cau_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong o to: ");
        int soLuong = sc.nextInt();

        Oto[] otos = new Oto[soLuong];

        // Nhap o to
        for (int i = 0; i < otos.length; i++) {
            System.out.println("Nhap o to thu [" + (i + 1) + "]: ");
            otos[i] = new Oto();
            otos[i].nhapXe();
            otos[i].nhapOto();
            System.out.println("--------------------------");
        }

        // In ô tô
        for (int i = 0; i < otos.length; i++) {
            otos[i].inOto();
        }

        System.out.println("------------------------------------------------------------------------");
        // In ô tô hơn 1k
        System.out.println("Nhung o to co trong tai hon 1K");
        for (int i = 0; i < otos.length; i++) {
            otos[i].inOto1k();
        }

        System.out.println("------------------------------------------------------------------------");
        // In ô tô có nhãn hiệu KIA
        System.out.println("Nhung o to thuong hang KIA: ");
        for (int i = 0; i < otos.length; i++) {
            otos[i].inOtoKIA();
        }
    }
}
