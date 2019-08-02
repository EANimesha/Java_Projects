package Java;

import com.Projects.FixedProject;
import com.Projects.Project;
import com.Projects.ProjectFactory;
import com.Repository.ProjectRecord;
import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProjectFactoryTest {
    @Test
    public void IsFixedProjectOut(){
        ProjectRecord record=new ProjectRecord();
        record.setType("fixed");
        ProjectFactory projectFactory=new ProjectFactory();
        Project project=projectFactory.getProject(record.getType(),record);
        assertThat(project,instanceOf(FixedProject.class));

    }

}