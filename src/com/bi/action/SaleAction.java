package com.bi.action;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jfree.chart.JFreeChart;

import com.bi.bean.Sale;
import com.bi.chart.SaleChart;
import com.bi.dao.SaleDAO;

public class SaleAction {

	private SaleDAO dao = new SaleDAO();
	private SaleChart saleChart = new SaleChart();

	private Map<String, Sale> saleMap;
	private JFreeChart chart;
	private String startDate;
	private String endDate;

	public String listSixMonthOfSales() {
		saleMap = new LinkedHashMap<String, Sale>();

		Collection<Sale> saleList = dao.getLastSixMonthsOfSales(startDate, endDate);

		for (Sale sale : saleList) {
			saleMap.put(sale.getMonth(), sale);
		}

		return "success";
	}

	public String createChart() {
		chart = saleChart.createSalesChart(startDate, endDate);
		return "chartSuccess";
	}

	public Map<String, Sale> getSaleMap() {
		return saleMap;
	}

	public void setSaleMap(Map<String, Sale> saleMap) {
		this.saleMap = saleMap;
	}

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}