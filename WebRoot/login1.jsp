<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
<title>Twitter Login</title>
<link href="css/front.css" media="screen, projection" rel="stylesheet" type="text/css">


  <style type="text/css">
#experiment {
  -webkit-perspective: 800; 
  -webkit-perspective-origin: 50% 200px;
}

#cube {
  position: relative;
  margin: 100px auto 0;
  height: 400px;
  width: 400px;
  -webkit-transition: -webkit-transform 2s linear;
  -webkit-transform-style: preserve-3d;
}

.face {
  position: absolute;
  height: 360px;
  width: 360px;
  padding: 20px;
  background-color: rgba(50, 50, 50, 0.7);
  font-size: 27px;
  line-height: 1em;
  color: #fff;
  border: 1px solid #555;
  -webkit-border-radius: 3px;
}   

#cube .one  {
  -webkit-transform: rotateX(90deg) translateZ(200px);
}

#cube .two {
  -webkit-transform: translateZ(200px);
}

#cube .three {
  -webkit-transform: rotateY(90deg) translateZ(200px);
}

#cube .four {
  -webkit-transform: rotateY(180deg) translateZ(200px);
}

#cube .five {
  -webkit-transform: rotateY(-90deg) translateZ(200px);
}

#cube .six {
  -webkit-transform: rotateX(-90deg) rotate(180deg) translateZ(200px) ;
}

h1 {
  font: bold 330%/100% "Lucida Grande";
  position: relative;
  color: #464646;
}
h1 span {
  background: url(gradient.png) repeat-x;
  position: absolute;
  display: block;
  width: 100%;
  height: 31px;
}

</style>

</head>
<body>

  <h1><span>CSS Gradient Text</span></h1>

<div id="container">
  <div id="topnav" class="topnav"> Have an account? <a href="login" class="signin"><span>Sign in</span></a> </div>


  
  <fieldset id="signin_menu">
    <form method="post" id="signin" action="login.action">
      <label for="username"></label>
      <input id="username" name="username" value="" title="username" tabindex="4" type="text">
      
      <p>
        <label for="password">Password</label>
        <input id="password" name="password" value="" title="password" tabindex="5" type="password">
      </p>
      <p class="remember">
        <input id="signin_submit" value="Sign in" tabindex="6" type="submit">
        <input id="remember" name="remember_me" value="1" tabindex="7" type="checkbox">
        <label for="remember">Remember me</label>
      </p>
      <p class="forgot"> <a href="#" id="resend_password_link">Forgot your password?</a> </p>
      <p class="forgot-username"> <A id=forgot_username_link 
title="If you remember your password, try logging in with your email" 
href="#">Forgot your username?</A> </p>
    </form>
  </fieldset>
</div>


<div id="wrapper">
<div id="experiment">	
	<div id="cube">
        <div class="face one">
			One face
        </div>
        <div class="face two">
			Up, down, left, right
        </div>
        <div class="face three">
			Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        </div>
        <div class="face four">
			New forms of navigation are fun.
        </div>
        <div class="face five">
			Rotating 3D cube
        </div>
        <div class="face six">
			<img src="bacground_2.jpg" />
        </div>
    </div>	
</div>


<script src="js/jquery-1.6.2.min.js" type="text/javascript"></script> 
<script type="text/javascript">
        $(document).ready(function() {

            $(".signin").click(function(e) {          
				e.preventDefault();
                $("fieldset#signin_menu").toggle();
				$(".signin").toggleClass("menu-open");
            });
			
			$("fieldset#signin_menu").mouseup(function() {
				return false
			});
			$(document).mouseup(function(e) {
				if($(e.target).parent("a.signin").length==0) {
					$(".signin").removeClass("menu-open");
					$("fieldset#signin_menu").hide();
				}
			});			
			
        });
</script> 

	<script>var xAngle = 0, yAngle = 0;
$('body').keydown(function(evt) {
	switch(evt.keyCode) {
		case 37: // left
			yAngle -= 90;
			break;
		
		case 38: // up
			xAngle += 90;				
			break;
		
		case 39: // right
			yAngle += 90;
			break;
			
		case 40: // down
			xAngle -= 90;
			break;
	};
	$('#cube')[0].style.webkitTransform = "rotateX("+xAngle+"deg) rotateY("+yAngle+"deg)";
});</script>

</body>
</html>