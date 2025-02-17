package LiveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    //Declare Header

    Map<String,String> headers = new HashMap<>();

    //Create the project
    @Pact(consumer = "UseConsumer",provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder)
    {
        //Headers
        headers.put("Content-Type","application/json");
        //Request and Response body
        DslPart requestResponseBody = new PactDslJsonBody().
                numberType("id",123)
                .stringType("firstName","Preethi")
                .stringType("lastName","Rao")
                .stringType("emai","Preethi@example.com");
        //Generate Contract
        return builder.given("Post Request").uponReceiving("request to create a user").method("Post")
                .path("/api/users").headers(headers).body(requestResponseBody).willRespondWith().status(201).
                body(requestResponseBody).toPact();
    }
    //Test with mock provider
    @Test
    @PactTestFor(providerName = "UserProvider",port = "8282")
    public void consumerTest()
    {
        //Request Body
        Map<String,Object> reqBody = new HashMap<>();
        reqBody.put("id",123);
                reqBody.put("firstName","Preethi");
                reqBody.put("lastName","Rao");
                reqBody.put("email","Preethi@example.com");

                //Send Request
        given().headers(headers).body(reqBody).log().all().when().post("http://localhost:8282/api/users").then().statusCode(201).body("firstName",equalTo("Preethi")).log().all();
    }



}
