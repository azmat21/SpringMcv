<%--
  User: otkurbiz
  Date: 10/15/15
  Time: 10:41 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<jsp:include page="public/header.jsp"/>
<body class='login'>
<div class='wrapper'>
    <div class='row'>
        <div class='col-lg-12'>
            <div class='brand text-center'>
                <h1>
                    <div class='logo-icon'>
                        <i class='icon-beer'></i>
                    </div>
                    Subat房产
                </h1>
            </div>
        </div>
    </div>
    <div class='row'>
        <div class='col-lg-12'>
            <form method="post" action="">
                <fieldset class='text-center'>
                    <legend></legend>
                    <div class='form-group'>
                        <input class='form-control' placeholder='用户名' type='text'>
                    </div>
                    <div class='form-group'>
                        <input class='form-control' placeholder='密码' type='password'>
                    </div>
                    <div class='text-center'>
                        <div class='checkbox'>
                            <label>
                                <input type='checkbox'>
                                记住密码
                            </label>
                        </div>
                        <a class="btn btn-default" href="/dashboard.html">登录</a>
                        <br>
                        <a href="/forgot_password.html">忘记密码?</a>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
<jsp:include page="public/footer.jsp"/>
