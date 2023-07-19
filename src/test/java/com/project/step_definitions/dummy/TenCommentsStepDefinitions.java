package com.project.step_definitions.dummy;

import static org.assertj.core.api.Assertions.assertThat;

import com.project.URLHelper;
import com.project.dto.dummy.comments.response.CommentsResponse;
import com.project.utilities.Requests;
import com.project.utilities.SharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TenCommentsStepDefinitions {
  @When("I get {int} comments from the commnets service")
  public void i_get_comments_from_the_commnets_service(int int1) {
    SharedObjects.response =
        Requests.getRequest(URLHelper.COMMENTS_SERVICE + "?limit=10&skip=10&select=body,postId");
  }

  @Then("the total number of comments is {int}")
  public void the_total_number_of_comments_is(int limit) {
    SharedObjects.response.prettyPrint();

    CommentsResponse commentsResponse = SharedObjects.response.as(CommentsResponse.class);
    assertThat(commentsResponse.getLimit()).isEqualTo(limit);
  }
}
