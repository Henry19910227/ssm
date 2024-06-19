import com.henry.model.*;
import com.henry.utils.DateUtil;
import com.henry.utils.Session;
import com.henry.utils.SqlUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CourseTest {
    @Test
    public void TestInsertCourse() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestInsertCourse");

        Course course = new Course();
        course.setUserID(1);
        course.setIntro("好棒！");
        course.setName("力量課表");
        course.setCreateAt(DateUtil.currentTime());
        course.setUpdateAt(DateUtil.currentTime());
        session.courseMapper().insertCourse(course);
        System.out.println(course);

        sql.close(session);
    }

    @Test
    public void TestGetCourse2ByID() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetCourse2ByID");

        Course2 course = session.courseMapper().getCourse2ByID(1);
        System.out.println(course.toString());

        sql.close(session);
    }

    @Test
    public void TestGetCourse3ByID() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetCourse3ByID");

        Course3 course = session.courseMapper().getCourse3ByID(1);
        System.out.println(course.toString());

        sql.close(session);
    }

    @Test
    public void TestGetCourse3ByIDTwoStep() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetCourse3ByIDTwoStep");

        Course3 course = session.courseMapper().getCourse3ByIDTwoStep(1);
        System.out.println(course);

        sql.close(session);
    }

    @Test
    public void TestIoc() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course2 course = ioc.getBean(Course2.class);
        System.out.println(course);
    }
}
