<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Seja bem vindo!</title>

		<s:head theme="ajax" debug="true" />
	</head>
	<body>
		<s:tabbedPanel id="tabbed">
			<s:div label="Purchases" href="purchase.jsp" theme="ajax" refreshOnShow="true" executeScripts="true" cssClass="hidden"></s:div>
			<s:div label="Sales" href="sale.jsp" theme="ajax" refreshOnShow="true" executeScripts="true" cssClass="hidden"></s:div>
		</s:tabbedPanel>
	</body>
</html>