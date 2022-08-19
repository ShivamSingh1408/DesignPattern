package com.aurionpro.model;

public enum Holidays {
	HOLI, EID, INDEPENDENCEDAY, GANESHCHATURTHI, DUSSEHRA, DIWALI, CHRISTMAS,OTHER;

	public String HolidayIsIn() {
		switch (this) {
		case HOLI:
			return "I'm in month of March";
		case EID:
			return "I'm in month of May";
		case INDEPENDENCEDAY:
			return "I'm in month of August";
		case GANESHCHATURTHI:
			return "I'm in month of August";
		case DUSSEHRA:
			return "I'm in month of October";
		case DIWALI:
			return "I'm in month of October";
		case CHRISTMAS:
			return "I'm in month of December";
		default:
			return "Happy to have Holidays";
		}
	}
}
