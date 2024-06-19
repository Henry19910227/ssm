import com.henry.utils.Session;
import com.henry.utils.SqlUtil;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilsTest {
    @Test
    public void TestSqlUtil() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlUtil sql = ctx.getBean(SqlUtil.class);
        Session session = sql.getSession("TestInsertUser");
        sql.close(session);
    }
}
