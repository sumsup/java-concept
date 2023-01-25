package nestedclass;

public class NestedClassMain {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        Invoice.Item item = new Invoice.Item();

        invoice.addItem(item);

        Network myFace = new Network();
        Network.Member fred = myFace.new Member("fred");
        fred.deactivate();

        Network insta = new Network();
        Network.Member peggy = insta.enroll("peggy"); // 이렇게 outer에서 inner의 생성자에 접근이 가능.
        peggy.deactivate();


    }
}
