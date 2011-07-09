package com.bi.bean;

public class Sale {

	private String month;
	private double total;

	public Sale() {

	}

	public Sale(String month, double total) {
		this.month = month;
		this.total = total;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}