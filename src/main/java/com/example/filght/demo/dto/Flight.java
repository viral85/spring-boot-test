package com.example.filght.demo.dto;

import java.util.Date;

public class Flight {
	private String departure;
	private String arrival;
	private Date departureTime;
	private Date arrivalTime;

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public Date getDepartureTime() {
		return null != departureTime ? new Date(departureTime.getTime()) : departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = new Date(departureTime.getTime());
	}

	public Date getArrivalTime() {
		return null != arrivalTime ? new Date(arrivalTime.getTime()) : arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = new Date(arrivalTime.getTime());
	}

	@Override
	public String toString() {
		return "FlightResponse [departure=" + departure + ", arrival=" + arrival + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}
}
