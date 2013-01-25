<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/public1.css" type="text/css" rel="stylesheet"  />
<link href="css/photo.css" type="text/css" rel="stylesheet"  />
<link type="text/css" href="css/ui-lightness/jquery-ui-1.8.16.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){
	$("#count1").draggable({helper:"original",cursor:"move"});
    $("#count2").draggable({helper:"original",cursor:"move"});
	$("#context_table").draggable({helper:"original",cursor:"move"});
	
	})

</script>

</head>

<body>
  <div id="content">
       <header id="header">
           <%@ include file="header.jsp" %>
       </header>
       <aside id="aside">
       
          <%@ include file="aside2.jsp" %>
          
       </aside>
       <fieldset id="mainContent">
             <div class="photo-album">
		
		<h1><span>Nat <abbr title="and" class="amp">&amp;</abbr> Simon in New Zealand</span></h1>
		
		<a href="http://www.flickr.com/photos/nataliedowne/2254117707/in/set-72157604232220981" class="large polaroid img1"><img src="../img/volcanic.jpg" alt="">This breathtaking volcanic lake is at Wai-O-Tapu Thermal Wonderland</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2254700486/in/set-72157604232220981/" class="polaroid img2"><img src="../img/waterfall.jpg" alt="">This lovely waterfall was at Rotorua in Rainbow Springs</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2254704566/in/set-72157604232220981/" class="small polaroid img3"><img src="../img/leaf.jpg" alt="">Ferntastic</a>
		
		<a href="http://www.flickr.com/photos/nataliedowne/2311404989/in/set-72157604232220981/" class="medium polaroid img4"><img src="../img/whale.jpg" alt="">At Kaikoura we went whale watching!</a>
		
		<a href="http://www.flickr.com/photos/nataliedowne/2312219680/in/set-72157604232220981" class="polaroid img5"><img src="../img/seal.jpg" alt="">Found this little cutie on a walk in New Zealand!</a>
		
		
		<a href="http://www.flickr.com/photos/nataliedowne/2254789880/in/set-72157604232220981/" class="polaroid img6"><img src="../img/lake.jpg" alt="">An amazing bubbling volcanic spring, a bit muddy</a>
		
		<a href="http://www.flickr.com/photos/nataliedowne/2341399904/in/set-72157604232220981/" class="polaroid img7"><img src="../img/simon.jpg" alt="">Simon in a giant Kiwi, pretending to be a Kiwi (the bird)</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2352603191/in/set-72157604232220981/" class="small polaroid img8"><img src="../img/albatross.jpg" alt="">Albatross in Dunedin</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2340993237/in/set-72157604232220981/" class="medium polaroid img9"><img src="../img/raft.jpg" alt="">White water rafting in Queenstown</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2306995686/in/set-72157604033893095/" class="polaroid img10"><img src="../img/whiteisland.jpg" alt="">White Island</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2306989200/in/set-72157604033893095/" class="small polaroid img11"><img src="../img/sulphur.jpg" alt="">Sulphurous</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2352608953/in/set-72157604232220981/" class="small polaroid img12"><img src="../img/sealions.jpg" alt="">Sea lions!</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2341816430/in/set-72157604232220981/" class="small polaroid img13"><img src="../img/horses.jpg" alt="">Horse riding</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2352490411/in/set-72157604232220981/" class="small polaroid img14"><img src="../img/camping.jpg" alt="">Stewart Island</a>
		<a href="http://www.flickr.com/photos/nataliedowne/2339184562/in/set-72157604232220981/" class="polaroid img15"><img src="../img/us.jpg" alt="">Us in a blue cave on the Franz Josef glacier</a>

	</div>
	
       </fieldset>
       <footer id="footer">
            <%@ include file="footer.jsp" %>
       </footer>
  </div>


</body>
</html>
