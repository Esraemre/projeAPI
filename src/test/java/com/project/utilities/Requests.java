package com.project.utilities;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Requests {

  //    private static final Map<String, String> headers =
  //            Maps.newHashMap("Authorization", URLHelper.ACCESS_TOKEN);

  public static Response getRequest(String url) {
    return given().when().get(url);
  }

  public static Response postRequest(String url, String body) {

    return given().contentType(ContentType.JSON).body(body).when().post(url);
  }

  public static Response patchRequest(String url, String body) {

    return given().contentType(ContentType.JSON).body(body).when().patch(url);
  }

  public static Response deleteRequest(String url) {

    return given().accept(ContentType.JSON).when().delete(url);
  }
}
