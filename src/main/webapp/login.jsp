<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录页</title>
    <!--响应式布局，自适应物理配置，initial-scale设置为1：完全不缩放-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--引入Bootstrap样式-->
    <link rel="stylesheet" type="text/css" href="<c:url value="css/bootstrap-4.1.2/bootstrap.css"/> "/>
</head>
<body>
<!--navbar指定此nav为导航栏，navbar-inverse指定导航的样式，navbar-fixed-top指定导航栏的位置-->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <!--container 导航栏容器-->
    <div class="container">
        <!--navbar-header 头部，设置项目名称或logo-->
        <div class="navbar-header">
            <!--设置项目名称或logo-->
            <a href="#" class="navbar-brand">Project name</a>
        </div>
        <!--其他导航，指定几行几个内容-->
        <div class="collapse navbar-collapse" id="navbar">
            <ul class="nav navbar-nav">
                <!--active 表示默认选中，添加a标签，代表可选中-->
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
