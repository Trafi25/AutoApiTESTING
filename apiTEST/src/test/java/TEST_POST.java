import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TEST_POST {

    private static final String BASE_URI = "https://reqres.in/api/users";
    @Test
    public void tetst_1_post(){


        JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");
        System.out.println(request);

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post(BASE_URI).
                then().statusCode(201);
    }
}
