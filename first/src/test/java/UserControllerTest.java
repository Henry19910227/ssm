import com.henry.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerTest {
    @Test
    public void TestIoc() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController user = ioc.getBean(UserController.class);
        System.out.println(user);
    }
}
