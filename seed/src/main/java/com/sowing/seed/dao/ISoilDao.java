package com.sowing.seed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sowing.seed.model.Soil;

@Repository
public interface ISoilDao extends JpaRepository<Soil, Integer> {

}
