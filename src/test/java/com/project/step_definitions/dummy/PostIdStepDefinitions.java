package com.project.step_definitions.dummy;

import com.project.URLHelper;
import com.project.dto.dummy.comments.response.Comment;
import com.project.dto.dummy.comments.response.CommentsResponse;
import com.project.utilities.Requests;
import com.project.utilities.SharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;
public class PostIdStepDefinitions {
    @When("I get comments of post with id {int}")
    public void i_get_comments_of_post_with_id(Integer int1) {

        SharedObjects.response= Requests.getRequest(URLHelper.COMMENTS_SERVICE+"/post/"+5);

    }

    @Then("all comment of posts are with id {int}")
    public void all_comment_of_posts_are_with_id(Integer int1) {
        SharedObjects.response.prettyPrint();
        CommentsResponse commentsResponse=SharedObjects.response.as(CommentsResponse.class);
        Comment[] comments=commentsResponse.getComments();

        for (Comment each:comments ) {
            assertThat(each.getPostId()).isEqualTo(5);

        }





    }

}
