package hanshin.user.dao;

import org.springframework.context.annotation.Bean;

/**
 * Created by vlrkw on 2017-03-08.
 */
public class CountingDaoFactory {
    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new CountingConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new DConnectionMaker();
    }
}
