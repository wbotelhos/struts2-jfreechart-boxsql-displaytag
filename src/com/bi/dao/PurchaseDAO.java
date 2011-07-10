package com.bi.dao;

import java.util.Collection;

import org.boxsql.BoxSQL;

import com.bi.bean.Purchase;

public class PurchaseDAO {

	private static final String SQL_MONTH_FILE = "monthPurchases.sql";
	private static final String SQL_YEAR_FILE = "yearPurchases.sql";

	private Class<Purchase> clazz = Purchase.class;

	public Collection<Purchase> getLastMonthPurchases() {
		BoxSQL box = new BoxSQL();

		box.setParameter("month", "12");

		@SuppressWarnings("unchecked")
		Collection<Purchase> purchaseList = box.getList(SQL_MONTH_FILE, clazz);
	      
		box.release();

		return purchaseList;
	}

	public Collection<Purchase> getActualMonthPurchases() {
		BoxSQL box = new BoxSQL();

		box.setParameter("month", "10");

		@SuppressWarnings("unchecked")
		Collection<Purchase> purchaseList = box.getList(SQL_MONTH_FILE, clazz);
	      
		box.release();

		return purchaseList;
	}

	public Collection<Purchase> getYearPurchases() {
		BoxSQL box = new BoxSQL();

		box.setParameter("year", "2011");

		@SuppressWarnings("unchecked")
		Collection<Purchase> purchaseList = box.getList(SQL_YEAR_FILE, clazz);

		box.release();

		return purchaseList;
	}

}