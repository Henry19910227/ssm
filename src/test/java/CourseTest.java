import com.henry.model.Course;
import com.henry.model.User;
import com.henry.utils.DateUtil;
import com.henry.utils.SqlUtil;
import org.junit.Test;

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
}
