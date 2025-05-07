package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

//        Java Object to Json
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        userJson = gson.toJson(user1);
        System.out.println(userJson);

        System.out.println();

        userJson = gsonBuilder.toJson(user1);
        System.out.println(userJson);


//        jsonObject to json
        JsonObject user2 = new JsonObject();
        user2.addProperty("studentCode", "2025001");
        user2.addProperty("studentName", "김이");
        user2.addProperty("studentYear", 2);
        user2.addProperty("score", 96.7);

        userJson = gsonBuilder.toJson(user2);
        System.out.println(userJson);

//        Map to json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA");
        map1.put("productName", "삼성 갤럭시북 프로 5");

        userJson = gsonBuilder.toJson(map1);
        System.out.println(userJson);

//        json to Map / Object
        Map<String, String> map2 = gson.fromJson(userJson, Map.class);
        System.out.println(map2);

        User user3 = gson.fromJson(userJson, User.class);
        System.out.println(user3.getUsername());
    }
}
