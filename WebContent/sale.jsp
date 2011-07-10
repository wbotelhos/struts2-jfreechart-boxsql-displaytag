<%@ taglib uri="/struts-tags" prefix="s" %>

<div class="titulo">Sales:</div>

<s:iterator value="saleMap">
	<s:property value="value.month"/>
	<s:property value="value.total"/><br/>
</s:iterator>

<div class="titulo">Gr&aacute;fico:</div>

<%-- Adicionar parâmetro na URL para evitar bug na formação da mesma. --%>
<img src="${pageContext.request.contextPath}/Sale!createChart.action?dummy" alt="Sale chart" />