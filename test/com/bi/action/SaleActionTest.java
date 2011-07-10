package com.bi.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SaleActionTest {

	private SaleAction action = new SaleAction();

	@Before
	public void setup() {
		action.setStartDate("2000-01-01");
		action.setEndDate("2012-12-12");
	}

	@Test
	public void shouldListSixMonthOfSales() {
		assertEquals("success", action.listSixMonthOfSales());
		assertEquals(3, action.getSaleMap().size());
		assertTrue(action.getSaleMap().containsKey("OCT"));
	}

}
