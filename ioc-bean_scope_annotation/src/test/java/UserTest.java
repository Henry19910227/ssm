import com.henry.model.User;
import com.henry.model.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void TestUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ioc.getBean(User.class);
        User user2 = ioc.getBean(User.class);
        System.out.println(user);
        System.out.println(user2);
    }

    @Test
    public void TestUser2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User2 user = ioc.getBean(User2.class);
        User2 user2 = ioc.getBean(User2.class);
        System.out.println(user);
        System.out.println(user2);
    }
}
