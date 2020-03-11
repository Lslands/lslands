package com.lslands.service;

import com.lslands.bean.Comment;

import java.util.List;

/**
 * Created by lslands on 2020/3/7.
 */
public interface CommentService {

    //获取列表
    List<Comment> listCommentByBlogId(Long blogId);

    //保存comment对象数据
    Comment saveComment(Comment comment);
}
