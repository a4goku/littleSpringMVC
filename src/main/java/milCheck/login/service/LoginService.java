package milCheck.login.service;

import milCheck.login.dao.ILoginDAO;
import milCheck.login.pojo.Login;

public class LoginService implements ILoginService{
    private ILoginDAO dao;


    @Override
    public void check(Login login) {
        dao.check(login);
    }

    public ILoginDAO getDao(){
        return dao;
    }

    public void setDao(ILoginDAO dao) {
        this.dao = dao;
    }
}
