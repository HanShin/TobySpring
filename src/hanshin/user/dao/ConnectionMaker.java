package hanshin.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by vlrkw on 2017-01-09.
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
