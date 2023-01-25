package testinterface;

public class Protoss implements Readable {
    @Override
    public void read() {
        System.out.println("프로토스도 읽는다.");
    }
}
