import com.henry.model.User;
import com.henry.model.User2;
import com.henry.model.User3;
import com.henry.model.User4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void TestGetUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }

    @Test
    public void TestGetUser2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User2 user = ioc.getBean(User2.class);
        System.out.println(user);
    }

    @Test
    public void TestGetUser3() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User3 user = ioc.getBean(User3.class);
        System.out.println(user);
    }

    @Test
    public void TestGetUser4() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User4 user = ioc.getBean(User4.class);
        System.out.println(user);
    }
}
