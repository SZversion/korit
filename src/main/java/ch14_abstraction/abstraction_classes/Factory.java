package ch14_abstraction.abstraction_classes;

public abstract class Factory {
    private String name;

    public abstract void produce(String model);
    public abstract void manage();
//        abstract가 매서드의 접근 지정자(public)와 리턴타입(void) 사이에 명시되면
//        클래스도 동일하게 abstract가 되어야 함

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다");
        System.out.println("공장 이름 : " + name);
    }
}