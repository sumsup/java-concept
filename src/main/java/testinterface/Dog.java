package testinterface;

public class Dog extends Animal {
    public String name;
    public String address;

    public Dog() {
    }

    public Dog(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void bark() {
        System.out.println("왈왈");
    }
}
