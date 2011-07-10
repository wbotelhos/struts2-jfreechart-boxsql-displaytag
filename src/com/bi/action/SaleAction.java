package com.bi.action;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.bi.bean.Sale;
import com.bi.dao.SaleDAO;

public class SaleAction {

	private SaleDAO dao = new SaleDAO();

	private Map<String, Sale> salesMap;

	public String listSixMonthOfSales() {
		salesMap = new LinkedHashMap<String, Sale>();

		Collection<Sale> saleList = dao.getLastSixMonthsOfSales();

		for (Sale sale : saleList) {
			salesMap.put(sale.getMonth(), sale);
		}

		return "success";
	}

	public Map<String, Sale> getSalesMap() {
		return salesMap;
	}

	public void setSalesMap(Map<String, Sale> salesMap) {
		this.salesMap = salesMap;
	}

}