package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView productView1 = ProductView.get();   //새로운 객체 생성
        productView1.count();
        
        ProductView productView2 = ProductView.get();   //productView1 에서 쓰던 객체를 반환받음
        productView2.count();
        
        ProductView productView3 = ProductView.get();   //productView2 에서 쓰던 객체를 반환받음
        productView3.count();
        
        ProductView productView4 = ProductView.get();   //productView3 에서 쓰던 객체를 반환받음
        productView4.count();

        productView1.count();
        System.out.println(productView1.getCounter());  // 6 출력
    }
}