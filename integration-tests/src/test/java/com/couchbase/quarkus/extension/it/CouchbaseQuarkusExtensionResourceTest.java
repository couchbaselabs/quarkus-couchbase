package com.couchbase.quarkus.extension.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CouchbaseQuarkusExtensionResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/couchbase-quarkus-extension")
                .then()
                .statusCode(200)
                .body(is("Hello couchbase-quarkus-extension"));
    }
}
