package com.bi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.bi.bean.Purchase;

public class PurchaseDAO {

	public Collection<Purchase> getLastMonthPurchases() {
		Collection<Purchase> purchaseList = new ArrayList<Purchase>();

		purchaseList.add(new Purchase("1", new Date(), "iPhone", "1000"));
		purchaseList.add(new Purchase("2", new Date(), "Macbook", "2000"));
		purchaseList.add(new Purchase("3", new Date(), "iMac", "3000"));

		return purchaseList;
	}

	public Collection<Purchase> getActualMonthPurchases() {
		Collection<Purchase> purchaseList = new ArrayList<Purchase>();

		purchaseList.add(new Purchase("1", new Date(), "iPhone", "1000"));
		purchaseList.add(new Purchase("2", new Date(), "Macbook", "2000"));
		purchaseList.add(new Purchase("3", new Date(), "iMac", "3000"));

		return purchaseList;
	}

	public Collection<Purchase> getYearPurchases() {
		Collection<Purchase> purchaseList = new ArrayList<Purchase>();

		purchaseList.add(new Purchase("1", new Date(), "iPhone", "1000"));
		purchaseList.add(new Purchase("2", new Date(), "Macbook", "2000"));
		purchaseList.add(new Purchase("3", new Date(), "iMac", "3000"));

		return purchaseList;
	}

}
