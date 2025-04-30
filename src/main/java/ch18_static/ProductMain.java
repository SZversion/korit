package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getCount());
        Product product1 = new Product();
        System.out.println(Product.getCount());             //1
        System.out.println(product1.getInstanceCount());    //0
        Product product2 = new Product();
        System.out.println(Product.getCount());             //2
        System.out.println(product2.getInstanceCount());    //0
        //정적 변수(static)은 객체에 종속 되지 않고 클래스에 종속 되어 클래스 단위에서 값이 변함
        //인스턴스 변수는 객체에 종속 되어 객체마다 값이 다름
    }
}
