<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/adminList.jsp" method="post">
    <table width="100%" border=1>
        <tr>
            <td> <input type="submit" value="查询"> </td>
        </tr>
    </table>
    列表:
    <table width="100%" border="1">
        <tr>
            <td>name</td>
            <td>pwd</td>
        </tr>
        <c:forEach items="${adminList}" var="item">
            <tr>
            <td>${item.adminName}</td>
            <td>${item.adminPwd}</td>
        </c:forEach>
            </tr>
    </table>
</form>

</body>
</html>
