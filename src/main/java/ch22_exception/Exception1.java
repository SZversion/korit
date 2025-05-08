package ch22_exception;

public class Exception1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch(java.lang.Exception e) {    // 예외들의 상위 클래스 Exception
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("프로그램 실행 종료");
        }
    }
}
 