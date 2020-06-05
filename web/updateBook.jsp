<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>修改</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/updateServlet" method="post">
    <input type="hidden" name="bid" value="${book.bid}"><br/>
    书名:<input name="bookName" value="${book.bookName}"><br/>
    价格:<input name="bookPrice" value="${book.bookPrice}"><br/>
    <input type="submit" value="确认修改">
    <input type="button" value="返回主界面" onclick="location.href='Show.jsp'">
  </form>
  </body>
</html>
