<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>index2.jsp</title>

        <%--外链式写法引入JQuery的js库--%>
        <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>

        <%--编写js代码--%>
        <script type="text/javascript">
            function fn() {
                $.post("ServletDemo02", {"method": "checkStu", "user": "tom"}, function (data) {
                    alert("...");
                    alert(data);
                }, "json");
            }
        </script>
    </head>
    <body>
        <%--3.1_通过表单向服务端发起请求--%>
        <form action="ServletDemo02?method=addStu" method="post">
            username: <input type="text" name="username">
            <button>form</button>
        </form>
        <br>

        <%--3.2_通过链接向服务端发起请求--%>
        <a href="ServletDemo02?method=delStu">href</a><br>

        <%--3.3_Ajax向服务端发起请求--%>
        <button onclick="fn()">ajax</button>
    </body>
</html>