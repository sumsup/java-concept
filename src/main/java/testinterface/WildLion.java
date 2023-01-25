package testinterface;

public class WildLion extends Animal {
    public WildLion() {

    }

    public WildLion(int age) {
        this.age = age;
    }

    public void hunt() {
        System.out.println("사자가 사냥을 한다.");
    }

}
