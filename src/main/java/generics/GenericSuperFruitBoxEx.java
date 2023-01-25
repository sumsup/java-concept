package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
    String name;
    int speed;

    Car (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String toString() {
        return name + "(" + speed + ")";
    }
}

public class GenericSuperFruitBoxEx {
    public static void main(String[] args) {
        ParkingPlace<SportsCar> sportsCarParkingPlace = new ParkingPlace<>();
        ParkingPlace<Truck> truckParkingPlace = new ParkingPlace<>();

        sportsCarParkingPlace.add(new SportsCar("lamborghini", 300));
        sportsCarParkingPlace.add(new SportsCar("genesis", 250));
        sportsCarParkingPlace.add(new SportsCar("porche", 280));

        truckParkingPlace.add(new Truck("benz", 200));
        truckParkingPlace.add(new Truck("porter", 150));
        truckParkingPlace.add(new Truck("GMC", 180));

        Collections.sort(sportsCarParkingPlace.getList(), new SportsCarComp());
        Collections.sort(truckParkingPlace.getList(), new TruckComp());
        System.out.println(sportsCarParkingPlace);
        System.out.println(truckParkingPlace);
        Collections.sort(sportsCarParkingPlace.getList(), new CarComp());
        Collections.sort(truckParkingPlace.getList(), new CarComp());
        System.out.println(sportsCarParkingPlace);
        System.out.println(truckParkingPlace);

    }
}

class SportsCar extends Car {
    SportsCar(String name, int speed) {
        super(name, speed);
    }
}

class Truck extends Car {
    Truck(String name, int speed) {
        super(name, speed);
    }
}

class SportsCarComp implements Comparator<SportsCar> {

    @Override
    public int compare(SportsCar o1, SportsCar o2) {
        return o2.speed - o1.speed;
    }
}

class TruckComp implements Comparator<Truck> {

    @Override
    public int compare(Truck o1, Truck o2) {
        return o2.speed - o1.speed;
    }
}

class CarComp implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.speed - o2.speed;
    }
}

class ParkingPlace<T extends Car> extends Place<T> {

}

class Place<T> {
    ArrayList<T> list = new ArrayList<>();

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