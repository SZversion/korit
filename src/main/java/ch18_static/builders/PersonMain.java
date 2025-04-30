package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .name("김일")  //return 값이 Builder 이므로 뒤에 .age() 등이 붙을수 있음
                .age(21)
                .address("종로구")
                .build();
    }
}