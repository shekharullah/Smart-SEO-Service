package models;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class DoctorsRate {
	private static final long serialVersionUID = 1L;
	private double rate;
	private String currency;
	public double getRate() {
		return rate;
		
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return ""+rate;
	}
	
}
