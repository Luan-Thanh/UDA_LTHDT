package Buoi_3.Bt_Buoi3;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {

    }

    public Person(String name, int age, String address) throws Exception {
        this.name = name;
        if (age > 0)
            this.age = age;
        else
            throw new Exception("ERROR!");
        this.address = address;
    }

    public void printPreson() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Address is: " + address);
    }
}
