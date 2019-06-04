<%--
  Created by IntelliJ IDEA.
  User: Vivian8421
  Date: 2019/5/30
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery-1.7.2.min.js"></script>
  </head>
  <body>
  <form id="myform">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="text" name="sex">
    <input type="button" id="btn" value="添加用户">
  </form>
  </body>
</html>
<script>
  $(function () {
    $("#btn").click(function () {
      $.ajax({
        url:"userServlet",
        type:"post",
        data:$("#myform").serialize(),
        success:function (data) {
          alert("yes");
        },
        error:function (data) {
          alert("no");
        }
      });
    });
  });
</script>
