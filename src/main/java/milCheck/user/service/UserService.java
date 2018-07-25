package milCheck.user.service;

import milCheck.user.dao.IUserDAO;
import milCheck.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserDAO dao;

    public User getUserInfoByName(String username){
        return dao.getUserInfoByName(username);
    }


}
