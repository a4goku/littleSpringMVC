<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap-4.1.2/bootstrap-4.1.2.css">
    <script src="js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap-4.1.2/bootstrap-4.1.2.min.js"></script>
</head>
<body>
<div>
    <div class="jumbotron text-info bg-light jumheight1">
        <h1>springMVC</h1>
    </div>
    <!-- 轮播图 -->
    <!-- 指示符 -->
    <div class="row">
        <div class="left">
            <div id="demo" class="carousel slide " data-ride="carousel">
                <ul class="carousel-indicators">
                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                    <li data-target="#demo" data-slide-to="1"></li>
                    <li data-target="#demo" data-slide-to="2"></li>
                </ul>
                <!-- 轮播图片 -->
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="http://static.runoob.com/images/mix/img_fjords_wide.jpg">
                    </div>
                    <div class="carousel-item">
                        <img src="http://static.runoob.com/images/mix/img_nature_wide.jpg">
                    </div>
                    <div class="carousel-item">
                        <img src="http://static.runoob.com/images/mix/img_mountains_wide.jpg">
                    </div>
                </div>
                <!-- 左右切换按钮 -->
                <a href="#demo" class="carousel-control-prev" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a href="#demo" class="carousel-control-next" data-slide=next>
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>
        </div>
        <div class="right">
            <!-- 登陆窗口 -->
            <div class="card">
                <div class="card-header">
                    用户登陆
                </div>
                <div class="card-body">
                    <form name="form2" method="post">
                        <table style="border-collapse: separate;border-spacing: 0px 10px;">
                            <tr>
                                <td class="margin-top:10">
                                    <label>用户名：</label>
                                </td>
                                <td>
                                    <input type="text" name="username" class="">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>密码: </label>
                                </td>
                                <td>
                                    <input type="password" name="password" >
                                </td>
                            </tr>
                        </table>
                        <div class="form-check">
                            <label class="form-check-label">
                                <input type="checkbox" name="" class="form-check-input">记住密码
                            </label>
                        </div>
                        <div class="footer">
                            <button type="submit" class="btn btn-primary" onclick="Toregister()">登陆</button>
                            <button type="" class="btn btn-secondary" onclick="Toregister()">注册</button>
                            <button type="button" class="btn btn-link"><small>忘记密码？</small></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="jumbotron bg-light jumheight2">
        <p class="footer2">@Master_huangyx</p>
    </div>
</div>
<script>
    function Toregister(){
        var th = document.form2;
        th.action = "<%=path%>/loginProcess";
        th.submit;
    }
</script>
</body>
</html>