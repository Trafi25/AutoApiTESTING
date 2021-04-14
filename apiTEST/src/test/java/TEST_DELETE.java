import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class TEST_DELETE {
    @Test
    public void tetst_1_delete(){


                when().
                delete("https://reqres.in/api/users/2").
                then().statusCode(204).
                log().all();
    }
}
