import com.henry.model.*;
import com.henry.utils.DateUtil;
import com.henry.utils.SqlUtil;
import org.junit.Test;

import java.util.List;

public class CourseTest {
    @Test
    public void TestInsertCourse() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Course course = new Course();
        course.setUserID(1);
        course.setIntro("好棒！");
        course.setName("力量課表");
        course.setCreateAt(DateUtil.currentTime());
        course.setUpdateAt(DateUtil.currentTime());
        sql.GetCourseMapper().insertCourse(course);
        System.out.println(course);
        sql.close();
    }

    @Test
    public void TestGetCourse2ByID() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Course2 course = sql.GetCourseMapper().getCourse2ByID(1);
        System.out.println(course.toString());
        sql.close();
    }

    @Test
    public void TestGetCourse3ByID() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Course3 course = sql.GetCourseMapper().getCourse3ByID(1);
        System.out.println(course.toString());
        sql.close();
    }

    @Test
    public void TestGetCourse3ByIDTwoStep() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Course3 course = sql.GetCourseMapper().getCourse3ByIDTwoStep(1);
        System.out.println(course);
        sql.close();
    }
}
