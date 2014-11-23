package com.pfs.dao;

import com.pfs.pojo.User;

public interface UserMapper {
    public User findById(String Id);
    public User findByAge(String Id);
}  