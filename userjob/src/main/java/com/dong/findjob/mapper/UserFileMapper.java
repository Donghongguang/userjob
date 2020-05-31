package com.dong.findjob.mapper;

import com.dong.findjob.entity.UserFile;
import com.dong.findjob.entity.UserFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFileMapper {
    long countByExample(UserFileExample example);

    int deleteByExample(UserFileExample example);

    int deleteByPrimaryKey(Integer iduserFile);

    int insert(UserFile record);

    int insertSelective(UserFile record);

    List<UserFile> selectByExample(UserFileExample example);

    UserFile selectByPrimaryKey(Integer iduserFile);

    int updateByExampleSelective(@Param("record") UserFile record, @Param("example") UserFileExample example);

    int updateByExample(@Param("record") UserFile record, @Param("example") UserFileExample example);

    int updateByPrimaryKeySelective(UserFile record);

    int updateByPrimaryKey(UserFile record);
}