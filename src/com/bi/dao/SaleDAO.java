package com.bi.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.bi.bean.Sale;

public class SaleDAO {

	public Collection<Sale> getLastSixMonthsOfSales() {
		Collection<Sale> saleList = new ArrayList<Sale>();

		saleList.add(new Sale("OCT", 10000.0));
		saleList.add(new Sale("NOV", 11000.0));
		saleList.add(new Sale("DEC", 12000.0));

		return saleList;
	}

}