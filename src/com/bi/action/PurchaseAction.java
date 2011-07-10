package com.bi.action;

import java.util.Collection;
import java.util.Map;

import com.bi.bean.Purchase;
import com.bi.dao.PurchaseDAO;
import com.opensymphony.xwork2.ActionContext;

public class PurchaseAction {

	private PurchaseDAO dao = new PurchaseDAO();

	private Collection<Purchase> lastMonthList;
	private Collection<Purchase> actualMonthList;
	private Collection<Purchase> yearList;

	public String execute() {
		@SuppressWarnings("unchecked")
		Map<String, Object> session = (Map<String, Object>) ActionContext.getContext().get("session");

		lastMonthList = dao.getLastMonthPurchases();
		actualMonthList = dao.getActualMonthPurchases();
		yearList = dao.getYearPurchases();

		session.put("lastMonthPurchases", lastMonthList);
		session.put("actualMonthPurchases", actualMonthList);
		session.put("yearPurchases", yearList);

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