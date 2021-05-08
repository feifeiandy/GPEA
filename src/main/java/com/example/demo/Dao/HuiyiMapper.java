package com.example.demo.Dao;

import com.example.demo.Entity.Huiyi;
import com.example.demo.Entity.HuiyiExample;
import java.util.List;
//需要在maven中导入mybatis包
import com.example.demo.Entity.HuiyiGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HuiyiMapper {
    long countByExample(HuiyiExample example);

    int deleteByExample(HuiyiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Huiyi record);

    int insertSelective(Huiyi record);

    List<Huiyi> selectByExampleWithBLOBs(HuiyiExample example);

    List<Huiyi> selectByExample(HuiyiExample example);

    Huiyi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Huiyi record, @Param("example") HuiyiExample example);

    int updateByExampleWithBLOBs(@Param("record") Huiyi record, @Param("example") HuiyiExample example);

    int updateByExample(@Param("record") Huiyi record, @Param("example") HuiyiExample example);

    int updateByPrimaryKeySelective(Huiyi record);

    int updateByPrimaryKeyWithBLOBs(Huiyi record);

    int updateByPrimaryKey(Huiyi record);

    List<HuiyiGroup> getgroups();
}