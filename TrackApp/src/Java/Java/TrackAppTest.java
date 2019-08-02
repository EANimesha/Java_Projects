package Java;

import com.Main;
import com.Outputs.ConsoleOutput;
import com.Outputs.Output;
import com.Projects.Project;
import com.Projects.ProjectFactory;
import com.Repository.ProjectRecord;
import com.Repository.ProjectRepository;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TrackAppTest {
    @Test
    public void testcase1(){
        ProjectRepository repository=mock(ProjectRepository.class);
        ProjectRecord record=new ProjectRecord();
        record.setId("0002");
        record.setType("fixed");
        record.setRate(2);
        record.setDuration(3);
        record.setNumberOfAllocatedResources(10);

        when(repository.read()).thenReturn(record);

        ProjectFactory projectFactory=new ProjectFactory();
        Project project=projectFactory.getProject(record.getType(),record);

        int cost= project.calculateBill();

        Output output=new ConsoleOutput();
        output.show(cost);


    }

}