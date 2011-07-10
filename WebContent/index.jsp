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
			<s:url id="saleUrl" action="Sale!listSixMonthOfSales" />
	
			<s:div label="Purchases" href="%{purchaseUrl}" theme="ajax" refreshOnShow="true" executeScripts="true" cssClass="hidden"></s:div>
			<s:div label="Sales" href="%{saleUrl}" theme="ajax" refreshOnShow="true" executeScripts="true" cssClass="hidden"></s:div>
		</s:tabbedPanel>
	</body>
</html>