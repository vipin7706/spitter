<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<c:if test="${AuthError != null}">
	<div>${AuthError}. Please Login Again</div>
</c:if>
