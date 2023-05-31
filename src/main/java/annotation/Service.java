package annotation;

public class Service {
    @PrintAnnotation
    public void method1() {
        System.out.println("1번 메서드");
    }

    @PrintAnnotation("*") // value() 속성값은 속성이름을 생략하고 value만 입력 가능.
    public void method2() {
        System.out.println("2번 메서드");
    }

    @PrintAnnotation(value="#", number = 20) // value 속성이라도 다른 속성이랑 같이 설정할 때는 속성명 명시해야 함.
    public void method3() {
        System.out.println("3번 메서드");
    }
}
