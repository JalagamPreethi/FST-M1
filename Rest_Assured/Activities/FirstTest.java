package Example;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FirstTest {
    String baseURI = "https://petstore.swagger.io/v2/pet";


    @Test
    public void GetRequestWithQueryParam() {
        //send the request

        Response response =
                given().header("Content-Type","application/json").queryParam("status","sold") // Set headers
                        .when().get(baseURI + "/findByStatus?status=sold"); // Run GET request
System.out.println("As String: " +response.getBody().asString());
        //Extractions
        String petName = response.then().extract().body().path("[0].name");
        // Assertions
        Assert.assertEquals(petName,"doggie");
        //RESTAssured assertions
        response.then().statusCode(200);
        response.then().body("[0].name",equalTo("doggie"));

    }
    @Test
    public void getRequestWithPathParam()
    {
        //send the request
        given().header("Content-Type","application/json").pathParam("petId",1).when().get(baseURI +"/{petId}").then().statusCode(200).body("name",equalTo("doggie"));
    }

}




