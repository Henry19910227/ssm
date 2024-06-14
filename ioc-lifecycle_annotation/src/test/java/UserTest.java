import com.henry.model.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void TestUser() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);

        ioc.close();
    }
}
