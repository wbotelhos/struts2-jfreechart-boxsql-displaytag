package com.bi.chart;

import java.util.Collection;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.bi.bean.Sale;
import com.bi.dao.SaleDAO;

public class SaleChart {

	private SaleDAO sDAO = new SaleDAO();

	public JFreeChart createSalesChart() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		Collection<Sale> saleList = sDAO.getLastSixMonthsOfSales();

		for (Sale sale : saleList) {
			dataset.addValue(sale.getTotal(), "Sales", sale.getMonth());
		}

		JFreeChart chart =	ChartFactory.createLineChart3D("Last Six Months of Sales", "Months", "Total", dataset, PlotOrientation.VERTICAL, true, true, true);

		return chart;
	}
}