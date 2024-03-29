package com.app.models;

import java.util.Date;

public class User {
    private int _id;
    private  String url;
    private String external_id;
    private String name;
    private String alias;
    private String created_at;
    private boolean active;
    private boolean verified;
    private boolean shared;
    private String locale;
    private String timezone;
    private int organization_id;

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("external_id="+getExternal_id()+"\n");
        sb.append("name="+getName()+"\n");
        sb.append("alias="+getAlias()+"\n");
        sb.append("created_at="+getCreated_at()+"\n");
        sb.append("active="+isActive()+"\n");
        sb.append("verified="+isVerified()+"\n");
        sb.append("shared="+isShared()+"\n");
        sb.append("locale="+getLocale()+"\n");
        sb.append("timezone="+getTimezone()+"\n");
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }
}
