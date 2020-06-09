import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestTemplTest {

    @Test
    public void checkStatusCode() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Users[]> responseEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users",Users[].class);
        int actualStatusCode = responseEntity.getStatusCode().value();
        Assert.assertEquals(actualStatusCode, 200);

    }
    @Test
    public void checkResponseHeader() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Users[]> responseEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Users[].class);
        HttpHeaders headers = responseEntity.getHeaders();
        String actContentTypeHeader = headers.getContentType().toString();
        Assert.assertEquals(actContentTypeHeader, "application/json;charset=utf-8");

}
    @Test
    public void checkResponseBody() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Users[]> responseEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Users[].class);
        Users[] users = responseEntity.getBody();
        Assert.assertEquals(users.length, 10);


    }
}
