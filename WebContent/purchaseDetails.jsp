<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Purchase Details</title>

		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesheet.css"/>
	</head>
	<body>
		<div class="titulo">Purchase Details:</div>

		Number: ${param.number}<br/>
		Date: ${param.date}<br/>
		Item: ${param.item}<br/>
		Total: ${param.total}<br/><br/>

		<a href="javascript:void(0);" onclick="window.close();">Close</a>

		<script type="text/javascript">
			var screenWidth		= screen.width,
				screenHeight	= screen.height,
				x				= (screenWidth - window.outerWidth) / 2,
				y				= (screenHeight - window.outerHeight) / 2;

			window.moveTo(x, y);
		</script>
	</body>
</html>