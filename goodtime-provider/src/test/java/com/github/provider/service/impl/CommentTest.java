package com.github.provider.service.impl;

import com.github.api.entity.Activity;
import com.github.api.entity.Comment;
import com.github.api.service.ActivityService;
import com.github.api.service.CommentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 评论Service测试
 * Created by zhongcy on 2017-03-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class CommentTest {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private CommentService commentService;

    private Comment comment;
    private List<Activity> activityList;

    @Before
    public void assembleComment() {
        activityList = activityService.listActivity("zhongcy");
        System.out.println(new Date());
        comment = new Comment();
        comment.setTargetId(activityList.get(0).getId());
        comment.setContent("this is a funny activity");
        comment.setDate(new Date());
        comment.setFromUser("zhongcy");
    }

    @Test
    public void testSaveComment(){
        commentService.saveComment(comment);
    }

    @Test
    public void testListCommentByTargetId(){
        System.out.println(commentService.listCommentByTargetId(activityList.get(0).getId()));
    }
}
