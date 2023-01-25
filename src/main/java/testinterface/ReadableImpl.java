package testinterface;

public class ReadableImpl implements Readable {
    @Override
    public void read() {
        System.out.println("impl에서 읽는다.");
    }
}
