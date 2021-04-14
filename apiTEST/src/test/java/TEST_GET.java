import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class TEST_GET {
    @Test
    public void test_1(){
        given().
                get("https://reqres.in/api/users?page=2").andReturn().
                then().
                statusCode(200).
                body("data.id[1]",equalTo(8)).
                body("data.first_name",hasItems("Michael","Lindsay"));


    }
}
