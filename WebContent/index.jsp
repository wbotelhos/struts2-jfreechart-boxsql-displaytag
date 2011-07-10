<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Seja bem vindo!</title>

		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesheet.css"/>

		<s:head theme="ajax" debug="true" />
	</head>
	<body>
		<s:tabbedPanel id="tabs">
			<s:url id="purchaseUrl" action="Purchase" />
			<s:url id="saleUrl" action="Sale!listSixMonthsOfSales">
				<s:param name="startDate">2010-01-01</s:param>
				<s:param name="endDate">2012-12-12</s:param>
			</s:url>
	
			<s:div label="Purchases" href="%{purchaseUrl}" theme="ajax" refreshOnShow="true" executeScripts="true" cssClass="hidden"></s:div>
			<s:div id="tab-sale" label="Sales" href="%{saleUrl}" theme="ajax" refreshOnShow="true" executeScripts="true" cssClass="hidden"></s:div>
		</s:tabbedPanel>

		<script type="text/javascript">
			function showPurchaseDetails(number, date, item, total) {
				var url = 'purchaseDetails.jsp?number=' + number + '&date=' + date + '&item=' + item + '&total=' + total;
		
				window.open(url, null, 'height=200, width=300, status=yes, toolbar=no, menubar=no, location=no');
			};
		</script>
	</body>
</html>