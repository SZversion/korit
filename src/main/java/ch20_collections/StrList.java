package ch20_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    public static void main(String[] args) {
        List<String> strList1 = new ArrayList<>();
        String[] strArray1 = new String[2];

        strArray1[0] = "김영";
        strList1.add("java");
        strList1.add("python");
        strList1.add("c#");
        strList1.add("JavaScript");
        strList1.add("Kotlin");

        System.out.println(strArray1);
        System.out.println(Arrays.toString(strArray1));
        System.out.println(strList1);
//        배열은 출력하기 위해 매서드를 경유 해야 하지만 리스트는 바로 출력이 됨


//        특정 element의 포함 여부 -> contains() 매서드를 사용 -> return boolean
        System.out.println(strList1.contains("java"));

//        특정 element의 삭제 -> remove() -> 삭제 이후 boolean 타입이 반환됨 삭제되면 true 없어서 삭제 못하면 false
        System.out.println(strList1.remove("java"));
        System.out.println(strList1);
        strList1.add("Java");

//        Collections.sort()로 정렬 / 하지만 유니코드 기반 정렬이라서 잘 쓰지않음
        Collections.sort(strList1);
        System.out.println(strList1);

//        .length가 없어서 배열로 변환 후 사용하거나 .size()를 사용
        System.out.println(strList1.toArray().length);
        System.out.println(strList1.size());
        
//        값들 뽑아서 사용 가능
        for(int i=0; i< strList1.size(); i++) {
            System.out.print(strList1.get(i) + " 언어, ");
        }
        System.out.println();
        for(String elem : strList1) {
            System.out.print(elem + " 언어, ");
        }
    }
}