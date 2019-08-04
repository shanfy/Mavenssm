package com.yang.dao;

import com.yang.po.SsmUser;
import com.yang.po.SsmUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.xml.registry.infomodel.User;
@Repository
public interface SsmUserMapper {
    public SsmUser queryByPrimaryKey(Integer id);

    public List<SsmUser> getAllUser();

    public void insertUser(SsmUser user);

    public void insertUserByBatch(List<SsmUser> list);

    public void deleteByPrimaryKey(Integer id);

    public void delteUserByBatch(Map<String, Object> params);

    public void updateByPrimaryKey(SsmUser user);
}