import com.henry.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void TestUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }

}
