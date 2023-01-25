public class DefaultMethodTest {
    public static void main(String[] args) {
        Child child = new Child();

        child.method1();
        child.method2();
        MyInterface1.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child extends Parent implements MyInterface1, MyInterface2 {

    @Override
    public void method1() {
        System.out.println("이름 같은 default 메서드를 오버라이드 했다.");
    }
}

class Parent {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface1 {
    default void method1() {
        System.out.println("My1 method1()");
    }

    default void method2() {
        System.out.println("My1 method2()");
    }

    static void staticMethod() {
        System.out.println("My1 StaticMethod");
    }
}

interface  MyInterface2 {
    default void method1() {
        System.out.println("My2 method1()");
    }

    static void staticMethod() {
        System.out.println("My2 staticMethod");
    }
}



