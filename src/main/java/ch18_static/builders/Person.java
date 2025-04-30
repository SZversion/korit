package ch18_static.builders;

public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;            //Builder 반환
        }
        public Builder age(int age) {
            this.age = age;
            return this;            //Builder 반환
        }
        public Builder address(String address) {
            this.address = address;
            return this;            //Builder 반환
        }

        public Person build() {
            return new Person(this);    //Builder를 받아서 Person에 삽입
        }
    }
}