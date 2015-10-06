<%@ page language="java" pageEncoding="UTF-8"%>
<!doctype html>
<html>
	<head>
		<jsp:include page="common/head.jsp"></jsp:include>
		<style type="text/css">
			.header {
				text-align: center;
			}
			.header h1 {
				font-size: 200%;
				color: #333;
				margin-top: 30px;
			}
		</style>
	</head>
	<body>
		<div class="header">
			<div class="am-g">
				<h1>房地产客户关系管理系统</h1>
			</div>
			<hr/>
		</div>
		<div class="am-g">
			<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
				<h3>系统登录</h3>
				<hr>
				<form method="post" class="am-form" action="${pageContext.request.contextPath}/user/login.do">
					<label for="username">用户名：</label>
					<input type="text" name="user.username" id="username">
					<br>
					<label for="password">密码：</label>
					<input type="password" name="user.pwd" id="password">
					<br>
					<label for="remember-me">
						<input id="remember-me" type="checkbox">&nbsp;记住密码
					</label>
					<br />
					<div class="am-cf">
						<input type="submit" value="登录系统" class="am-btn am-btn-primary am-btn-sm am-fl">
						<input type="submit" value="忘记密码 ^_^?" class="am-btn am-btn-default am-btn-sm am-fr">
					</div>
				</form>
				<hr>
				<p>©&nbsp;2015&nbsp;达内软件技术(杭州)有限公司-英才添翼-华东大学生基地&nbsp;翻版必究</p>
			</div>
		</div>

		<jsp:include page="common/js.jsp"></jsp:include>
	</body>
</html>