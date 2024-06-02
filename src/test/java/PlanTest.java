import com.henry.model.Plan;
import com.henry.utils.DateUtil;
import com.henry.utils.SqlUtil;
import org.junit.Test;

public class PlanTest {
    @Test
    public void TestInsertUser() {
        SqlUtil sql = new SqlUtil("mybatis-config.xml");
        Plan plan = new Plan();
        plan.setCourseID(1);
        plan.setName("計畫2");
        plan.setCreateAt(DateUtil.currentTime());
        plan.setUpdateAt(DateUtil.currentTime());
        sql.planMapper().insertPlan(plan);
        System.out.println(plan);
        sql.close();
    }
}
