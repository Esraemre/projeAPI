package com.project.dto.dummy.comments.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentsResponse {

    private Comment[] comments;
    private int total;
    private int skip;
    private int limit;




}
