package com.github.provider.dao;

import com.github.api.entity.DiaryGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiaryGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiaryGroup record);

    int insertSelective(DiaryGroup record);

    DiaryGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiaryGroup record);

    int updateByPrimaryKey(DiaryGroup record);

    List<DiaryGroup> findDiaryGroupList(@Param("userId") Integer userId);
}