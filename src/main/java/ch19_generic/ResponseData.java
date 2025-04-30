package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data                       // @Data에 toString()이 포함됨
public class ResponseData<T> {
    private String message;
//    private String data;
//    private int data;
//    private double data;  이렇게 하지 않고 T 하나로 퉁칠수있음
    private T data;

    @Override
    public String toString() {
        return
                "message=" + message +
                ", data=" + data;
    }
}