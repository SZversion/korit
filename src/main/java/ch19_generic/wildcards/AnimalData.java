package ch19_generic.wildcards;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AnimalData <T> {
    private T animal;
    /*
    *   AnimalData의 필드인 animal에 Animal 클래스를 상속받은 Tiger, Human만 들어가도록
    *   특정 클래스에 맞는 객체 정보를 출력 할 수 있도록 작성
    */

    public void printData() {
        ((Animal)animal).move();                        //AnimalData의 필드인 animal 을 Animal 자료형으로 형변환
        if(animal.getClass() == Human.class) {
            ((Human)animal).read();                     //animal의 클래스를 확인하여 그것이 Human 클래스에 해당한다면 animal을 다시 Human 클래스로 다운캐스팅하여 고유 매서드 read()를 실행
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }
}