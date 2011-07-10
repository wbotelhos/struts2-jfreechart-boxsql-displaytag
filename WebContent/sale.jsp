<%@ taglib uri="/struts-tags" prefix="s" %>

<div class="titulo">Sales:</div>

<s:iterator value="saleMap">
	<s:property value="value.month"/>
	<s:property value="value.total"/><br/>
</s:iterator>

<div class="titulo">Gr&aacute;fico:</div>

<img src="chart.jsp" alt="Sale chart" />