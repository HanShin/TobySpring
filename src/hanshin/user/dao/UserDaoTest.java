package hanshin.user.dao;

import hanshin.user.domain.User;

import java.sql.SQLException;

/**
 * Created by vlrkw on 2017-01-09.
 */
public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new DaoFactory().userDao();
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
