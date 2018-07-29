package milCheck.user.service;

import milCheck.user.pojo.User;

import java.util.List;

public interface IUserService {
    public List<User> getUserInfoByName(String userName);
}
