package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김일", "대연동");
        Teacher teacher = new Teacher("김이", "백운초");

        System.out.println(objectTest);
        System.out.println(teacher);
    }
}
