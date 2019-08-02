package com.Projects;


import com.Repository.ProjectRecord;

public class ProjectFactory {

    public Project getProject(String type,ProjectRecord record){
        Project project=null;
        if ("fixed".equals(type)){
            project=new FixedProject(record);
        }
        else if("variable".equals(type)){
            project=new FixedProject(record);
        }
        return project;
    }
}
