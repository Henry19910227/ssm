import com.henry.model.User;
import com.henry.model.UserMapper;
import com.henry.utils.DateUtil;
import com.henry.utils.SqlUtil;
import org.junit.Test;

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
        User user = sql.GetUserMapper().getUserByID(1);
        System.out.println(user.toString());
        sql.close();
    }
    @Test
    public void TestInsertUser() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        User user = new User();
        user.setEmail("user1@gmail.com");
        user.setNickname("user1");
        user.setCreateAt(DateUtil.currentTime());
        user.setUpdateAt(DateUtil.currentTime());
        sql.GetUserMapper().insertUser(user);
        System.out.println(user);
        sql.close();
    }

    @Test
    public void TestUpdateUser() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        UserMapper mapper = sql.GetUserMapper();
        User user = mapper.getUserByID(2);
        user.setNickname("test9");
        user.setUpdateAt(DateUtil.currentTime());
        sql.GetUserMapper().updateUser(user);
        sql.close();
    }

    @Test
    public void TestDeleteUser() {
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
