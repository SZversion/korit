package ch10_setter_getter;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("기본 생성자를 통해 인스턴스 생성 완료");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("나이가 입력되었습니다 : " + this.age);
    }

    public Person(String name) {
        this.name = name;
        System.out.println("이름이 입력되었습니다 : " + this.name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("이름이 입력되었습니다 : " + this.name);
        System.out.println("나이가 입력되었습니다 : " + this.age);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("이름이 입력되었습니다 : " + this.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>200) {
            System.out.println("불가능한 나이입니다. 현재 나이 : " + this.age);
            return;
        }
        System.out.println("나이가 입력되었습니다." );
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + this.age);
    }

    public void showInto() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
