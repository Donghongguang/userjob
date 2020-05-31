package com.dong.findjob.mapper;

import com.dong.findjob.entity.UserJob;
import com.dong.findjob.entity.UserJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserJobMapper {
    long countByExample(UserJobExample example);

    int deleteByExample(UserJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserJob record);

    int insertSelective(UserJob record);

    List<UserJob> selectByExample(UserJobExample example);

    UserJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserJob record, @Param("example") UserJobExample example);

    int updateByExample(@Param("record") UserJob record, @Param("example") UserJobExample example);

    int updateByPrimaryKeySelective(UserJob record);

    int updateByPrimaryKey(UserJob record);
}