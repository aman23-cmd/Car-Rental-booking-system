<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h2>Registered Users:</h2>
    <ul>
        <c:forEach var="user" items="${users}">
            <li>${user.username}</li>
        </c:forEach>
    </ul>
</body>
</html>
