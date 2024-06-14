import com.henry.config.Config;
import com.henry.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
    @Test
    public void TestUser() {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(Config.class);
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }
}
