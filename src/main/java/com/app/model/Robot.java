package com.app.model;

public class Robot {
	private Chip chip;
	private Sensor sensor;

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Robot(Chip chip) {
		super();
		this.chip = chip;
	}

	public Robot(Sensor sensor) {
		super();
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}

}
