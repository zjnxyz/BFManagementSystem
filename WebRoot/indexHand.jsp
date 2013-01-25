<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/public1.css" type="text/css" rel="stylesheet"  />
<link href="css/main.css" type="text/css" rel="stylesheet"  />
<link type="text/css" href="css/ui-lightness/jquery-ui-1.8.16.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){
	$("#count1").draggable({helper:"original",cursor:"move"});
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

<style type="text/css">

#count1{
	display:block;
	width:250px;
	height:50px;
	background-color:#0F0;
	border:solid 5px blue;
	border-radius:20px;
	padding : 20px;
	float:left;
}
#count2{
	display: inline-block;
	width:250px;
	height:50px;
	border:solid 5px blue;
	border-radius:20px;
	padding : 20px;
	background-color:#00F;
}


 /*翻页超链接*/
    .pages {
                margin:3px 0;
                font:11px/12px Tahoma;
            }
    .pages * {
                vertical-align:middle;
            }
     .pages a {
                padding:1px 4px 1px;
                border:1px solid #6699CC;
                margin:0 1px 0 0;
                text-align:center;
                text-decoration:none;
                font:normal 12px/14px verdana;
                color:#2F5FA1;
                background-color:#F3F8FC;
            }
  .pages a:hover {
                border:#cf850a 1px solid;
                background:#ffeccd;
                text-decoration:none;
                color:#d36800
            }
    .pages b {
                padding:1px 4px 1px !important;
                padding:1px 1px 2px;
                border:1px solid #3b70af;
                color:#fff;
                background:#689bd0;
                margin:0 1px 0 0;
                text-align:center;
                text-decoration:none;
                font:normal 12px/14px verdana;
            }

 .pages input {
                margin-bottom:0px;
                border:1px solid #2f5fa1;
                height:15px;
                font:bold 12px/15px Verdana;
                padding-bottom:1px;
                padding-left:1px;
                margin-right:1px;
                color:#2f5fa1;
            }
</style>

</head>

<body>
  <div id="content">
       <header >
            <%@ include file="header.jsp" %>
       </header>
       <aside id="aside">
            <%@ include file="aside.jsp" %>
       </aside>
       <fieldset id="mainContent">
             <div>
                
                <div id="count2">个人缴费总金额：<s:property value="#session.spTotal"/></div>
          
          

                <table id="sample2" width="100%" border="0" cellpadding="0" cellspacing="0">

			<tr>

				<th>时间</th><th>金额</th>

			</tr>

			<s:iterator value="#session.searchPaymentPage" id="sp">

			 <tr>

				<td class="left"><s:property value="#sp.paymentDate"/></td><td class="right"><s:property value="#sp.cash"/></td>

			 </tr>
			
			</s:iterator>
			
		</table>

         <div class="pages">
            <s:a href="%{'searchPayment.action?order=first'}" >&laquo;</s:a>
            <s:if test="currentPage-2>0">
                <s:a href="%{'searchPayment.action?order=go&goPage='+(currentPage-2)}"><s:property value="%{currentPage-2}"/></s:a>
            </s:if>
            <s:if test="currentPage-1>0">
                <s:a href="%{'searchPayment.action?order=go&goPage='+(currentPage-1)}"><s:property value="%{currentPage-1}"/></s:a>
            </s:if>
            <b><s:property value="currentPage"/></b>
            <s:if test="currentPage+1<=maxPage">
                <s:a href="%{'searchPayment.action?order=go&goPage='+(currentPage-(-1))}"><s:property value="%{currentPage+1}"/></s:a>
            </s:if>
            <s:if test="currentPage+2<=maxPage">
                <s:a href="%{'searchPayment.action?order=go&goPage='+(currentPage-(-2))}"><s:property value="%{currentPage+2}"/></s:a>
            </s:if>
            <input type="text" size="3"onkeydown="javascript:if(event.keyCode==13){location='searchPayment.action?order=go&goPage=' + (parseInt(this.value) > 0 ? parseInt(this.value):1);}">
            <s:a href="%{'searchPayment.action?order=last'}" >&raquo;</s:a>
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

				
           															