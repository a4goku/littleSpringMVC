package milCheck.user.service;

import milCheck.user.dao.IUserDAO;
import milCheck.user.pojo.User;

public class UserService implements IUserService{
    private IUserDAO dao;

    public User getUserInfoByName(String username){
        return dao.getUserInfoByName(username);
    }

    public IUserDAO getDao(){
        return dao;
    }

    public void setDao(IUserDAO dao){
        this.dao = dao;
    }
}
