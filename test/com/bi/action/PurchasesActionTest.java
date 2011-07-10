package com.bi.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PurchasesActionTest {

	private PurchaseAction action = new PurchaseAction();

	@Test
	public void shouldExecute() {
		assertEquals("success", action.execute());
		assertEquals(1, action.getLastMonthList().size());
		assertEquals(1, action.getActualMonthList().size());
		assertEquals(1, action.getYearList().size());
	}

}