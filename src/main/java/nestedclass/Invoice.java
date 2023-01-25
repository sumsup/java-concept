package nestedclass;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Item> items = new ArrayList<>();

    // Nested class는 무조건 STATIC으로 선언 해야 한다.
    // 왜? static으로 선언한건 클래스당 1개만 생성하는 것 아닌가?
    // 맞다. 해당 Invoice 인스턴스당 1개만 생성하게 되 있다.
    // 그럼 다른 변수나 메서드랑은 다르잖아. static으로 선언하면 해당 클래스당 1개를 미리 생성해서 메모리에 올려두고
    // 전역적으로 그 하나만 참조 해서 사용하는거라고 했잖아. 클래스를 생성하지 않고도 사용 가능하고!!
    // 이 내부 클래스에 선언된 static은 의미가 좀 다른가?
    // outer field에 대한 접근 제한자 같은 느낌으로다가 쓰는거 같다..
    public static class Item {
        String description;
        int quantity;
        double unitPrice;
        double price() {
            return quantity * unitPrice;
        }

    }
    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void addItem(Item item) {
        items.add(item);
    }

}
