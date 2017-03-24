package com.github.provider.service.impl;

import com.github.api.entity.DiaryGroup;
import com.github.api.service.DiaryGroupService;
import com.github.provider.dao.DiaryGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 日志类别实现类
 * Created by zhongcy on 2016/11/30.
 */
@Service("diaryGroupService")
public class DiaryGroupServiceImpl implements DiaryGroupService {

    @Autowired
    private DiaryGroupMapper diaryGroupMapper;

    @Override
    public List<DiaryGroup> getDiaryGroup(Integer userId) {
        return diaryGroupMapper.findDiaryGroupList(userId);
    }

    @Override
    public void addDiaryGroup(DiaryGroup diaryGroup) {
        diaryGroupMapper.insertSelective(diaryGroup);
    }

    @Override
    public void updateDiaryGroup(DiaryGroup diaryGroup) {
        diaryGroupMapper.updateByPrimaryKeySelective(diaryGroup);
    }

    @Override
    public void deleteDiaryGroup(Integer id) {
        diaryGroupMapper.deleteByPrimaryKey(id);
    }
}
