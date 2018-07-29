package com.milCheck.dao;

import com.milCheck.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserMapper {
    public List<String> getUserInfo();

    public List<User> getUserInfoByName(String username);
}
