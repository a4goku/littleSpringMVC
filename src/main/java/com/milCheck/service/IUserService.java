package com.milCheck.service;

import com.milCheck.model.User;

import java.util.List;

public interface IUserService {
    public List<User> getUserInfoByName(String userName);
}
