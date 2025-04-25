package ch11_access_modifier;

public class Bank {
    private int accountNum;           //계좌번호
    private String accountHolder;     //예금주
    private int balance;              //잔액
    private int pinNumber;            //비밀번호

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance<0) {
            System.out.println("음수는 입력이 불가능 합니다.");
            return;
        }
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if(0 < pinNumber && pinNumber < 9999) {
            this.pinNumber = pinNumber;
        } else {
            System.out.println("불가능한 비밀번호 입니다.");
        }
    }

    public void deposit(int amount, int inputPin) {
        if(inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else if(amount < 0) {
            System.out.println("금액에 음수는 입력 할 수 없습니다.");
        } else if(inputPin == pinNumber && amount > 0) {
            balance += amount;
            System.out.println("입금 성공! " + accountHolder + "님의 현재 잔액 : " + this.balance);
        }
        System.out.println("\n");
    }

    public void withdraw(int amount, int inputPin) {
        if(inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else if(amount < 0) {
            System.out.println("금액에 음수는 입력 할 수 없습니다.");
        } else if(balance < amount) {
            System.out.println("잔액 부족");
        } else if(inputPin == pinNumber && amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("출금 성공! "+ accountHolder +"님의 현재 잔액 : " + this.balance);
        }
        System.out.println("\n");
    }

    public void showAccountInfo() {
        System.out.println(accountHolder + "님의 계좌번호는 " + accountNum + "이며, 현재 잔액은 " + balance + "원 입니다.");
    }

    public void displayInfo() {
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("계좌 잔액 : " + balance + "\n");
    }
}