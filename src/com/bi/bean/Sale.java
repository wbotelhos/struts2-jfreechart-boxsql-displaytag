package com.bi.bean;

public class Sale {

	private double total;
	private String month;

	public Sale() {

	}

	public Sale(double total, String month) {
		this.total = total;
		this.month = month;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}