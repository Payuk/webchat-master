<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<body>
<a href="${s:mvcUrl('registrationLink').build()}">Registration</a>
<br>
<a href="${s:mvcUrl('loginLink').build()}">Login</a>
</body>
</html>

