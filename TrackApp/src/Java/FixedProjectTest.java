package Java;


import com.Projects.FixedProject;
import com.Projects.Project;
import com.Repository.ProjectRecord;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FixedProjectTest  {
    @Test
    public void testCalculateBill() {
        int cost=0;
        ProjectRecord record=new ProjectRecord();
        record.setDuration(2);
        record.setRate(20);
        FixedProject fixedProject=new FixedProject(record);
        cost=fixedProject.calculateBill();
        assertThat(cost,is(40));
    }
}