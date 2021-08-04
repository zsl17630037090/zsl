<%--
  Created by IntelliJ IDEA.
  User: zsl
  Date: 2021/6/25
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>业务详情</h1>

${list}

<form method="post" action="business_Details">


    业务序号<input type="text" name="${list.bId}"> <br/>
    排队号<input type="text" name="${list.bNum}"> <br/>
    业务类型<input type="text" name="${list.bType}"> <br/>
    备注信息<input type="text" name="${list.bMark}"> <br/>
    详情名称<input type="text" name="bdName"> <br/>
    备注信息<input type="text" name="bdPerson"> <br/>
    <input type="submit" value="确认添加"> <br/>


</form>

</body>
</html>
