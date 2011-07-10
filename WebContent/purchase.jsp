<%@ taglib uri="/struts-tags" prefix="s" %>

<div class="titulo">Actual Month:</div>

<s:iterator value="actualMonthList">
	<s:property value="purchaseNumber"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>

<div class="titulo">Last Month:</div>

<s:iterator value="lastMonthList">
	<s:property value="purchaseNumber"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>

<div class="titulo">Year:</div>

<s:iterator value="yearList">
	<s:property value="purchaseNumber"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>