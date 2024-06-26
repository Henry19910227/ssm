import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.henry.controller.UserController;
import com.henry.model.CourseMapper;
import com.henry.model.User;
import com.henry.model.UserMapper;
import com.henry.utils.DateUtil;
import com.henry.utils.Session;
import com.henry.utils.SqlUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class UserTest {
    @Test
    public void TestGetUserByID() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");

        Session session1 = sql.getSession("TestGetUserByID-1");
        User user = session1.userMapper().getUserByID(1);
        System.out.println(user.toString());
        User user1 = session1.userMapper().getUserByID(1);
        System.out.println(user1.toString());
        sql.close(session1);

        Session session2 = sql.getSession("TestGetUserByID-2");
        User user2 = session2.userMapper().getUserByID(1);
        System.out.println(user2.toString());
        sql.close(session2);
    }

    @Test
    public void TestPaging() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");

        Session session1 = sql.getSession("TestPaging");
        Page<User> page = PageHelper.startPage(1, 2);
        List<User> users = session1.userMapper().getAllUsers();
        System.out.println(users);
        System.out.println("page = "+page.getPages());
        System.out.println("total = "+page.getTotal());
    }

    @Test
    public void TestInsertUser() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestInsertUser");

        User user = new User();
        user.setEmail("user5@gmail.com");
        user.setNickname("user5");
        user.setCreateAt(DateUtil.currentTime());
        user.setUpdateAt(DateUtil.currentTime());
        session.userMapper().insertUser(user);
        System.out.println(user);
        sql.close(session);
    }

    @Test
    public void TestUpdateUser() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestUpdateUser");

        User user = session.userMapper().getUserByID(2);
        user.setNickname("test9");
        user.setUpdateAt(DateUtil.currentTime());
        session.userMapper().updateUser(user);

        sql.close(session);
    }

    @Test
    public void TestDeleteUser() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestDeleteUser");

        session.userMapper().deleteUser(14);

        sql.close(session);
    }

    @Test
    public void TestGetUsersByAge() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetUsersByAge");

        List<User> users = session.userMapper().getUsersByAge(15);
        System.out.println(users);

        sql.close(session);
    }

    @Test
    public void TestGetUsersByUsername() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetUsersByUsername");

        List<User> users = session.userMapper().getUsersByUsername("use");
        System.out.println(users);

        sql.close(session);
    }

    @Test
    public void TestGetUsersByEmail() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetUsersByEmail");

        List<User> users = session.userMapper().getUsersByEmail("tes");
        System.out.println(users);

        sql.close(session);
    }

    @Test
    public void TestIoc() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }
}
