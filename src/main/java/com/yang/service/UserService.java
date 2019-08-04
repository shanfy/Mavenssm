package com.yang.service;

import com.yang.po.SsmUser;

import java.util.List;

/**
 * @Author: shanfy
 * @Date: 2019/7/28 14:30
 */
public interface UserService {
    public SsmUser getUserById(int userId);

    public void insertUser(SsmUser user);

    public void addUser(SsmUser user);

    public List<SsmUser> getAllUser();
}
