package ch22_exception;

// 사용자 정의 예외
class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
        System.out.println("예외 발생");
    }
}
public class Exception2 {
    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1234";

        if(!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("ID 또는 비밀번호가 틀렸습니다.");
        }
    }
    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "qwer";
        
        try {
            login(inputId, inputPassword);
        }   catch(LoginFailedException e) {
            System.out.println(e.getMessage());
        }   finally {
            System.out.println("프로그램 종료");
        }
    }
}
