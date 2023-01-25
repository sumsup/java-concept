package testinterface;

public class InterfaceTestMain {
    public static void main(String[] args) {
        Human minsoo = new Human("민수", 37, "서울시 성내동");
        minsoo.eat();
        minsoo.run();
        minsoo.sayHelloToFriend("철수");
        minsoo.work();
        System.out.println(minsoo.toString());

        Dog yuri = new Dog("유리", 17, "서울시 성내동");
        yuri.eat();
        yuri.run();
        yuri.bark();
        System.out.println(yuri.toString());

        WildLion wildLion1 = new WildLion(10);
        wildLion1.eat();
        wildLion1.run();
        wildLion1.hunt();
        System.out.println(wildLion1.toString());

        Animal animal = God.createAnimal();
        Animal human = God.createAnimal("사람");

        System.out.println(animal.toString());
        System.out.println(human.toString());

        ((Human) human).read();

        Readable humanReadable = God.createReadableCreature("인간");
        Readable protoss = God.createReadableCreature("프로토스");
        humanReadable.read();
        protoss.read();

    }
}
