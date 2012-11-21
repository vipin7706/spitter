<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<c:if test="${authError != null}">
	<div>Wrong Username or Password</div>
</c:if>
