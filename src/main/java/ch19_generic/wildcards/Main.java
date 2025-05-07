package ch19_generic.wildcards;

public class Main {
    /*
    *  AnimalData의 필드가 Animal의 서브 클래스에 해당하는지 확인하는 매서드를 정의
    */

    public AnimalData<? extends Animal> getAnimal(int flag) {
        if(flag == 1) {
            AnimalData<Human> animalData1 = new AnimalData<>(new Human());
            return animalData1;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData2 = new AnimalData<>(new Tiger());
            return animalData2;
        }
        return null;
    }
    public static void main(String[] args) {
//        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
//        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
//        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
//
//        animalData1.printData();
//        animalData2.printData();
//        animalData3.printData();
        /*
        * animalData3에서 printData를 호출하는 과정에서 Car 클래스를 강제로 Animal 클래스로 형 변환 하려고 했기 때문에 오류 발생
        * 필드에 Car 객체가 대입은 되었지만 매서드는 호출되지 않아서 오류가 발생하므로
        * 애초에 Car 객체가 필드에 대입되지 못하도록 설정 할 필요가 있음
        */

        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);

//        위 코드는 생성자(new AnimalData())를 통해서 객체 생성을 하지 않았다는 점,
//        getAnimal() 매서드를 정의하지 않았다면 어떤 클래스의 객체가 매개변수로 들어갔는지 모른다는 점,
//        등의 문제가 발생함

        if(animalData4 != null) {
            animalData4.printData();
        } else {
            System.out.println("필드에 대입된 값이 없습니다.");
        }
        if(animalData5 != null) {
            animalData5.printData();
        } else {
            System.out.println("필드에 대입된 값이 없습니다.");
        }
        if(animalData6 != null) {
            animalData6.printData();
        } else {
            System.out.println("필드에 대입된 값이 없습니다.");
        }
    }
}