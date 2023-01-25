package generics;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "generics.Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "generics.Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "generics.Grape";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "generics.Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {

    public static Juice makeJuice(FruitBox<? extends Fruit> fruitBox) {
        String tmp = "";

        for (Fruit f : fruitBox.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class GenericFruitBoxEx {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox<T extends Fruit> extends Box<T> {

}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

