package com.imcon;

import java.util.Date;

public class Notice {

    private String id;
    private String title;
    private String creatot;
    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatot() {
        return creatot;
    }

    public void setCreatot(String creatot) {
        this.creatot = creatot;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Notice(String id, String title, String creatot, Date createtime) {
        this.id = id;
        this.title = title;
        this.creatot = creatot;
        this.createtime = createtime;
    }

}
