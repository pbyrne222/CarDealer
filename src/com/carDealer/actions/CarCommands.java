package com.carDealer.actions;

import com.carDealer.models.BaseCar;

public enum CarCommands {

	TURN_ON,

	TURN_OFF;

	private String name;

	CarCommands(String name){
		this.name = name;
	}
}