package com.project.step_definitions.dummy;
import static org.assertj.core.api.Assertions.assertThat;
import com.project.URLHelper;
import com.project.dto.dummy.comments.response.Comment;
import com.project.dto.dummy.comments.response.CommentsResponse;
import com.project.utilities.Requests;
import com.project.utilities.SharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingleCommentStepDefinitions {
    @When("I get a single comment from comments service")
    public void i_get_a_single_comment_from_comments_service() {

        SharedObjects.response= Requests.getRequest(URLHelper.COMMENTS_SERVICE+"/"+1);

    }

    @Then("the comment's details are returned correctly")
    public void the_comment_s_details_are_returned_correctly() {
        /*
    - check the comment's id and postId are integer
	- check the comment's user's id is integer
	- check the comment's user's username is not null

         */

        SharedObjects.response.prettyPrint();

        Comment comment=SharedObjects.response.as(Comment.class);
        assertThat(comment.getId()).isGreaterThan(0);
        assertThat(comment.getPostId()).isGreaterThan(0);
        assertThat(comment.getUser().getId()).isGreaterThan(0);
        assertThat(comment.getUser().getUsername()).isNotNull();

    }
}
