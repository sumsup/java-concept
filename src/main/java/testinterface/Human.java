package testinterface;

public class Human extends Animal implements Readable {
    public String name;
    public String address;

    public Human() {
    }

    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void sayHelloToFriend(String friendName) {
        System.out.println(friendName + "아 안녕?");
    }

    public void work() {
        System.out.println("일을 열심히 합니다.");
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n나이 : " + age + "\n사는곳 : " + address;
    }

    @Override
    public void read() {
        System.out.println("책을 읽는다.");
    }
}
