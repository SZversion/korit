package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank(123456, "홍길동", 100000, 1234);
        Bank bank2 = new Bank(987654, "신사임당", 500000, 1234);

        bank1.displayInfo();
        bank2.displayInfo();

        bank1.deposit(50000, 1234);
        bank1.withdraw(200000, 1234);
        bank1.withdraw(100000, 1234);

        bank2.withdraw(100000, 1234);
        bank2.deposit(200000, 1234);

        System.out.println("최종 계좌 정보");
        bank1.displayInfo();
        bank2.displayInfo();
    }
}