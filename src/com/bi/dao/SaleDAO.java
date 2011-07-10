package com.bi.dao;

import java.util.Collection;

import org.boxsql.BoxSQL;

import com.bi.bean.Sale;

public class SaleDAO {

	public Collection<Sale> getLastSixMonthsOfSales() {
		BoxSQL box = new BoxSQL();

		@SuppressWarnings("unchecked")
		Collection<Sale> saleList = box.getList("listSixMonthsOfSales.sql", Sale.class);

		box.release();

		return saleList;
	}

}