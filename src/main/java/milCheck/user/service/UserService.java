package milCheck.user.service;

import milCheck.user.dao.IUserDAO;
import milCheck.user.pojo.User;
import milCheck.utils.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserService implements IUserService{
    private IUserDAO dao;

    public List<User> getUserInfoByName(String username){
        return dao.getUserInfoByName(username);
    }

    public IUserDAO getDao(){
        return dao;
    }

    public void setDao(IUserDAO dao){
        this.dao = dao;
    }

    public static void main(String[] args){
        getUserInfo();
    }

    private static void getUserInfo() {
        SqlSession session = DBTools.getSession();
        IUserDAO userDAO = session.getMapper(IUserDAO.class);
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
}
