package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        person1.setAge(234);
        person1.setAge(21);

        Person person2 = new Person("이이", 32);
        person2.setName("최이");
    }
}
