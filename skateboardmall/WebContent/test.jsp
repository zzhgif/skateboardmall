<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 
	<head>
		<meta charset="UTF-8">
		<title>注册页面</title>
		<script>
			function checkForm() {
				//	 alert("aaa");
				//校验用户名
				//1.获取用户输入的数据
				var uValue = document.getElementById("user").value;
				//alert(uValue);
				if (uValue == "") {
					alert("用户名不能为空。")
					return false;
				}
				//校验密码信息
				var pValue = document.getElementById("password").value;
				
				if (pValue == "") {
					alert("密码不能为空")
					return false;
				}
				var rpValue=document.getElementById("repassword").value;
				if(rpValue==""){
					alert("第二次输入的密码为空，请重新输入");
					return false;
				}else if (pValue !=rpValue) {
					
					alert("两次密码输入不一致，请重新输入");
					return false;
				}
				
				//校验邮箱
				var eValue=document.getElementById("eamil").value;
				
				if (eValue=="") {
					alert("邮箱不能为空，请重新输入");
					
				} else if(!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/.test(eValue)){
				 alert("邮箱格式不正确，请检查后输入");	
				}
				
			}
		</script>
	</head>
 
	<body>
		<table border="1px" align="center" width="1300px" cellpadding="0px" cellspacing="0px">
			<!--1.logo部分-->
			<tr>
				<td>
					<!--嵌套一个一行三列的表格-->
					<table border="1px" width="100%">
						<tr height="50px">
							<td width="33.3%">
								<img src="../img/logo2.png" height="47px" />
							</td>
							<td width="33.3%">
								<img src="../img/header.png" height="47px" />
							</td>
							<td width="33.3%">
								<a href="#">登录</a>
								<a href="#">注册</a>
								<a href="#">购物车</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<!--2.导航栏部分-->
			<tr height="50px">
				<td bgcolor="black">
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#">
						<font size="5" color="white">首页</font>
					</a> &nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#">
						<font color="white">手机数码</font>
					</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#">
						<font color="white">电脑办公</font>
					</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#">
						<font color="white">鞋靴箱包</font>
					</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#">
						<font color="white">家用电器</font>
					</a>
				</td>
			</tr>
			<!--3.注册表单-->
			<tr>
				<td height="600px" background="../img/regist_bg.jpg">
					<!--嵌套一个十行二列的表格-->
					<form action="#" method="get" name="regForm" οnsubmit="return checkForm()">
						<table border="1px" width="750px" height="400px" align="center" cellpadding="0px" cellspacing="0px" bgcolor="white">
							<tr height="40px">
								<td colspan="2">
									<font size="4">会员注册</font> &nbsp;&nbsp;&nbsp;USER REGISTER
								</td>
							</tr>
							<tr>
								<td>
									用户名
								</td>
								<td>
									<input type="text" name="user" size="34px" id="user" />
								</td>
							</tr>
							<tr>
								<td>
									密码
								</td>
								<td>
									<input type="password" name="password" size="34px" id="password" />
								</td>
							</tr>
							<tr>
								<td>
									确认密码
								</td>
								<td>
									<input type="password" name="repassword" size="34px" id="repassword"></input>
								</td>
							</tr>
							<tr>
								<td>
									Emaile
								</td>
								<td>
									<input type="text" name="email" size="34px" id="eamil" />
								</td>
							</tr>
							<tr>
								<td>
									姓名
								</td>
								<td>
									<input type="text" name="username" size="34px" />
								</td>
							</tr>
							<tr>
								<td>
									性别
								</td>
								<td>
									<input type="radio" name="sex" value="男" />男
									<input type="radio" name="sex" value="女" />女
								</td>
							</tr>
							<tr>
								<td>
									出生日期
								</td>
								<td>
									<input type="text" name="birthday" size="34px" />
								</td>
							</tr>
							<tr>
								<td>
									验证码
								</td>
								<td>
									<input type="text" name="yzm" />
									<img src="../img/yanzhengma.png" />
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<input type="submit" value="注册" />
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
			<!--4.广告图片-->
			<tr>
				<td>
					<img src="../img/footer.jpg" width="100%" />
				</td>
			</tr>
			<!--5.友情链接和版权信息-->
			<tr>
				<td align="center">
					<a href="#">关于我们</a>
					<a href="#">联系我们</a>
					<a href="#">招贤纳士</a>
					<a href="#">法律声明</a>
					<a href="#">友情链接</a>
					<a href="#">支付方式</a>
					<a href="#">配送方式</a>
					<a href="#">服务声明</a>
					<a href="#">广告声明</a>
					<p>
						Copyright © 2005-2016 版权所有
					</p>
				</td>
			</tr>
		</table>
	</body>
</html>