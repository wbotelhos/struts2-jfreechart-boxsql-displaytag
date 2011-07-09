<%@ taglib uri="/struts-tags" prefix="s" %>

<s:iterator value="actualMonthList">
	<s:property value="purchaseNumber"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator><br/><br/>

<s:iterator value="lastMonthList">
	<s:property value="purchaseNumber"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator><br/><br/>

<s:iterator value="yearList">
	<s:property value="purchaseNumber"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>