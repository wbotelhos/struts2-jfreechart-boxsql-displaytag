<%@ taglib uri="/struts-tags" prefix="s" %>

<div class="titulo">Sales:</div>

<s:iterator value="saleMap">
	<s:property value="value.month"/>
	<s:property value="value.total"/><br/>
</s:iterator>

<div class="titulo">Gr&aacute;fico:</div>

<s:form action="Sale!listSixMonthsOfSales">
	<table>
		<s:datetimepicker label="Start Date" name="startDate" displayFormat="dd/MM/yyyy" />	
		<s:datetimepicker label="End Date" name="endDate" displayFormat="dd/MM/yyyy" />
		<s:submit theme="ajax" targets="tab-sale" value="Show" />	
	</table>
</s:form>

<%-- Adicionar parâmetro na URL para evitar bug na formação da mesma. --%>
<img src="${pageContext.request.contextPath}/Sale!createChart.action?startDate${startDate}&endDate=${endDate}" alt="Sale chart" />