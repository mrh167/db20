<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>添加</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/addServlet" method="post">
    编号：<input name="bid"/><br/>
    书名：<input name="bookName"/><br/>
    价格：<input name="bookPrice"/><br/>
    <input type="submit" value="添加">
  </form>
  </body>
</html>
