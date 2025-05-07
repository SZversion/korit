package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        strMap1.put("kor1", "김일");
        strMap1.put("kor2", "김이");
        strMap1.put("kor3", "김삼");
        strMap1.put("kor4", "김사");

        System.out.println(strMap1);

        strMap1.put("kor1", "KimOne");
        System.out.println(strMap1);
//        Map의 Key 에는 하나의 Value만 대응됨
//        Key 값이 동일하다면 Value 값은 최근 것으로 덮어씌워짐

//        Map의 경우는 순서가 없는 대신 Key가 있기 때문에
        System.out.println("get Key : " + strMap1.get("kor1"));
//        Java -> Map 에서의 key-value pair를 entry 라고 함

        strMap1.put("kor1", "김일");
        System.out.println("put 으로 덮어쓰기" + strMap1.get("kor1"));
        strMap1.replace("kor1", "Kim1");
        System.out.println("replace로 덮어쓰기" + strMap1.get("kor1"));
        
//        특정 키의 존재 여부 -> containsKey() -> return boolean
        System.out.println(strMap1.containsKey("kor1"));
//        특정 값의 존재 여부 -> containsValue() -> return boolean
        System.out.println(strMap1.containsValue("김일"));

//        Map의 엔트리(키-값 쌍)로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();     //비어있는 Set
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();  //Map의 값을 Set에 삽입

        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println("entrySet2 의 크기 : " + entrySet2.size());                           //5가 출력되는걸 보니 "key=value"가 하나의 element로 삽입됨

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        Map 에서 List 로의 형변환을 하려면 Set을 경유해야 함
        entryList1.addAll(strMap1.entrySet());
        List<Map.Entry<String, String>> entryList2 = entryList1;

        System.out.println(entryList2);
    }
}
