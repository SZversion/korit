package ch18_static;

import lombok.Getter;

@Getter // 클래스 레벨에서의 @Getter는 static 매서드와 관계 X 인스턴스 변수의 Getter만 생성함
public class Product {
    //static 변수 선언 및 초기화
    @Getter // 필드 레벨에서의 Getter
    private static int count = 0;
    //인스턴스 변수 선언 및 초기화
    private int instanceCount =0;

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다");
        count++;
        instanceCount++;
    }
}
