package com.lark.calendar.service;

import com.lark.calendar.model.Schedule;

import java.util.List;

/**
 * 日程服务
 *
 * @author jihainan
 * @date 2020/09/02
 */
public interface ScheduleService {

    /**
     * 添加日程安排
     *
     * @param schedule 日程
     */
    public void addSchedule(Schedule schedule);

    /**
     * 更新日程安排
     *
     * @param schedule 日程
     */
    public long updateSchedule(Schedule schedule);

    /**
     * 删除日程安排
     *
     * @param id id
     */
    public void deleteScheduleById(String id);

    /**
     * 查询所有日程安排
     *
     * @return {@link List<Schedule>}
     */
    public List<Schedule> getAllSchedules();
}
