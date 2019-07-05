package com.sowing.seed.service;

import java.util.List;

import com.sowing.seed.model.Soil;

public interface ISoilService {

	public void createSoil(Soil soil);

	List<Soil> getAllSoil();
}
