import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestAssuredTest {

    @BeforeTest
    public void initTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
    @Test
    public void checkStatusCode() {
        Response response = RestAssured.when().get("/users").andReturn();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void checkResponseHeader() {
        Response response = RestAssured.when().get("/users").andReturn();
        Assert.assertEquals(response.getHeader("Content-Type"), "application/json; charset=utf-8");
    }
    @Test
    public void checkResponseBody() {
        Response responseBody = RestAssured.when().get("/users").andReturn();
        Users[] users = responseBody.getBody().as(Users[].class);
        System.out.println(users.length);
        Assert.assertEquals(users.length, 10);
    }
}
