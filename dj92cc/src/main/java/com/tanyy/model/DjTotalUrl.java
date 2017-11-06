package com.tanyy.model;

import java.util.Date;

public class DjTotalUrl {
    private Integer id;

    private Integer type;

    private Integer totalCount;

    private Integer totalPage;

    private Date createTime;

    private Date lastModifyTime;

    private Integer sucessCount;

    private Integer successPage;

    private Date recentSongTime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getSucessCount() {
        return sucessCount;
    }

    public void setSucessCount(Integer sucessCount) {
        this.sucessCount = sucessCount;
    }

    public Integer getSuccessPage() {
        return successPage;
    }

    public void setSuccessPage(Integer successPage) {
        this.successPage = successPage;
    }

    public Date getRecentSongTime() {
        return recentSongTime;
    }

    public void setRecentSongTime(Date recentSongTime) {
        this.recentSongTime = recentSongTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}