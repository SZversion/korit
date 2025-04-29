package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    //interface 이기 때문에 변수 앞에 접근 지정자를 명시하지 않았지만 public final 에 해당
    //상수기이 때문에 상수명을 나타내는 NAME 으로 작성
    //일반 클래스의 field 선언처럼 String name;으로 작성하는 것이 불가능

    /*  아래는 모두 불가능
    *   String name;
    *   public Press() {};
    *   void popOut() {
    *       System.out.println("일반 매서드 생성 불가")
    *   }
    */

    void onPressed(); //아무 표시 안했지만 abstract
}
