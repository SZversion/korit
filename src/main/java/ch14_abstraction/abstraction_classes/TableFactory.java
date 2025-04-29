package ch14_abstraction.abstraction_classes;
/*
*   1. Factory 클래스를 상속 받을 것
*   2. 오류 처리 할 것
*   3. TableFactory 고유 method인 upgrade(String model)을 정의할것
*   4. produce() / manage() 매서드를 태블릿 공장에 맞게 수정 할 것
*   5. Main 으로 이동해 tableFactory1 객체를 생성하고, 애플 태블릿 공장으로 이름 붙일 것
*   6. produce()를 호출하시오
*   6. manage()를 호출하시오
*   6. upgrade("아이패드 미니 7세대")를 호출하시오
*/
public class TableFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println(model + " 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
