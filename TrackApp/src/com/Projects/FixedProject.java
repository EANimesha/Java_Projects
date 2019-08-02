package com.Projects;

import com.Repository.ProjectRecord;

public class FixedProject implements Project{
    ProjectRecord record=null;
    public FixedProject(ProjectRecord record) {
        this.record=record;
    }

    @Override
    public int calculateBill() {
        return record.getDuration()*record.getRate();
    }
}
