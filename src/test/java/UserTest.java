import com.henry.model.User;
import com.henry.model.UserMapper;
import com.henry.utils.SqlUtil;
import org.junit.Test;

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
        User userParam = new User();
        userParam.setUsername("user1");
        userParam.setAge(15);
        userParam.setGender("f");
        userParam.setPassword("s1234");
        userParam.setEmail("user1@gmail.com");
        int userId = sql.GetUserMapper().insertUser(userParam);
        System.out.println(userId);
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
}
