package testinterface;

public class God {
    public static String name = "하느님";

    private God() {
    }

    public static Animal createAnimal() {
        return new Animal();
    }

    public static Animal createAnimal(String kind) {
        // 특정 종류를 만들어서 내놓고 싶다.
        switch (kind) {
            case "사람" :
                return new Human();
            case "개" :
                return new Dog();
            case "야생사자":
                return new WildLion();
            default:
                return new Animal();
        }
    }

    public static Readable createReadableCreature(String creature) {
        switch (creature) {
            case "인간" :
                return new Human();
            case "프로토스" :
                return new Protoss();
        }
        return new Human();
    }

}
