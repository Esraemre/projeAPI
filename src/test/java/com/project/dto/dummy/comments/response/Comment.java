package com.project.dto.dummy.comments.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private int id;
    private String body;
    private int postId;
    private User user;

}
