package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotaionMain {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for (Method method : declaredMethods) {
            // PrintAnnotation 얻기.
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            // @PrintAnnotation 에 설정된 속성값을 이용해서 라인 출력.
            printLine(printAnnotation);

            // 메서드 호출.
            method.invoke(new Service());

            // @PrintAnnotation 에 설정된 속성값을 이용해서 라인 출력.
            printLine(printAnnotation);
        }
    }

    private static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            // number 속성값 얻기
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                // value 속성값 얻기
                String value = printAnnotation.value();
                System.out.print(value);
            }

            System.out.println();
        }
    }
}
