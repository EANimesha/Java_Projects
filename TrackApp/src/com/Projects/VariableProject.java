package com.Projects;

import com.Repository.ProjectRecord;

public class VariableProject implements Project{
    ProjectRecord record=null;

    public VariableProject(ProjectRecord record) {
        this.record = record;
    }

    @Override
    public int calculateBill() {
        return record.getDuration()*record.getRate()*record.getNumberOfAllocatedResources();
    }
}
