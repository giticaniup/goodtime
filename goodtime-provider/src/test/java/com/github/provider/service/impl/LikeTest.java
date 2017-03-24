package com.github.provider.service.impl;

import com.github.api.entity.Like;
import org.junit.Test;

/**
 * Created by zhongcy on 2017-03-24.
 */
public class LikeTest {
    @Test
    public void testLombok(){
        Like like = new Like();
        like.setLikeTime(System.currentTimeMillis());
        System.out.println(like);
    }
}
