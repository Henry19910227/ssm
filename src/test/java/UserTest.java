import com.henry.model.UserMapper;
import com.henry.utils.SqlUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UserTest {
    @Test
    public void TestInsert() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        UserMapper user = sql.GetUserMapper();
        int userId = user.insertUser();
        System.out.println(userId);
        sql.close();
    }

    @Test
    public void TestUpdate() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        UserMapper user = sql.GetUserMapper();
        user.updateUser();
        sql.close();
    }
}
