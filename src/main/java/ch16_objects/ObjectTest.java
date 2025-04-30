package ch16_objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자로 객체 생성");
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("name, address 매개변수로 객체가 생성되었습니다");
    }

    public ObjectTest(String name) {
        this.name = name;
        System.out.println("name 매개변수로 객체가 생성되었습니다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    @Override
    public String toString() {
        return
                "이름 : " + name + '\n' +
                "주소 : " + address;
    }
}