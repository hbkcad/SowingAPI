package com.sowing.seed.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GRAINDETAILS", schema="sowing")
public class Grain implements Serializable{
	
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="GRAINID")
		private int grainID;
		@Column(name="GRAINNAME")
		private String grainName;
		
		
		public int getGrainID() {
			return grainID;
		}
		public void setGrainID(int grainID) {
			this.grainID = grainID;
		}
		public String getGrainName() {
			return grainName;
		}
		public void setGrainName(String grainName) {
			this.grainName = grainName;
		}
		
}
