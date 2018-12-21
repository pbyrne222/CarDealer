package com.carDealer.models;


import java.util.ArrayList;
import java.util.List;

import com.carDealer.components.IComponent;

public abstract class BaseCar implements ICar {

	private String carMake;
	private String carModel;
	private int carYear;


	private List<IComponent> components = new ArrayList<>();
	
	protected BaseCar(IComponent... components) {
		//TODO: build components of the car
	}


	/**
	 * @return the make of the car
	 */
	@Override
	public String getCarMake() {
		return carMake;
	}

	/**
	 * @return the model of the car
	 */
	@Override
	public String getCarModel() {
		return carModel;
	}
	/**
	 * @return the year the car was manufactured
	 */
	@Override
	public int getCarYear() {
		return carYear;
	}

	@Override
	public boolean start() {
		// TODO: turn on all components
		System.out.println("Started car");
		return true;
	}

	@Override
	public boolean turnOff() {
		//TODO: turn off all components
		System.out.println("Stopped car");
		return true;
	}

	/** The business service mode determines the kind of business action that the business service represents. */
	public enum CarCommands {
		TURN_ON,
		TURN_OFF;

		private String name;

		CarCommands(String name){
			this.name = name;
		}

		public static CarCommands getCarCommandsByName(String name) {
			if (name != null && !name.isEmpty()) {
				for (CarCommands command : CarCommands.values()) {
					if (command.name.equalsIgnoreCase(name)) {
						return command;
					}
				}
			}
			return null;
		}
	}


	/** The mode of the business service. */
	CarCommands getMode();
}
