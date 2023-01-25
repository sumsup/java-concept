package objectclassoverride;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeTestMain {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "민수";
        human1.age = 35;
        human1.height = 180;

        Human human2 = new Human();
        human2.name = "철수";
        human2.age = 35;
        human2.height = 180;

        // 해시코드 오버라이딩은 왜 하는 거야??
        // 이퀄스랑 해시코드는 왜 별개로 하는거지?
        // ==> 해시코드 : 해당객체의 힙 메모리에 저장되 있는 주소값
        if (human1.hashCode() == human2.hashCode()) {
            System.out.println("같아요!");
        } else {
            System.out.println("달라요ㅜ");
        }

        if (human1.equals(human2)) {
            System.out.println("같아요!");
        } else {
            System.out.println("달라요ㅜ");
        }

        Human human3 = new Human();
        human3.name = "민수";
        human3.age = 35;

        if (human1.equals(human3)) {
            System.out.println("같아요!");
        } else {
            System.out.println("달라요ㅜ");
        }

        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());

        String name1 = new String("민수");
        String name2 = new String("민수");

        // == 연산자는 객체의 주소값을 비교함. 처음엔 equals도 그렇게 되 있음. this == obj 로 되어있음.
        if (name1 == name2) {
            System.out.println("같아요~~~");
        }

        Map<Human, Integer> humans = new HashMap<>();
        humans.put(new Human(), 1);
        humans.put(new Human(), 2);
        humans.put(new Human(), 3);

        Human human4 = new Human();
        int count = humans.get(human4);

        System.out.println(count);
    }
}
