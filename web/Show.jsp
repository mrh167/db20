<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>显示</title>
  </head>
  <body>
  <center>
    <h1>图书管理系统</h1>
    <table border="1px" cellspacing="0">
      <tr>
        <td>id</td>
        <td>书名</td>
        <td>价格</td>
        <td>操作</td>
      </tr>
      <c:forEach items="${list}" var="l">
        <tr>
          <td>${l.bid}</td>
          <td>${l.bookName}</td>
          <td>${l.bookPrice}</td>
          <td>
            <a href="${pageContext.request.contextPath}/deleteServlet?bid=${l.bid}">删除</a>
            <a href="${pageContext.request.contextPath}/updateServlet?bid=${l.bid}">修改</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </center>
  </body>
</html>
