package com.lark.calendar.controller;

import com.lark.calendar.model.Schedule;
import com.lark.calendar.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 排程控制器
 *
 * @author jihainan
 * @date 2020/09/02
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    /**
     * 添加日程安排
     *
     * @param schedule 时间表
     */
    @PostMapping("/addSchedule")
    public void addSchedule(@RequestBody Schedule schedule) {
        scheduleService.addSchedule(schedule);
    }

    @GetMapping("/getAllSchedules")
    public List<Schedule> getSchedules() {
        return scheduleService.getAllSchedules();
    }
}
