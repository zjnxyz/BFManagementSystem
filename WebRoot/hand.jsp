<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/public.css" type="text/css" rel="stylesheet"  />
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
</style>

</head>

<body>
  <section>
       <header id="header">
          
       </header>
       <aside id="aside">
            <%@ include file="aside.jsp" %>
       </aside>
       <fieldset id="mainContent">
             <div>
                
                <div id="count2">个人缴费总金额：</div>
          
          

                <table id="sample2" width="100%" border="0" cellpadding="0" cellspacing="0">

			<tr>

				<th>时间</th><th>金额</th>

			</tr>

			<tr>

				<td class="left">cell</td><td class="right">cell</td>

			</tr>

			<tr>

				<td class="left">cell</td><td class="right">cell</td>

			</tr>

			
		</table>

           																

		
         </div>			
      
</fieldset>
       <footer id="footer">
             <%@ include file="footer.jsp" %>
       </footer>
  </section>


</body>
</html>
