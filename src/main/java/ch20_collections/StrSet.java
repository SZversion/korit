package ch20_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
*   Set는 순서도 없고 중복도 허용하지 않음
*   수학에서의 집합의 개념을 구현 한 것
*   List를 통해 전체 설문을 받고 Set를 통해 중복을 제거하는 등
*   List -> Set / Set -> List 로의 형변환이 매우 중요함
*/
public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("1");
        strSet1.add("1");

        System.out.println(strSet1);

//        for(int i=0; i< strSet1.size(); i++) {
//            System.out.print(strSet1.get() + " 언어, ");
//        }
//        .get()은 인덱스 넘버가 필요해서 순서가 없는 Set 에서는 사용 할 수 없음
//        특정 값을 출력하기 위해서 List로 변환 할 필요가 있음
        System.out.println();
        for(String elem : strSet1) {
            System.out.print(elem + " 출력, ");
        }
        System.out.println();

//        List로 변환 후 출력
        strList1.addAll(strSet1);
        for(int i=0; i<strList1.size(); i++) {
            System.out.println(strList1.get(i));
        }
    }
}
