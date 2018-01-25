package com.example.quartz.dao;

import com.example.quartz.domain.JobAndTrigger;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by caojingchen on 2018/1/25.
 */
@Mapper
public interface JobAndTriggerMapper {
    public List<JobAndTrigger> getJobAndTriggerDetails();
}
