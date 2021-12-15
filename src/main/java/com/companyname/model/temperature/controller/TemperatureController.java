package com.companyname.model.temperature.controller;

import com.companyname.model.temperature.entity.TemperatureEntity;
import com.companyname.model.temperature.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("temperature")
@CrossOrigin
public class TemperatureController {

    @Autowired
    private TemperatureService temperatureService;

    @RequestMapping(value = "getPerSecond", method = RequestMethod.GET)
    public Integer getTemperaturePerSecond() {
        Integer temperaturePerSecond = temperatureService.getTemperaturePerSecond();
        TemperatureEntity entity = new TemperatureEntity();
        entity.setTime(new Date());
        entity.setTemperature(temperaturePerSecond.toString());
        temperatureService.addRecord(entity);
        return temperaturePerSecond;
    }

    @RequestMapping(value = "addRecord", method = RequestMethod.POST)
    public Integer addRecord(@RequestBody TemperatureEntity entity) {
        Date date = new Date();
        entity.setTime(date);
        return temperatureService.addRecord(entity);
    }

}
