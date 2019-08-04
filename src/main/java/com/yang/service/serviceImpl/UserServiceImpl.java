package com.yang.service.serviceImpl;

import com.yang.dao.SsmUserMapper;
import com.yang.po.SsmUser;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: shanfy
 * @Date: 2019/7/28 14:31
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private SsmUserMapper ssmUserMapper;

    @Override
    public SsmUser getUserById(int userId) {
        return ssmUserMapper.queryByPrimaryKey(userId);
    }

    @Override
    public void insertUser(SsmUser user) {
        ssmUserMapper.insertUser(user);

    }

    @Override
    public void addUser(SsmUser user) {
        ssmUserMapper.insertUser(user);
    }

    @Override
    public List<SsmUser> getAllUser() {
        return ssmUserMapper.getAllUser();
    }
}
