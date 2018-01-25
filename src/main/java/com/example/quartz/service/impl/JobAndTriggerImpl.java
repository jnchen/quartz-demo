package com.example.quartz.service.impl;

import com.example.quartz.dao.JobAndTriggerMapper;
import com.example.quartz.domain.JobAndTrigger;
import com.example.quartz.service.IJobAndTriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caojingchen on 2018/1/25.
 */
@Service
public class JobAndTriggerImpl implements IJobAndTriggerService {

    @Autowired
    private JobAndTriggerMapper jobAndTriggerMapper;
    @Override
    public List<JobAndTrigger> getJobAndTriggerDetails() {
        return jobAndTriggerMapper.getJobAndTriggerDetails();
    }
}
