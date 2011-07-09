package com.bi.action;

import java.util.Collection;

import com.bi.bean.Purchase;
import com.bi.dao.PurchaseDAO;

public class PurchaseAction {

	private PurchaseDAO dao = new PurchaseDAO();

	private Collection<Purchase> lastMonthList;
	private Collection<Purchase> actualMonthList;
	private Collection<Purchase> yearList;

	public String execute() {
		lastMonthList = dao.getLastMonthPurchases();
		actualMonthList = dao.getActualMonthPurchases();
		yearList = dao.getYearPurchases();

		return "success";
	}

	public Collection<Purchase> getLastMonthList() {
		return lastMonthList;
	}

	public void setLastMonthList(Collection<Purchase> lastMonthList) {
		this.lastMonthList = lastMonthList;
	}

	public Collection<Purchase> getActualMonthList() {
		return actualMonthList;
	}

	public void setActualMonthList(Collection<Purchase> actualMonthList) {
		this.actualMonthList = actualMonthList;
	}

	public Collection<Purchase> getYearList() {
		return yearList;
	}

	public void setYearList(Collection<Purchase> yearList) {
		this.yearList = yearList;
	}

}