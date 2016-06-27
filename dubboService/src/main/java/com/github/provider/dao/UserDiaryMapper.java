package com.github.provider.dao;

import com.github.api.entity.UserDiary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDiaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDiary record);

    int insertSelective(UserDiary record);

    UserDiary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDiary record);

    int updateByPrimaryKeyWithBLOBs(UserDiary record);

    int updateByPrimaryKey(UserDiary record);

    List<UserDiary> selectByUserId(@Param("userId") int userId,@Param("fromRow") int fromRow,@Param("pageSize") int
            pageSize);
}