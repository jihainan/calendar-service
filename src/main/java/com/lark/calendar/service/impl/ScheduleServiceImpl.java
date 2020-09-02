package com.lark.calendar.service.impl;


import com.lark.calendar.model.Schedule;
import com.lark.calendar.service.ScheduleService;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 日程服务
 *
 * @author jihainan
 * @date 2020/09/02
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 添加日程安排
     *
     * @param schedule 日程
     */
    @Override
    public void addSchedule(Schedule schedule) {
        // 生成 ObjectId
        String id = new ObjectId().toString();
        schedule.setId(id);
        mongoTemplate.save(schedule);
    }

    /**
     * 更新日程安排
     *
     * @param schedule 日程
     * @return long
     */
    @Override
    public long updateSchedule(Schedule schedule) {
        Query query = new Query(Criteria.where("id").is(schedule.getId()));
        Update update = new Update().set("title", schedule.getTitle()).set("remarks", schedule.getRemarks());
        // 更新查询返回结果集的第一条
        UpdateResult result = mongoTemplate.updateMulti(query, update, Schedule.class);
        if (result != null)
            return result.getMatchedCount();
        else
            return 0;
    }

    /**
     * 删除日程安排
     *
     * @param id id
     */
    @Override
    public void deleteScheduleById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query);
    }

    /**
     * 查询所有日程安排
     *
     * @return {@link List<Schedule>}
     */
    @Override
    public List<Schedule> getAllSchedules() {
        List<Schedule> scheduleList = mongoTemplate.findAll(Schedule.class);
        return scheduleList;
    }
}
