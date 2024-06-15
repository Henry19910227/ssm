import com.henry.model.Datasource;
import com.henry.model.User;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatasourceTest {
    @Test
    public void TestUser() {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(Datasource.class);
        MysqlDataSource datasource = ioc.getBean(MysqlDataSource.class);
        System.out.println(datasource.getURL());
    }
}
