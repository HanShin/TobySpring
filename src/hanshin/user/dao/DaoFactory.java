package hanshin.user.dao;

/**
 * Created by vlrkw on 2017-01-09.
 */
public class DaoFactory {
    public UserDao userDao(){
        return new UserDao(connectionMaker());
    }
    public AccountDao accountDao(){
        return new AccountDao(connectionMaker());
    }

    public MessageDao messageDao(){
        return new MessageDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
