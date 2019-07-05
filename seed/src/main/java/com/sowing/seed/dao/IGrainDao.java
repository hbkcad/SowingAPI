package com.sowing.seed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sowing.seed.model.Grain;

@Repository
public interface IGrainDao extends JpaRepository<Grain, Integer> {

}
