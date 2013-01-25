<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xinjian.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   
    <form action="payment_save.action" method="get">

        <div id="form-inner">

            <label>时间:</label>

            <input type="date" class="input" name="payment.paymentDate" placeholder="选择正确的缴费时间">

            <label >金额:</label>

            <input name="payment.cash" class="input"  placeholder="输入正确的缴费金额" >
             <label >缴费人:</label>
            
          
             <input type="submit" class="button" value="提交">

        </div>

    </form>

  </body>
</html>
