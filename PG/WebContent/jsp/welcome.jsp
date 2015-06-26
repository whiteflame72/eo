<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Hello</title></head>

<body>
<h1>Education Online, Program Goals Test Utility</h1>
Hello!<BR>
<h3><s:actionerror /></h3>
<s:form action="welcome" namespace="/" method="post">
	<s:select label="Select a Person" name="profileId" headerKey="0" 
	list="profileList" listKey="profileId" listValue="fullName" emptyOption="false" />
	<s:submit method="execute" />
</s:form>
</body>
</html>
