<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/public1.css" rel="stylesheet" type="text/css" />
<link href="css/form.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="css/ui-lightness/jquery-ui-1.8.16.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>

  
</head>

<body>

<div id="content">
       <header >
          <%@ include file="header.jsp" %>
       </header>
       <aside id="aside">
            <%@ include file="aside2.jsp" %>
       </aside>
       <fieldset id="mainContent">
   
    
         
         <div id="form-wrapper">

    <form action="expenditure_searchExpenditure.action" method="get">

        <div id="form-inner">

            <label> 起始时间:</label>

            <input type="date" class="input"  name="pTime.startTime" placeholder="选择正确的起始时间">

            <label>终止时间:</label>

            <input type="date" name="pTime.endTime" class="input"  placeholder="输入正确的终止时间">
            
           
             <input type="submit" class="button" value="搜索">

        </div>

    </form>

</div>
   
       </fieldset>
       
       </fieldset>
       <footer id="footer">
             <%@ include file="footer.jsp" %>
       </footer>
</div>

</body>
</html>
