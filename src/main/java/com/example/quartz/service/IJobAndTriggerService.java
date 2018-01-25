package com.example.quartz.service;

import com.example.quartz.domain.JobAndTrigger;

import java.util.List;

/**
 * Created by caojingchen on 2018/1/25.
 */
public interface IJobAndTriggerService {
    public List<JobAndTrigger> getJobAndTriggerDetails();
}
