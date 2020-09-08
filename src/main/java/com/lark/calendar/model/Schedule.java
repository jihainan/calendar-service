package com.lark.calendar.model;


import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 日程
 *
 * @author jihainan
 * @date 2020/09/02
 */
@Repository
public class Schedule implements Serializable {
    private String id;
    /**
     * 标题
     */
    private String title;

    /**
     * 所属日历ID
     */
    private String calendarId;
    /**
     * 备注
     */
    private String remarks;

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

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
