package hanshin.user.dao;

import hanshin.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by vlrkw on 2017-01-09.
 */
public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId("Ryumsos");
        user.setName("한신");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.print(user2.getPassword());

        System.out.println(user2.getId());
    }

}
