package milCheck.user.dao;

import milCheck.user.pojo.User;

import java.util.List;

public interface IUserDAO {
    public List<String> getUserInfo();

    public List<User> getUserInfoByName(String username);
}
