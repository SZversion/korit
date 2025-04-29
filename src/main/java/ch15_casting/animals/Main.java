package ch15_casting.animals;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("asdf");
        System.out.println(dog1.getName());

        Animal animal1 = new Dog();
        animal1.makeSound();
        Animal animal2 = new Animal();
        System.out.println();
        animal2.makeSound();

        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);
        // instanceof 의 결과값이 true : 확인하고자 하는 object가 해당 클래스의 인스턴스이거나 하위 클래스의 인스턴스 일때

        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);
        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);

        System.out.println("animal2는 animal1이랑 사실상 같음");

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);

        System.out.println("===================================");
        /*
        *   업캐스팅의 경우 암시적으로 이루어짐
        *   A a = new B();이면 자동으로 업캐스팅이 이루어짐
        *   하지만 다운캐스팅은 (클래스)객체명; 와 같이 명시적으로 이루어짐
        */

        Dog dog2 = (Dog)animal1;
        dog2.makeSound();
        dog2.fetch();
        ((Dog)animal1).fetch();
        
        /*
        *   animal2는 new Animal();로 생성했기 때문에 다운캐스팅이 불가능함
        *   즉 다운캐스팅의 전제 조건은
        *   A a = new B();에서 출발한다는 점을 확인 할 수 있음
        *
        *   animalN 이라는 객체가 있을때 Animal()로 생성됐는지 Dog()로 생성됐는지 따라 오류가 발생함
        *   이를 확인하는게 instanceof
        */

        System.out.println("animal4 검증");
        Animal animal4 = new Dog();
        if(animal4 instanceof Dog) {
            Dog dog4 = (Dog)animal4;
            dog4.makeSound();
        }
        System.out.println("animal3 검증");
        if(animal3 instanceof Dog) {
            Dog dog3 = (Dog)animal3;
            dog3.makeSound();
        } else {
            System.out.println("불가능한 다운 캐스팅");
        }
    }
}
