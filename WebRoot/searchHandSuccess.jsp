﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/public1.css" type="text/css" rel="stylesheet"  />
<link href="css/main.css" type="text/css" rel="stylesheet"  />
<link href="css/table.css" type="text/css" rel="stylesheet"  />
<link type="text/css" href="css/ui-lightness/jquery-ui-1.8.16.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){
    $("#count2").draggable({helper:"original",cursor:"move"});
	$("#tabs").draggable({helper:"original",cursor:"move"});
        $('#tabs').tabs();	

        var onSampleResized = function(e){

			var columns = $(e.currentTarget).find("th");

			var msg = "columns widths: ";

			columns.each(function(){ msg += $(this).width() + "px; "; })

			$("#sample2Txt").html(msg);

			

		};	

	

		$("#sample2").colResizable({

			liveDrag:true, 

			gripInnerHtml:"<div class='grip'></div>", 

			draggingClass:"dragging", 

			onResize:onSampleResized});
        
	})

</script>


</head>

<body>
  <div id="content">
       <header>
          <%@ include file="header.jsp" %>
       </header>
       <aside id="aside">
            <%@ include file="aside2.jsp" %>
       </aside>
       <fieldset id="mainContent">
             <div>
                
                <div id="count1"> 当前缴费费金额：<s:property value="#session.pTotal"/></div>
          
          

                <table id="sample2" width="100%" border="0" cellpadding="0" cellspacing="0">

			<tr>

				<th>时间</th><th>金额</th><th>缴费人</th>

			</tr>
           <s:iterator value="#session.findNamePaymentPage" id="fnp">
			<tr>

				<td class="left"><s:property value="#fnp.paymentDate"/></td><td><s:property value="#fnp.cash"/></td><td class="right"><s:property value="#fnp.user.id"/><s:property value="#conv =:[#this==1?'叶汇丰':''],#conv(#this.fnp.user.id)"/></td>

			</tr>
           </s:iterator>
																	

		</table>

         <div class="pages">
            <s:a href="%{'findNamePayment.action?order=first'}" >&laquo;</s:a>
            <s:if test="currentPage-2>0">
                <s:a href="%{'findNamePayment.action?order=go&goPage='+(currentPage-2)}"><s:property value="%{currentPage-2}"/></s:a>
            </s:if>
            <s:if test="currentPage-1>0">
                <s:a href="%{'findNamePayment.action?order=go&goPage='+(currentPage-1)}"><s:property value="%{currentPage-1}"/></s:a>
            </s:if>
            <b><s:property value="currentPage"/></b>
            <s:if test="currentPage+1<=maxPage">
                <s:a href="%{'findNamePayment.action?order=go&goPage='+(currentPage-(-1))}"><s:property value="%{currentPage+1}"/></s:a>
            </s:if>
            <s:if test="currentPage+2<=maxPage">
                <s:a href="%{'findNamePayment.action?order=go&goPage='+(currentPage-(-2))}"><s:property value="%{currentPage+2}"/></s:a>
            </s:if>
            <input type="text" size="3"onkeydown="javascript:if(event.keyCode==13){location='findNamePayment.action?order=go&goPage=' + (parseInt(this.value) > 0 ? parseInt(this.value):1);}">
            <s:a href="%{'findNamePayment.action?order=last'}" >&raquo;</s:a>
            Pages: ( <s:property value="currentPage"/>/<s:property value="maxPage"/> total )
        </div>
          
         </div>			
        
</fieldset>
       <footer id="footer">
             <%@ include file="footer.jsp" %>
       </footer>
  </div>


</body>
</html>
