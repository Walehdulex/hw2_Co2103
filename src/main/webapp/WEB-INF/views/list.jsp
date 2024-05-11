<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List</title>
</head>
<body>
<h1>List of "Buildings, Apartments and Tenants"</h1>
<ul>
    <c:forEach items="${data}" var="building">
        <li>${building.toString()}</li>
    </c:forEach>
</ul>
</body>
</html>

























<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>List</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>List of "Buildings, Apartments and Tenants</h1>--%>
<%--<h2>Building list</h2>--%>
<%--<table>--%>
<%--    <c:forEach items="${data}" var="building">--%>
<%--        <tr>--%>
<%--            <td>${building.id}</td>--%>
<%--            <td>{building.country}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

<%--<h2>Apartment List</h2>--%>
<%--<table>--%>
<%--    <c:forEach var="apartment" items="${data}">--%>
<%--        <tr>--%>
<%--            <td>${apartment.name}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

<%--<h2>Tenant List</h2>--%>
<%--<table>--%>
<%--    <c:forEach var="tenant" items="${data}">--%>
<%--        <tr>--%>
<%--            <td>${tenant.identifier}</td>--%>
<%--            <td>${tenant.age}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>




