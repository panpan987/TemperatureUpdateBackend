package com.companyname.model.temperature.entity;


import lombok.Data;

import java.util.Date;

@Data
public class TemperatureEntity {

    private Integer id;
    private String temperature;
    private Date time;
}
