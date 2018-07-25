package milCheck.user.service;

import milCheck.user.dao.IUserDAO;
import milCheck.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService{
    @Autowired
    private IUserDAO dao;

    @Override
    public User getUserInfoByName(String username){
        return dao.getUserInfoByName(username);
    }
}
