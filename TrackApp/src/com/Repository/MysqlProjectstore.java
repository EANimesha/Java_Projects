package com.Repository;

public class MysqlProjectstore implements ProjectRepository {
    String projectId;

    public MysqlProjectstore(String projectId) {
        this.projectId=projectId;
    }

    @Override
    public ProjectRecord read() {
        ProjectRecord record=new ProjectRecord();
        return record;
    }
}
