package com.milCheck.service;

import com.milCheck.model.User;
import com.milCheck.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService implements IUserService{
    //private IUserMapper dao;

    public List<User> getUserInfoByName(String username){
        System.out.println("--------------进入了userService--------------");
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
