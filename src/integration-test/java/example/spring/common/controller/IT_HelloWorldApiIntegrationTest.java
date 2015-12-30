package example.spring.common.controller;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;

public class IT_HelloWorldApiIntegrationTest
{
    @Test
    public void integrationTestIt() throws InterruptedException
    {
        Thread.sleep(10000);
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setContentType("application/json; charset=UTF-8");
        RequestSpecification requestSpec = builder.build();

        String greetingMessage = given(requestSpec).when().get("http://localhost:9090/spring-mvc-testing-example/hello")
                .then().statusCode(200)
                .extract().path("greeting");

        Assert.assertEquals(greetingMessage, "Hello World!!");
    }
}
