import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;



public class TEST_GET{

    private static final int STATUS_CODE_OK = 200;
    private static final int STATUS_NOT_FOUND = 404;
    private static final String BASE_URI = "https://api.thecatapi.com";


    @Before
    public void setUp() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    public void testgetcatigorieslist(){

        Helper.GetResourse("/v1/categories")
                .then()
                .statusCode(STATUS_CODE_OK)
                .log().body();

    }


    @Test
    public void testfakegetcatigorieslist(){

        Helper.GetResourse("/v2/categories")
                .then()
                .statusCode(STATUS_NOT_FOUND)
                .log().body();

    }

    @Test
    public void testketegorieslistbuid(){

        Helper.GetResourse("/v1/images/search")

                .then()
                .statusCode(STATUS_CODE_OK)
                .body(Matchers.notNullValue())
                .log().body();

    }
}
