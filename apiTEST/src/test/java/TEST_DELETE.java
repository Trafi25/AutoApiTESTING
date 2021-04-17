import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class TEST_DELETE {
    private static final int STATUS_CODE = 401;
    @Test
    public void tetstdeleteoneofbettercats(){


                when().
                delete("https://api.thecatapi.com/v1/favourites/1").
                then().statusCode(STATUS_CODE).
                log().all();
    }
}
