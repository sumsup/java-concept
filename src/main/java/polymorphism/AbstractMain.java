package polymorphism;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void message() {
                System.out.println("추상 클래스는 생성하려면 즉석에서 구현해서 사용해야 한다!");
            }

            @Override
            public void greetings() {
                System.out.println("좋은 아침입니다!");
            }
        };

        abstractClass.message();
        abstractClass.greetings();
        abstractClass.sayHiKorean();

        NoAbstractClass noAbstractClass = new NoAbstractClass() {
            @Override
            public void sayHello() {
                super.sayHello();
                System.out.println("abstract는 무조건 상속해서 씁니다. 추상클래스가 없어도.");
            }
        };

        noAbstractClass.sayHello();

    }
}
