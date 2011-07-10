package com.bi.action;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.bi.bean.Sale;
import com.bi.dao.SaleDAO;

public class SaleAction {

	private SaleDAO dao = new SaleDAO();

	private Map<String, Sale> saleMap;

	public String listSixMonthOfSales() {
		saleMap = new LinkedHashMap<String, Sale>();

		Collection<Sale> saleList = dao.getLastSixMonthsOfSales();

		for (Sale sale : saleList) {
			saleMap.put(sale.getMonth(), sale);
		}

		return "success";
	}

	public Map<String, Sale> getSaleMap() {
		return saleMap;
	}

	public void setSaleMap(Map<String, Sale> saleMap) {
		this.saleMap = saleMap;
	}

}