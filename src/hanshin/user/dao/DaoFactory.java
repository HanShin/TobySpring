package hanshin.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vlrkw on 2017-01-09.
 */
@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao(){

        return new UserDao(connectionMaker());
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
