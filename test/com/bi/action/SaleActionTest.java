package com.bi.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SaleActionTest {

	private SaleAction action = new SaleAction();

	@Test
	public void shouldListSixMonthOfSales() {
		assertEquals("success", action.listSixMonthOfSales());
		assertEquals(3, action.getSaleMap().size());
		assertTrue(action.getSaleMap().containsKey("OCT"));
	}

}
