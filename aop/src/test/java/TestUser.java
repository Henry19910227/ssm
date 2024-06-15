import com.henry.model.Config;
import com.henry.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    @Test
    public void TestGetUser() {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(Config.class);
        User user = ioc.getBean(User.class);
        user.getUser();
    }
}
