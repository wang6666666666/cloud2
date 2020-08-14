package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Stus {
    @Id
    private Integer id;
    @Column
    private String cname;
    @Column
    private String sname;

    public Stus(Integer id, String cname, String sname) {
        this.id = id;
        this.cname = cname;
        this.sname = sname;
    }

    public Stus() {
    }

    @Override
    public String toString() {
        return "Stus{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
