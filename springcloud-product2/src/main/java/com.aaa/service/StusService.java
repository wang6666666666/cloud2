package com.aaa.service;

import com.aaa.dao.StusDao;
import com.aaa.entity.Stus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StusService {
    @Resource
    StusDao dao;

    public List<Stus> findAll(){
        return dao.findAll();
    }

    public int deleteById(Integer id){
        return dao.deleteByPrimaryKey(id);
    }

    public int add(Stus stus){
        return dao.insert(stus);
    }

    public int update(Stus stus){
        return dao.updateByPrimaryKey(stus);
    }
}
