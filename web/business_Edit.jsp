<%--
  Created by IntelliJ IDEA.
  User: zsl
  Date: 2021/6/25
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="businessList.jsp">
    <h1>新增业务</h1>
    业务类型：
    <select name="bType">
    <option value="1">信用卡</option>
    <option value="2">现金</option>
    <option value="3">开户</option>
     </select><br/>
    排队号：<input type="text" name="bNum"/><span style="color: red">必填</span><br/>
    备注信息 ：<textarea name="bMark"></textarea><br/>
    <input type="submit" value="确认添加"/>
</form>
</body>
</html>
