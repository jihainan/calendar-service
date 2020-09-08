package com.lark.calendar.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 日历
 *
 * @author fight
 * @date 2020/09/08
 */
public class Calendar implements Serializable {
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 秘密
     */
    private Integer secretLevel;

    /**
     * 用户列表
     */
    private List<String> userList;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", secretLevel=" + secretLevel +
                ", userList=" + userList +
                ", createTime=" + createTime +
                '}';
    }
}
