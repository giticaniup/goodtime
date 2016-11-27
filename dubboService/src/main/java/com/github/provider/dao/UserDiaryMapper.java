package com.github.provider.dao;

import com.github.api.entity.UserDiary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDiaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDiary record);

    int insertSelective(UserDiary record);

    UserDiary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDiary record);

    int updateByPrimaryKeyWithBLOBs(UserDiary record);

    int updateByPrimaryKey(UserDiary record);

    List<UserDiary> selectByUserId(@Param("userId") int userId, @Param("fromRow") int fromRow, @Param("pageSize") int
            pageSize);

    List<UserDiary> selectByDate(@Param("userId") int userId, @Param("fromRow") int fromRow, @Param("pageSize") int
            pageSize, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    /**
     * 查询符合条件的日志数量
     * @param userId    userId
     * @param beginTime 开始时间，选填
     * @param endTime   结束时间，选填
     * @return
     */
    int selectCount(@Param("userId") int userId, @Param("beginTime") String beginTime, @Param("endTime") String endTime);
}