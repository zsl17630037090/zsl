<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>业务列表</title>
</head>
<body>
<h1 align="center">业务列表</h1>
<table border="1px" cellspacing="0px" align="center" width="60%">
    <form method="post" action="businessList">
    <tr>
        <th>业务序号</th>
        <th>排队号</th>
        <th>业务类型 </th>
        <th>备注信息</th>
        <th>详情编号</th>
        <th>详情名称</th>
        <th>办理人</th>
        <th>操作内容</th>
    </tr>
    <c:forEach items="${list}" var="t">
        <tr align="center">
            <td>${t.bId}</td>
            <td>${t.bNum}</td>
            <td>${t.bType}</td>
            <td>${t.bMark}</td>
            <td></td>
            <td></td>
            <td></td>
            <td>
                <a href="">办理业务</a>
                <a href="">删除业务</a>
            </td>
        </tr>
    </c:forEach>
    <tr align="center">
        <td colspan="8">
            <a href="business_Edit.jsp">新增业务</a>
        </td>

    </tr>
        </form>
</table>

</body>
</html>
