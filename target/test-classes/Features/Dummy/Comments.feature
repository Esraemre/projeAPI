#comments/get:
#- check comments are returned in an array
#- check the total number of comments is returned
#- check the body of every comment is not null

@api
Feature: Comments

  Scenario: Get all comments
    When I get all comments from the commnets service
    Then the response code is 200
    And the comments details are returned correctly

  Scenario: Get a single comment
    When I get a single comment from comments service
    Then the response code is 200
    And the comment's details are returned correctly

  Scenario: Get comments and limit to 10
    When I get 10 comments from the commnets service
    Then the response code is 200
    And the total number of comments is 10

    Scenario: Get all comments by post id
      When I get comments of post with id 5
      Then the response code is 200
      And all comment of posts are with id 5


