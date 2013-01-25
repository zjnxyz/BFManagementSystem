<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">

* { margin:0;
	padding:0;
}

html {height: 100%;}

body{
	position: relative;
	height: 100%;
	background: -webkit-gradient(linear, left top, left bottom, from(#ccc), to(#fff));
	background: gradient(linear, left top, left bottom, from(#ccc), to(#fff));
	

}

.navbox {
	position: relative;
	float: left;
}

ul.nav {
	list-style: none;
	display: block;
	width: 200px;
	position: relative;
	top: 0;
	left: 10px;
	padding: 60px 0 60px 0;
	background: url(shad2.png) no-repeat;
	background-size: 50% 100%;
	-webkit-background-size: 50% 100%;
}

li {
	margin: 5px 0 0 0;
}

ul.nav li a {
	-webkit-transition: all 0.3s ease-out;
	background: #cbcbcb url(border.png) no-repeat;
	color: #174867;
	padding: 7px 15px 7px 15px;
	border-top-right-radius: 10px;
	-webkit-border-top-right-radius: 10px;
	border-bottom-right-radius: 10px;
 	-webkit-border-bottom-right-radius: 10px;
	width: 100px;
	display: block;
	text-decoration: none;
	box-shadow: 2px 2px 4px #888;
	-webkit-box-shadow: 2px 2px 4px #888;
}

ul.nav li a:hover {
	background: #ebebeb url(border.png) no-repeat;
	color: #67a5cd;
	padding: 7px 15px 7px 30px;
}

</style>

</head>

<body>

<div class="navbox">
<ul class="nav">
<li><a href="index.action">主页</a></li>
<li><a href="content.action">查看全部信息</a></li>
<li><a href="payment_sarchPayment.action?id=<s:property value="#session.user.id"/>" >个人缴费信息</a></li>
<li><a href="search1.action">查询消费信息</a></li>

</ul>
</div>



</body>
</html>