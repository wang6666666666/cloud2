package com.aaa.dao;

import com.aaa.entity.Stus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StusDao extends tk.mybatis.mapper.common.Mapper<Stus> {
    @Select("select id,cname,sname from stus")
    List<Stus> findAll();

//    @Select("delete from stus where id=#{id}")
//    int delete(Integer id);
//
//    @Select("update stus set cname=#{cname},sname=#{sname} where id=#{id}")
//    int update(Stus stus);
}
