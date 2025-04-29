package ch14_abstraction.abstraction_classes;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");
        phoneFactory1.produce("아이폰 17");
        phoneFactory1.manage();
        phoneFactory1.displayInfo();

        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(super.getName() + "에서 " + model + "을 생성합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        };

        factory1.setName("LG");
        factory1.produce("세탁기");

        /*
        *   위 개념은 추상 클래스의 개념에서 벗어남 (객체 생성이 불가능 하다고 했는데 Factory 클래스의 객체가 생성되었음)
        *   java11에서 도입된 익명 클래스
        *   재사용 하지 않고 한버만 쓰고 치울거라면 사용하기 좋음
        */
        
        TableFactory tableFactory = new TableFactory();
        tableFactory.setName("애플 태블릿 공장");
        tableFactory.produce("아이패드 미니 6세대");
        tableFactory.manage();
        tableFactory.upgrade("아이패드 미니 7세대");
    }
}