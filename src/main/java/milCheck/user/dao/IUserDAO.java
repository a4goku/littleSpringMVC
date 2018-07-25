package milCheck.user.dao;

import milCheck.user.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDAO {
    User getUserInfoByName(String username);
}
