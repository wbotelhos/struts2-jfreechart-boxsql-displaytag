<%@ taglib uri="/struts-tags" prefix="s" %>

<s:iterator value="saleMap">
	<s:property value="value.month"/>
	<s:property value="value.total"/><br/>
</s:iterator>
