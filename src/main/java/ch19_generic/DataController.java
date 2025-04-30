package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();


        //data의 타입을 String 으로 쓰겠다고 선언
        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공", now.toString());
        //하지만 <T> 에서 T가 클래스이기 때문에 기본 자료형은 들어 갈 수 없음 int는 안되고 Integer 같은것만 가능
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장 성공", 123);
        ResponseData<Date> responseData3 = new ResponseData<>("날짜 객체 저장 성공", now);

        System.out.println(responseData1);
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
