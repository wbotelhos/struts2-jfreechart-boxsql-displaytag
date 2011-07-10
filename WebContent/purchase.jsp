<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<div class="titulo">DisplayTag:</div>

<display:table id="lastMonth" name="sessionScope.lastMonthPurchases" uid="item" sort="list" requestURI="index.jsp">
	<display:caption class="caption">Last Month</display:caption>

	<%-- O nome do atributo do bean deve ser igual ao nome da coluna no banco. Não usar como "purchaseNumber". --%>
	<display:column sortProperty="number" title="Number" sortable="true">
		<a href="javascript:void(0);">${item.number}</a>
	</display:column>

	<display:column property="item" title="Item" />
	<display:column property="total" title="Total" />
</display:table>

<div class="titulo">Actual Month:</div>

<s:iterator value="actualMonthList">
	<s:property value="number"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>

<div class="titulo">Last Month:</div>

<s:iterator value="lastMonthList">
	<s:property value="number"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>

<div class="titulo">Year:</div>

<s:iterator value="yearList">
	<s:property value="number"/>
	<s:date name="date" format="dd/MM/yyyy" />
	<s:property value="item"/>
	<s:property value="total"/><br/>
</s:iterator>