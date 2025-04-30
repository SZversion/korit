package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("qwer");

        System.out.println(user1);
        System.out.println();

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(1234);
        user2.setEmail("bbb@test.com");
        user2.setName("zxcv");

        System.out.println(user2);
        System.out.println();
    }
}