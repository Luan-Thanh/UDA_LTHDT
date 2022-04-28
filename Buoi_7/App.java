package Buoi_7;

public class App {
    public static void main(String[] args) {
        // Calculation
        Calculation c1 = new Calculation();
        System.out.println(c1.add(2, 3));
        System.out.println(c1.add(2, 3, 4));
        c1.add(1.2, 2.3);

        // Amimal
        Animal a1 = new Animal();
        a1.sleep();
        a1.eat();

        Dog d1 = new Dog();
        d1.sleep();
        d1.eat();

        Dog d2 = new Dog();
        Animal a2 = d2;
        a2.eat();
    }
}
