import com.henry.model.Plan;
import com.henry.model.PlanMapper;
import com.henry.model.UserMapper;
import com.henry.utils.DateUtil;
import com.henry.utils.Session;
import com.henry.utils.SqlUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PlanTest {
    @Test
    public void TestInsertPlan() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetCourse3ByIDTwoStep");

        Plan plan = new Plan();
        plan.setCourseID(1);
        plan.setName("計畫2");
        plan.setCreateAt(DateUtil.currentTime());
        plan.setUpdateAt(DateUtil.currentTime());
        session.planMapper().insertPlan(plan);
        System.out.println(plan);

        sql.close(session);
    }

    @Test
    public void TestGetPlansByCourseID() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Session session = sql.getSession("TestGetCourse3ByIDTwoStep");

        List<Plan> plans = session.planMapper().getPlansByCourseID(1);
        System.out.println(plans);

        sql.close(session);
    }
}
