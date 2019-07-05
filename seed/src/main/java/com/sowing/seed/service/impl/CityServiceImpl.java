package com.sowing.seed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sowing.seed.dao.ICityDao;
import com.sowing.seed.mapper.CityRowMapper;
import com.sowing.seed.model.City;
import com.sowing.seed.service.ICityService;

@Service
public class CityServiceImpl implements ICityService {

	@Autowired
	ICityDao iCityDao;

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<City> getAllCities() {
		return iCityDao.findAll();
	}

	@Override
	public void createCity(City city) {
		iCityDao.save(city);
	}

	public List<City> getCityonState(String stateName) {

		return jdbc.query(
				"select c.cityID,c.CityName,s.stateName from CityDetails as c inner join StateDetails as s on s.stateID=c.stateID where s.stateName=?",
				new Object[] { stateName },
				new CityRowMapper());

	}

}
