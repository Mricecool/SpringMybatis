package com.mybatis.model;

import java.util.Date;

public class Workinfo {
    private Long workid;

    private String openid;

    private String taskname;

    private String fromsite;

    private String tosite;

    private String planstarttime;

    private String planendtime;

    private Date signintime;

    private String signinsite;

    private Date signouttime;

    private String signoutsite;

    private Date createtime;

    private Integer state;

    private String latin;

    private String lonin;

    private String latout;

    private String lonout;

    private String signinimage;

    private String signoutimage;

    private String signoutinfo;

    public Long getWorkid() {
        return workid;
    }

    public void setWorkid(Long workid) {
        this.workid = workid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getFromsite() {
        return fromsite;
    }

    public void setFromsite(String fromsite) {
        this.fromsite = fromsite == null ? null : fromsite.trim();
    }

    public String getTosite() {
        return tosite;
    }

    public void setTosite(String tosite) {
        this.tosite = tosite == null ? null : tosite.trim();
    }

    public String getPlanstarttime() {
        return planstarttime;
    }

    public void setPlanstarttime(String planstarttime) {
        this.planstarttime = planstarttime == null ? null : planstarttime.trim();
    }

    public String getPlanendtime() {
        return planendtime;
    }

    public void setPlanendtime(String planendtime) {
        this.planendtime = planendtime == null ? null : planendtime.trim();
    }

    public Date getSignintime() {
        return signintime;
    }

    public void setSignintime(Date signintime) {
        this.signintime = signintime;
    }

    public String getSigninsite() {
        return signinsite;
    }

    public void setSigninsite(String signinsite) {
        this.signinsite = signinsite == null ? null : signinsite.trim();
    }

    public Date getSignouttime() {
        return signouttime;
    }

    public void setSignouttime(Date signouttime) {
        this.signouttime = signouttime;
    }

    public String getSignoutsite() {
        return signoutsite;
    }

    public void setSignoutsite(String signoutsite) {
        this.signoutsite = signoutsite == null ? null : signoutsite.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin == null ? null : latin.trim();
    }

    public String getLonin() {
        return lonin;
    }

    public void setLonin(String lonin) {
        this.lonin = lonin == null ? null : lonin.trim();
    }

    public String getLatout() {
        return latout;
    }

    public void setLatout(String latout) {
        this.latout = latout == null ? null : latout.trim();
    }

    public String getLonout() {
        return lonout;
    }

    public void setLonout(String lonout) {
        this.lonout = lonout == null ? null : lonout.trim();
    }

    public String getSigninimage() {
        return signinimage;
    }

    public void setSigninimage(String signinimage) {
        this.signinimage = signinimage == null ? null : signinimage.trim();
    }

    public String getSignoutimage() {
        return signoutimage;
    }

    public void setSignoutimage(String signoutimage) {
        this.signoutimage = signoutimage == null ? null : signoutimage.trim();
    }

    public String getSignoutinfo() {
        return signoutinfo;
    }

    public void setSignoutinfo(String signoutinfo) {
        this.signoutinfo = signoutinfo == null ? null : signoutinfo.trim();
    }
}