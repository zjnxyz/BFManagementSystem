<%-- 
    Document   : login
    Created on : 2008-10-9, 8:21:38
    Author     : stu
--%>
<%@ taglib  prefix="s" uri="/struts-tags" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<!--登陆页面-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>用户登陆</title>
        <style type="text/css">
            <!--
            #apDiv1 {
                position:absolute;
                width:711px;
                height:317px;
                z-index:1;
                left: 277px;
                top: 112px;
            }
            table {
                border-collapse:collapse; /* 关键属性：合并表格内外边框(其实表格边框有2px，外面1px，里面还有1px哦) */
                border:solid #999; /* 设置边框属性；样式(solid=实线)、颜色(#999=灰) */
                border-width:1px 0 0 1px; /* 设置边框状粗细：上 右 下 左 = 对应：1px 0 0 1px */
            }
            table th, table td {
                border:solid #999;
                border-width:0 1px 1px 0;
                padding:2px;
            }
            table th {
                background-color:rgb(241, 247, 251);
            }
            .red{
                color:#FF0000;
            }
            -->
        </style>
       
    </head>
    <body>
        <div id="apDiv1">
            <s:form action="login" onsubmit="return formCheck();">
                <table width="703">
                    <tr>
                        <th height="49" colspan="3">用户登陆</th>
                    </tr>
                    <tr >
                        <td width="160" height="48">用户名</td>
                        <td width="201">
                            <input name="username" type="text" id="id" maxlength="10" />
                        </td>
                        <td width="326"><span id="idInfo">请输入你的用户名</span></td>
                    </tr>
                    <tr>
                        <td height="52">密码</td>
                        <td>
                            <input name="password" type="password" id="password" maxlength="10" />
                        </td>
                        <td><span id="passwordInfo">请输入密码</span></td>
                    </tr>
                    
                    <tr align="center">
                        <td height="47" colspan="3"><input type="submit" value="提交" /></td>
                    </tr>
                </table>
            </s:form>
        </div>
    </body>
</html>