package ch12_array;
/*
    향상된 for문

    일반 for 문과의 차이점 :
        일반 for문의 경우 인덱스 넘버를 명확하게 알고 있어야 하지만 일일히 element의 숫자를 세는 것이 번거롭기 때문에 배열명, length와 같은 방식으로 int값을 추출해서 한계값에 대입

        for문의 int i 는 for 문 내에서 선언됨(일종의 지역 변수)
        이를 응용하여 배열내의 element의 변수에 대입하는 지역 변수를 선언하는 방식으로 index넘버의 사용 없이 바로 적용 가능한 for문이 향상된 for문

    제약 :
        읽기만 되고, 쓰기는 안됨

    형식 :
        for(자료형 변수명 : 반복가능객체(배열 등)) {
            반복 실행문
        }
*/
public class Array06EnhancedFor {
    public void printElement(String[] names) {
        for(String name : names) {
            System.out.print("이름 : " + name + "\n");
        }
    }
    public void printElement(int[] numbers) {
        for(int num : numbers) {
            System.out.print("숫자 : " + num + "\n");
        }
    }


    
    public static void main(String[] args) {
        Array06EnhancedFor array06 = new Array06EnhancedFor();

        int[] numbers = new int[200];
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = i+1;
        }

        String[] names = {"강미경", "김광호", "김규철", "김대웅", "김명규", "김민성", "김민효",
                "김서준", "김선영", "김재원", "김종보", "김호섭", "노소정", "염진우", "예영근",
                "이수원", "이진혁", "정선유", "제다정"};

        array06.printElement(numbers);
        array06.printElement(names);
    }
}
