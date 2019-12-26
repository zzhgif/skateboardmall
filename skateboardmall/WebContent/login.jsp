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
<!-- Google fonts -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext" rel="stylesheet">
<!-- Google fonts -->

<!-- css files -->
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">   
<!-- //css files -->

<link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
<link href="css/popup-box.css" rel="stylesheet" type="text/css" media="all" /> <!-- popup box css -->
<script src="js/jquery-1.9.1.js"></script>
	<script type="text/javascript">
		function getXMLHttpRequest(){
			var xhr;
			if(window.XMLHttpRequest){//other
				xhr=new XMLHttpRequest();
			}else{//IE6.0-
				xhr=new ActiveXObject("Microsoft.XMLHTTP");
			}
			return xhr;
		}
		function regfunname(){
			var xhr=getXMLHttpRequest();
			xhr.open("post","RegisterServlet",true);
			xhr.onreadystatechange=function (){
				if(xhr.readyState == 4){
					if(xhr.status == 200){
						var data=xhr.responseText;
						alert(data);
						if(data.indexOf("false")!=-1){
							$("#nameinfo").html("用户名已存在!!!");
						}
						if(data.indexOf("true")!=-1){
							$("#nameinfo").html("");
						}
					}
				}
			}
			xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			//xhr.send(null);
			alert($("#username").val());
			xhr.send("uname="+$("#username").val());
		}
			function regfunphone(){
				var xhr=getXMLHttpRequest();
				xhr.open("post","RegisterServlet",true);
				xhr.onreadystatechange=function (){
					if(xhr.readyState == 4){
						if(xhr.status == 200){
							var data=xhr.responseText;
							if(data.indexOf("false")!=-1){
								$("#phoneinfo").html("电话号码已注册!!!");
							}
							if(data.indexOf("true")!=-1){
								$("#phoneinfo").html("");
							}
						}
					}
				}
			xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xhr.send("uphone="+$("#phone").val());
		}
	</script>
</head>
<body>

<!-- section -->
<section class="register">
	<div class="header">
		<div class="logo">
			<a href="#">SKI</a>
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
					<form action="#" method="post"> 
						<input type="text" class="name" name="username" Placeholder="请输入用户名..." required=""/>
						<input type="password" class="password" name="password" Placeholder="请输入密码..." required=""/>
						<input type="submit" value="登录">
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
					<form action="#" method="post">
						<input type="text" class="name" name="username" Placeholder="请输入用户名..." required=""/>						
						<input type="text" class="phone" name="phone" Placeholder="请输入电话号码..." required=""/>
						<input type="text" name="verifiyCode"  id="code" class="username" placeholder="请输入验证码..." style="width: 240px;display: inline;" />
						<input type="button" value="获取验证码" style="width: 100px;padding-left: 5px;margin-right: 5px;display: inline">
						<input type="submit" value="登录">
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
					<form action="#" method="post"> 
						<input type="text" class="name" name="username" id="username" Placeholder="请输入用户名..." onblur="regfunname()" required=""/>
						<label id="nameinfo" style="color:red"></label>
						<input type="password" class="password" name="password1" id="password1" Placeholder="请输入密码..." required=""/>
						<input type="password" class="password" name="password2" id="password2" Placeholder="请再次输入密码..." onblur="validatePwd()" required=""/>
						<label id="pinfo"></label>
						<input type="text" class="phone" name="phone" id="phone" Placeholder="请输入电话号码..." onblur="regfunphone()" required=""/>				
						<label id="phoneinfo" style="color:red"></label>
						<input type="email" class="email" name="email" Placeholder="请输入email..." required=""/>
						<input type="submit" value="注册">
					</form> 	
				</div>
			</div>
		</div>		
	</div>
</div>
<!-- //register form popup-->

<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<!--popup-js-->
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
	 function validatePwd(){
		var pinfo = document.getElementById("pinfo");
		pinfo.innerHTML="";
    	var password1 = document.getElementById("password1").value;
   		var password2 = document.getElementById("password2").value;
    	if(password1 !=password2 ){
    		pinfo.innerHTML =  "<font color='red'>*两次密码不一致</font>";
	    }
    }
</script>
<!--//popup-js-->

</body>	
</html>