package com.bi.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SaleActionTest {

	private SaleAction action = new SaleAction();

	@Test
	public void shouldListSixMonthOfSales() {
		assertEquals("success", action.list6MonthSales());
		assertEquals(3, action.getSalesMap().size());
		assertTrue(action.getSalesMap().containsKey("OCT"));
	}

}
