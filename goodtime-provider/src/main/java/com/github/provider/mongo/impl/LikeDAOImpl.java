package com.github.provider.mongo.impl;

import com.github.api.entity.Like;
import com.github.provider.mongo.LikeDAO;
import org.springframework.stereotype.Repository;

/**
 * LikeDAO
 * Created by zhongcy on 2017-03-25.
 */
@Repository
public class LikeDAOImpl extends BaseOptionsImpl<Like> implements LikeDAO{
    @Override
    protected Class<Like> getEntryClass() {
        return Like.class;
    }
}
