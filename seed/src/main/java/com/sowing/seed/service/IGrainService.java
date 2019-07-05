package com.sowing.seed.service;

import java.util.List;

import com.sowing.seed.model.Grain;

public interface IGrainService {

	public void createGrain(Grain grain);

	List<Grain> getAllGrains();

	
}
