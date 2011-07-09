package com.bi.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PurchasesActionTest {

	private PurchaseAction action = new PurchaseAction();

	@Test
	public void shouldExecute() {
		assertEquals("success", action.execute());
		assertEquals(3, action.getLastMonthList().size());
		assertEquals(3, action.getActualMonthList().size());
		assertEquals(3, action.getYearList().size());
	}

}