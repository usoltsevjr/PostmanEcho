package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void ShouldReturnSomeData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Something new") // отправляемые данные

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo ("Something new"))
        ;
    }
}
