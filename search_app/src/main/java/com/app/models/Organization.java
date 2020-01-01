package com.app.models;

public class Organization {
    private int _id;
    private  String url;
    private String external_id;
    private String name;


    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("external_id="+getExternal_id()+"\n");
        sb.append("name="+getName()+"\n");
        return sb.toString();
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
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
}
