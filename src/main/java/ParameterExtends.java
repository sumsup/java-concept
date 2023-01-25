public class ParameterExtends {
    public static void main(String[] args) {
        기본상품 기본상품 = new 월정액();
        계산 계산 = new 계산();
        계산.요금계산(기본상품);
    }
}

class 기본상품 {
    public String 상품명;
    public int 가격;

    public boolean 일할계산() {
        return true;
    }
}

class 월정액 extends 기본상품 {

    public boolean 일할계산() {
        return true;
    }
}

class 옵션상품 extends 기본상품{

    public boolean 일할계산() {
        return false;
    }
}

class 계산 {

    public void 요금계산(기본상품 기본상품) {
        if (기본상품.일할계산()) {
            System.out.println("일할 계산 청구 되었습니다.");
        } else {
            System.out.println("월 이용 전액이 청구 되었습니다.");
        }
    }
}