package com;

import com.Inputs.CMDLineInputs;
import com.Inputs.Input;
import com.Outputs.ConsoleOutput;
import com.Outputs.Output;
import com.Projects.Project;
import com.Projects.ProjectFactory;
import com.Repository.MysqlProjectstore;
import com.Repository.ProjectRecord;
import com.Repository.ProjectRepository;

public class TrackApp {
    String projectID;
    String[] args;

    public TrackApp(String[] args) {
        this.args = args;
    }

    public void run(){
        int cost=0;
        Input input=new CMDLineInputs(args);
        projectID=input.read();

        ProjectRepository repository=new MysqlProjectstore(projectID);
        ProjectRecord record=repository.read();

        ProjectFactory projectFactory=new ProjectFactory();
        Project project=projectFactory.getProject(record.getType(),record);

        cost= project.calculateBill();

        Output output=new ConsoleOutput();
        output.show(cost);

    }
}
