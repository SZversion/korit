package ch18_static.singleton.products;

public class ProductView {
    // 정적 변수 선언 -> 자료형이 ProductView 변수명이 instance
    // 보통 싱글톤 생성 할 때 정적 변수 이름이 instance
    private static ProductView instance;
    private int counter = 1;

    private ProductView() {}

    public void count() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static ProductView get() {
        if(instance == null) {
            instance = new ProductView();
            return instance;
        }
        return instance;
    }
}
