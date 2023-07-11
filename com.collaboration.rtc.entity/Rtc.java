package com.collaboration.rtc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rtc {

	@Id
	private Integer id;
	private String date;
	private String time;
	private String location;
	private String route;
}
