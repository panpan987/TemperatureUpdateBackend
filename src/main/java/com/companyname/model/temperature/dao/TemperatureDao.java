package com.companyname.model.temperature.dao;


import com.companyname.model.temperature.entity.TemperatureEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TemperatureDao {

    Integer addRecord(TemperatureEntity entity);
}
