package com.project.step_definitions.dummy;

import static org.assertj.core.api.Assertions.assertThat;

import com.project.URLHelper;
import com.project.dto.dummy.comments.response.Comment;
import com.project.dto.dummy.comments.response.CommentsResponse;
import com.project.utilities.Requests;
import com.project.utilities.SharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommnetsStepDefinitions {
  @When("I get all comments from the commnets service")
  public void i_get_all_comments_from_the_commnets_service() {
    SharedObjects.response = Requests.getRequest(URLHelper.COMMENTS_SERVICE);
  }

  @Then("the response code is {int}")
  public void the_response_code_is(int statusCode) {
    // SharedObjects.response.then().assertThat().statusCode(statusCode);
    assertThat(SharedObjects.response.statusCode()).isEqualTo(statusCode);
  }

  @Then("the comments details are returned correctly")
  public void the_comments_details_are_returned_correctly() {

    SharedObjects.response.prettyPrint();
//    Gson gson = new Gson();
//    CommentsResponse commentsResponse =
//        gson.fromJson(SharedObjects.response.getBody().asString(), CommentsResponse.class);
    CommentsResponse commentsResponse = SharedObjects.response.as(CommentsResponse.class);
    assertThat(commentsResponse.getComments()).isInstanceOf(Comment[].class);
    assertThat(commentsResponse.getTotal()).isNotEqualTo(0);
    Comment[] comments = commentsResponse.getComments();
    for (Comment each : comments) {
      assertThat(each.getBody()).isNotNull();
    }
  }
}
