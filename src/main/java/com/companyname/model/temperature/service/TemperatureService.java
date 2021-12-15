package com.companyname.model.temperature.service;

import com.companyname.model.temperature.dao.TemperatureDao;
import com.companyname.model.temperature.entity.TemperatureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TemperatureService {

    @Autowired
    private TemperatureDao temperatureDao;

    public Integer getTemperaturePerSecond() {

        return new Random().nextInt(100) + 1;
    }

    public Integer addRecord(TemperatureEntity entity) {
        return temperatureDao.addRecord(entity);
    }
}
