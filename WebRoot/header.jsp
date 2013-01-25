<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style>
#header{
	   background-image:url(images/background_1.jpg);
	   height:100px;
}

#logo{
	width:100px;
	height:100px;
	padding:0 0 0 5px;
	float:left;
}

#bt{
	height:80px;
}

</style>
</head>

<body>
   <div id="header">
         <section id="s">
          
                <div  id="logo" > <img id="logotp" src="images/logo_h.gif" alt="logo" /> </div>
                <div id="bt">寝室财务管理系统</div>
                <div id="yhm">欢迎 <s:property value="#session.user.username"/> 的到来!!!!   2012-1-11 15：37   [<strong><a href="loginOut.action">退出</a></strong>]</div>
           
            
         </section>
   </div>


</body>
</html>
