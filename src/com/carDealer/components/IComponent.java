package com.carDealer.components;

import com.carDealer.actions.CarCommands;

public interface IComponent {

	public void accept(CarCommands command);
		
}
