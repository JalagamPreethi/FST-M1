package LiveProject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.client.fluent.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.Matchers.lessThan;

public class GitHubProjectTest {
    //SSH Key to test with
    String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIGJwB6M0D/IEjYBypwwylCLvkC7MqvUGXJAR5EvQtzhk ";
    int sshKeyId;
    //Request Specification
    RequestSpecification requestSpec = new RequestSpecBuilder().setBaseUri("https://api.github.com/user/keys").addHeader("Authorization","token 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")
            .addHeader("Content-Type","application/json").build();
    //Response Specification
    ResponseSpecification responseSpec = new ResponseSpecBuilder().expectResponseTime(lessThan(4000L)).expectBody("Key",equalTo(sshKey)).expectBody("title",equalTo("TestAPIKey")).build();

    @Test(priority = 1)
    public void postRequestTest() {
        //RequestBody
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("title", "TestAPIKey");
        reqBody.put("key", sshKey);
        //Generate Response
        Response response = (Response) given().spec(requestSpec).body(reqBody).when().post();
        //Extract the ID
        sshKeyId = response.then().extract().path("id");
        //Assertion
        response.then().statuscode(201).spec(responseSpec);
    }
    @Test(priority = 2)
    public void getRequestTest()
    {
        //Generate response and assert
        given().spec(requestSpec).pathParam("keyId", sshKeyId).when().get("/{keyId}").then().statusCode(200).spec(responseSpec);


    }
    @Test(priority = 3)
    public void deleteRequestTest()
    {
        //Generate response and assert
        given().spec(requestSpec).pathParam("keyId",sshKeyId).when().delete("/{keyId}").then().statusCode(204).time(lessThan(3000L));
    }
}