public class SuperTypeArray {
    public static void main(String[] args) {
        Product[] products = new Product[10];

        products[0] = new Monthly();
        products[1] = new Option();

        for (Product product : products) {
            System.out.println(product.일할계산());
        }

    }

}

class Product {
    public String 상품명;
    public int 가격;

    public boolean 일할계산() {
        return true;
    }
}

class Monthly extends Product {

    @Override
    public boolean 일할계산() {
        return true;
    }
}

class Option extends Product {

    @Override
    public boolean 일할계산() {
        return false;
    }
}
