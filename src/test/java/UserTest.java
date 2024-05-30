import com.henry.model.User;
import com.henry.model.UserMapper;
import com.henry.utils.SqlUtil;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void TestSelect() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        User user = sql.GetUserMapper().selectUser(23);
        System.out.println(user.toString());
        sql.close();
    }
    @Test
    public void login() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        User user = sql.GetUserMapper().login("user1", "s12345");
        System.out.println(user.toString());
        sql.close();
    }
    @Test
    public void login2() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        User user = sql.GetUserMapper().login("user1", "s12345");
        System.out.println(user.toString());
        sql.close();
    }
    @Test
    public void TestInsert() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        User user = new User();
        user.setUsername("user12");
        user.setAge(15);
        user.setGender("f");
        user.setPassword("s1234");
        user.setEmail("user1@gmail.com");
        sql.GetUserMapper().insertUser(user);
        System.out.println(user);
        sql.close();
    }

    @Test
    public void TestUpdate() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        sql.GetUserMapper().updateUser(new User(28, "test", "test", 99, "f", "test@gmail.com"));
        sql.close();
    }

    @Test
    public void TestDelete() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        sql.GetUserMapper().deleteUser(14);
        sql.close();
    }

    @Test
    public void TestGetUsersByAge() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        List<User> users = sql.GetUserMapper().getUsersByAge(15);
        System.out.println(users);
        sql.close();
    }

    @Test
    public void TestGetUsersByUsername() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        List<User> users = sql.GetUserMapper().getUsersByUsername("use");
        System.out.println(users);
        sql.close();
    }

    @Test
    public void TestGetUsersByEmail() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        List<User> users = sql.GetUserMapper().getUsersByEmail("tes");
        System.out.println(users);
        sql.close();
    }
}
