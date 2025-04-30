package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok personLombok = new PersonLombok.PersonLombokBuilder()
                .name("김씨")
                .age(12)
                .address("부산")
                .build();

        System.out.println(personLombok);
    }
}
