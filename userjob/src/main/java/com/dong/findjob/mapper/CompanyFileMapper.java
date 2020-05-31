package com.dong.findjob.mapper;

import com.dong.findjob.entity.CompanyFile;
import com.dong.findjob.entity.CompanyFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyFileMapper {
    long countByExample(CompanyFileExample example);

    int deleteByExample(CompanyFileExample example);

    int deleteByPrimaryKey(Integer idcompanyFile);

    int insert(CompanyFile record);

    int insertSelective(CompanyFile record);

    List<CompanyFile> selectByExample(CompanyFileExample example);

    CompanyFile selectByPrimaryKey(Integer idcompanyFile);

    int updateByExampleSelective(@Param("record") CompanyFile record, @Param("example") CompanyFileExample example);

    int updateByExample(@Param("record") CompanyFile record, @Param("example") CompanyFileExample example);

    int updateByPrimaryKeySelective(CompanyFile record);

    int updateByPrimaryKey(CompanyFile record);
}