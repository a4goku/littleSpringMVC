package com.milCheck.service;

import com.milCheck.dao.IUserMapper;
import com.milCheck.model.User;
import com.milCheck.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService implements IUserService{
    @Autowired
    private IUserMapper userMapper;

    public List<User> getUserInfoByName(String username){
        List<User> userList = userMapper.getUserInfoByName(username);
        for (User user : userList){
            System.out.println(user.getPassword());
        }

        return null;
        //return dao.getUserInfoByName(username);
    }
    /*
    public IUserMapper getDao(){
        return dao;
    }

    public void setDao(IUserMapper dao){
        this.dao = dao;
    }

    public static void main(String[] args){
        getUserInfo();
    }

    private static void getUserInfo() {
        SqlSession session = DBTools.getSession();
        IUserMapper userDAO = session.getMapper(IUserMapper.class);
        try {
            List<String> ttt = userDAO.getUserInfo();
            for(String t : ttt){
                System.out.println(t);
            }

            session.commit();
        } catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }

    }
    */
}
