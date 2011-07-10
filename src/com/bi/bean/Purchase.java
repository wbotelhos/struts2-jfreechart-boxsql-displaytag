package com.bi.bean;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {

	private static final long serialVersionUID = 3195971119517378271L;

	private String number;
	private Date date;
	private String item;
	private String total;

	public Purchase() {

	}

	public Purchase(String number, Date date, String item, String total) {
		this.number = number;
		this.date = date;
		this.item = item;
		this.total = total;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}