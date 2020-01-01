package com.app.models;

public class Ticket {
    private String _id;
    private  String url;
    private String external_id;
    private String name;
    private String created_at;
    private String type;
    private String subject;
    private String description;
    private int submitter_id;
    private int assignee_id;
    private int organization_id;

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("external_id="+getExternal_id()+"\n");
        sb.append("name="+getName()+"\n");
        sb.append("created_at="+getCreated_at()+"\n");
        sb.append("type="+getType()+"\n");
        sb.append("subject="+getSubject()+"\n");
        sb.append("description="+getDescription()+"\n");
        sb.append("submitter_id="+getSubmitter_id()+"\n");
        sb.append("assignee_id="+getAssignee_id()+"\n");
        sb.append("organization_id="+getOrganization_id()+"\n");
        return sb.toString();
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(int submitter_id) {
        this.submitter_id = submitter_id;
    }

    public int getAssignee_id() {
        return assignee_id;
    }

    public void setAssignee_id(int assignee_id) {
        this.assignee_id = assignee_id;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }
}
