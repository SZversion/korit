package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class JSON {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
//        addProperty() 를 통해 속성(key-value) 추가
        jsonObject.addProperty("username", "김일");
        jsonObject.addProperty("password", 1234);
        jsonObject.addProperty("score", 90.5);

        System.out.println(jsonObject);

        /*
        *   Json VS Map
        *   ""로 표현되는 부분 등 출력시 출력 결과의 디테일이 다름
        *   Map key=value
        *   Json key : value
        */


//        json 파일처럼 출력 해 줌
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);                          //json 은 객체임 즉 객체를 JSON 으로 변환 한 것
        System.out.println(json);





        /*
        *   jsonObject에 숫자 넣으면 기본으로 double로 들어가는데 그걸 int로 변환 하려면
        *   map.get() 쓰면 object가 튀어나오니까 그걸 String 으로 변환한걸 double로 변환해서 그걸 다시 int로 변환하는 이게 맞는거임?
        */
        Map map1 = gson.fromJson(json, Map.class);
        double pass1 = (Double)map1.get("password");
        System.out.println((int)Math.round(pass1));


        /*
        *   JsonElement 라는게 있음(gson 꺼) 이거 쓰고 getAs 쓰니까 훨씬 깔끔함
        */
        JsonElement pass2 = jsonObject.get("password");
        System.out.println(pass2.getAsInt());
    }
}