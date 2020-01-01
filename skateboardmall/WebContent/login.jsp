<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录注册页面</title>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext" rel="stylesheet">

<link href="css/style1.css" type="text/css" rel="stylesheet" media="all">   
<link rel="stylesheet" href="css/font-awesome1.css"> <!-- Font-Awesome-Icons-CSS -->
<link href="css/popup-box1.css" rel="stylesheet" type="text/css" media="all" /> <!-- popup box css -->
<script src="js/jquery-1.9.1.js"></script>
	<script type="text/javascript">
		function getXMLHttpRequest(){
			var xhr;
			if(window.XMLHttpRequest){
				xhr=new XMLHttpRequest();
			}else{
				xhr=new ActiveXObject("Microsoft.XMLHTTP");
			}
			return xhr;
		}
		function regfunname(){
			var xhr=getXMLHttpRequest();
			xhr.open("post","UserNameCheckServlet",true);
			xhr.onreadystatechange=function (){
				if(xhr.readyState == 4){
					if(xhr.status == 200){
						var data=xhr.responseText;
						if(data.indexOf("namefalse")!=-1){
							alert("用户名已存在!!!");
						}
						if(data.indexOf("nametrue")!=-1){
							$("#nameinfo").html("");
						}
					}
				}
			}
			xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xhr.send("uname="+$("#username").val());
		} 
			function regfunphone(){
				var xhr=getXMLHttpRequest();
				xhr.open("post","UserPhoneCheckServlet",true);
				xhr.onreadystatechange=function (){
					if(xhr.readyState == 4){
						if(xhr.status == 200){
							var data=xhr.responseText;
							if(data.indexOf("phonefalse")!=-1){
								alert("电话号码已经注册过");
							}
							if(data.indexOf("phonetrue")!=-1){
								$("#phoneinfo").html("");
							}
						}
					}
				}
			xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xhr.send("uphone="+$("#phone").val());
		} 
	</script>
	<style type="text/css">
		.parent {display: table;}
		.child {
			width: 80px;
			height: 30px;
			background-color:#a0d8ef;
			text-align: center;
			padding-top:5px;
			font-size: 18px;
			display: table-cell;
			vertical-align: middle;
			
			-webkit-user-select: none; /*禁止用户选中文字*/
		}
		#t1 *{
			 vertical-align:middle;
			 display:inline-block;
		 }
	</style>
</head>
<body onLoad="refreshCode()">

<section class="register">
	<div class="header">
		<div class="logo">
			<a href="login.jsp">SKI</a>
		</div>
		<div class="clear"></div>
	</div>
	<div class="register-full">
		<div class="register-left">
			<div class="register">
				<h1>亲爱的顾客</h1>
				<h2>欢迎光顾SKI滑雪之家</h2>
				<p style="text-indent:2em">
					高山滑雪起源于阿尔卑斯山地域，起源于中欧的阿尔卑斯地区，故又称阿尔卑斯滑雪。高山滑雪是在越野滑雪基础上逐步形成的。
					特定的地理环境产生特定的求生方式，经常处于冰天雪地的北欧早在五千多年前就已经开始有滑雪运动了。
					与其他起源于欧洲的冰上运动类似，它也是由原始狩猎演变而来并逐渐成为一种交通方式在北欧流行开来。
					今天能见到的最早的滑雪板现保存于“滑雪运动之都”挪威奥斯陆，那里陈列着一些1500年前的滑雪板。
				</p>
			</div>
		</div>
		<div class="register-right">
			<div class="clear"> </div>
			<div class="register-in">
				<a class="book popup-with-zoom-anim button-isi zoomIn animated" data-wow-delay=".5s" href="#small-dialog2">&nbsp;&nbsp;注册 »</a>
			</div>
			<div class="register-in middle">
				<a class="book popup-with-zoom-anim button-isi zoomIn animated" data-wow-delay=".5s" href="#small-dialog">&nbsp;&nbsp;登录 »</a>
			</div>
			<div class="register-in">
			</div>
			<div class="clear"> </div>
		</div>
	<div class="clear"> </div>
	</div>
</section>
<!-- //section -->
<!-- login form popup-->
<div class="pop-up"> 
	<div id="small-dialog" class="mfp-hide book-form">
		<div class="login-form login-form-left"> 
			<div class="agile-row">
				<h3>登录</h3>
				<span class="fa fa-lock"></span>
				<div class="clear"></div>
				<div class="login-agileits-top"> 	
					<form action="UserLoginServlet1" method="post"> 
						<input type="text" class="name" name="username" Placeholder="请输入用户名..." required=""/>
						<input type="password" class="password" name="password" Placeholder="请输入密码..." required=""/>
						<div id="t1">
							<input type="text" name="imgcode"  id="imgcode" class="imgcode" placeholder="请输入验证码..." style="width: 140px;" required=""/>
							<div class="parent">
								<div id="code_box" class="child" onClick="refreshCode()">Content here</div>
							</div>
						</div>						
						<input type="submit" value="登录" onclick="checkImgCode()">
					</form> 	
				</div> 
				<div class="login-agileits-bottom"> 
					<h6><a class="book popup-with-zoom-anim button-isi zoomIn animated" data-wow-delay=".5s" href="#small-dialog1">忘记密码</a></h6>
				</div> 
			</div>  
		</div>
	</div>  
</div>
<!-- //login form popup-->

<!-- subscribe form popup-->
<div class="pop-up"> 
	<div id="small-dialog1" class="mfp-hide book-form">
		<div class="login-form login-form-left"> 
			<div class="agile-row">
				<h3>验证码登录</h3>
				<div class="clear"></div>
				<div class="login-agileits-top"> 	
					<form action="UserLoginServlet2" method="post">
						<input type="text" class="name" name="username" Placeholder="请输入用户名..." required=""/>						
						<input type="text" class="lphone" id="lphone"name="phone" Placeholder="请输入电话号码..." required=""/>
						<input type="text" name="lcode"  id="lcode" class="lcode" placeholder="请输入验证码..." style="width: 180px;display: inline;" required=""/>
						<input type="button" value="获取验证码" id="lgetCode" style="width: 160px;padding-left: 5px;margin-right: 5px;display: inline">
						<input type="submit" value="登录" onclick="checkLCode()">
					</form> 	
				</div>
			</div>  
		</div>
	</div>  
</div>
<!-- //subscribe form popup-->

<!-- register form popup-->
<div class="pop-up"> 
	<div id="small-dialog2" class="mfp-hide book-form">
	
		<div class="login-form login-form-left"> 
			<div class="agile-row">
				<h3>注册页面</h3>
				<div class="login-agileits-top"> 	
					<form action="RegisterServlet" method="post"> 
						<input type="text" class="name" name="username" id="username" Placeholder="请输入用户名..." onblur="regfunname()" required=""/>
						<label id="nameinfo" style="color:red"></label>
						<input type="password" class="password" name="password1" id="password1" Placeholder="请输入密码..." required=""/>
						<input type="password" class="password" name="password2" id="password2" Placeholder="请再次输入密码..." onblur="validatePwd()" required=""/>
						<label id="pinfo"></label>
						<input type="email" class="email" name="email" Placeholder="请输入email..." required=""/>
						<input type="text" class="rphone" name="uphone" id="rphone" Placeholder="请输入电话号码..."  onblur="regfunphone()" required=""/>				
						<label id="phoneinfo" style="color:red"></label>
						<input type="text" name="rcode"  id="rcode" class="rcode" placeholder="请输入验证码..." style="width: 240px;display: inline;"required="" />
						<span id="rcodemsg"></span>
						<input type="button" id="rgetCode" value="获取验证码" style="width: 100px;padding-left: 5px;margin-right: 5px;display: inline">
						<input type="submit" value="注册" onclick="checkRCode()">
					</form> 	
				</div>
			</div>
		</div>		
	</div>
</div>
<!-- //register form popup-->
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
 <script>
	$(document).ready(function() {
		$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
		});																	
	});
	//图片验证码刷新
	 function refreshCode() {
			var code_box = document.getElementById("code_box");
			//62个字符 随机选择4位
			var code = '0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM',
				chars = '';
				result = '';
	 
			for (var i = 0; i < 4; i++) {
				var code_index = Math.round(Math.random()*61);
				var chars = code[code_index];
				if (result.toUpperCase().indexOf(chars.toUpperCase()) > -1)
				{	
					i --;
					continue;//终止本轮循环 进行下一轮
				}
				result += chars;
			}
			code_box.innerHTML = result;
		}
		//图片验证码验证
		function checkImgCode(){
			var checkCode= document.getElementById("code_box").childNodes[0].nodeValue;
			var myInputCode = document.getElementById("imgcode").value;
			if((checkCode.toLowerCase())==(myInputCode.toLowerCase())){
				return true;
			}else{
				confirm("验证码输入错误，请确认后再重新输入");
				if(document.all){
					event.returnValue=false;
				}else{
					event.preventDefault();
				}
			}
		}
	//检验注册时两次密码是否相同
	 function validatePwd(){
		var pinfo = document.getElementById("pinfo");
		pinfo.innerHTML="";
    	var password1 = document.getElementById("password1").value;
   		var password2 = document.getElementById("password2").value;
    	if(password1 !=password2 ){
    		alert("密码不一致，请重新输入");
	    }
    }
	 //等待时间
    var waitTime = 60;
    var PATTERN = /^1[358]\d{9}$|^147\d{8}$|^176\d{8}$/;  
	//验证码登录
    var lphone = document.getElementById("lphone");
    var lcode = document.getElementById("lcode");
    var lgetCode = document.getElementById("lgetCode");
    var lcodemsg = document.getElementById("lcodemsg");
    var lphoneResult = PATTERN.test(lphone.value);
    lgetCode.onclick = function (){
        if(lphone.value == null||lphone.value == ""){
     	   alert("请输入电话号码!!!");
        }
        else if(lphoneResult){
     	   alert("请输入正确格式的电话号码!!!");
        }
        else{
     	   //电话号码发送服务器，服务器再给提供的电话号码发送短信
 	        var xmlHttp;
 			try {
 				xmlHttp = new XMLHttpRequest();
 			} catch (e) {
 				try {
 					xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
 				} catch (e) {
 					alert("您的浏览器版本过低，请更换浏览器！");
 				}
 			}
 			xmlHttp.open("GET", "SmsServletL?phone="+ lphone.value, true);
			xmlHttp.send(null);			
 	    	time(this);	
        }        
     }
    //登录验证码验证
    var lcode = <%=session.getAttribute("lcode")%>;   
    function checkLCode(){
		var myInputCodeL = document.getElementById("lcode").value;
		if(lcode == myInputCodeL){
			return true;
		}else{
			confirm("验证码输入错误，请确认后再重新输入");
			if(document.all){
				event.returnValue=false;
			}else{
				event.preventDefault();
			}
		}
	}
    //用户注册
    var rphone = document.getElementById("rphone");
    var rcode = document.getElementById("rcode");
    var rgetCode = document.getElementById("rgetCode");
    var rphoneResult = PATTERN.test(rphone.value);
    rgetCode.onclick = function (){
       if(rphone.value == null||rphone.value == ""){
    	   alert("请输入电话号码!!!");
       }
       else if(rphoneResult){
    	   alert("请输入正确格式的电话号码!!!");
       }
       else{
    	   //电话号码发送服务器，服务器再给提供的电话号码发送短信
	        var xmlHttp;
			try {
				xmlHttp = new XMLHttpRequest();
			} catch (e) {
				try {
					xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					alert("您的浏览器版本过低，请更换浏览器！");
				}
			}
			xmlHttp.open("GET", "SmsServletR?phone="+ rphone.value, true);
			xmlHttp.send(null);			
	    	time(this);	
       }        
    }
    //注册验证码验证
    var rcode = <%=session.getAttribute("rcode")%>;   
    function checkRCode(){
		alter(rcode);
    	var myInputCodeR = document.getElementById("rcode").value;
		if(rcode == myInputCodeR){
			return true;
		}else{
			confirm("验证码输入错误，请确认后再重新输入");
			if(document.all){
				event.returnValue=false;
			}else{
				event.preventDefault();
			}
		}
	}
	//短信验证倒计时
    function time(ell){
       if(waitTime==0){
    	   ell.disabled = false;
    	   ell.value = "获取验证码";
    	   waitTime = 60;
       }else{	 
    	   ell.disabled=true;
           ell.value = waitTime + "秒后可以重新发送";
           waitTime--;
           setTimeout(function() {
               time(ell)// 关键处-定时循环调用
           }, 1000)
       }
    }
</script>
<!--//popup-js-->

</body>	
</html>