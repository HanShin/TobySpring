package hanshin.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * Created by vlrkw on 2017-01-09.
 */
@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao(){
            UserDao userDao = new UserDao();
            userDao.setDataSource(dataSource());
            return userDao;
    }

    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

//        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
//        dataSource.setUrl("jdbc:mysql://localhost/hanshintoby");
//        dataSource.setUsername("root");
//        dataSource.setPassword("12345678");
        return dataSource;
    }

    @Bean
    public AccountDao accountDao(){
        return new AccountDao(connectionMaker());
    }
    @Bean
    public MessageDao messageDao(){
        return new MessageDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
