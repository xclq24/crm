<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <script>
	$(function(){
		$('#username').blur(check_uname);
		$('#add').click(function(){
			haha('/crm/page/basis/addEmployee.do');
		});
	});
	function check_uname(){
		if($('#username').val().length==0){
			alert("不能为空！");
			return false;
		}
		$.ajax({
			'url':'/crm/page/basis/check_uname.do?username='+$('#username').val(),
			'type':'post',
			'dataType':'json',
			'success':function(data){
				if(data==1){
					alert("用户名可以使用");
					return true;
				}else{
					alert("用户名不可用");
					return false;
				}
			},'error':function(){
				alert("出错");
				return false;
			}
		});
	}
</script>
<strong class="am-text-primary am-text-lg">添加员工</strong>&nbsp;/&nbsp;<small>管理员</small>
<hr/>
<form  class="am-form am-form-horizontal" method="post" >
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label" >姓名：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.name" type="text" value="">
		</div>
		<label class="am-u-sm-2 am-form-label">帐号：</label>
		<div class="am-u-sm-4">
			<input id="username" class="am-form-field am-input-sm" 
			 name="user.username" type="text" value="">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">年龄：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.age" type="text" value="">
		</div>
		<label class="am-u-sm-2 am-form-label">密码：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.pwd" type="password" value="">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">性别：</label>
		<div class="am-u-sm-4">
			<label class="am-radio-inline">
				<input type="radio" value="男" name="user.gender" checked="checked">&nbsp;男
			</label>
			<label class="am-radio-inline">
				<input type="radio" value="女" name="user.gender">&nbsp;女
			</label>
		</div>
		<label class="am-u-sm-2 am-form-label">民族：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.nation" type="text"  value="">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">学历：</label>
		<div class="am-u-sm-4">
			<select class="am-input-sm" name="user.education">
	    		<option value="本科">本科</option>
	    		<option value="中专">中专</option>
	    	</select>
		</div>
		<label class="am-u-sm-2 am-form-label">婚姻：</label>
		<div class="am-u-sm-4">
			<select class="am-input-sm" name="user.marriage">
	    		<option value="未婚">未婚</option>
	    		<option value="已婚">已婚</option>
	    	</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">部门：</label>
		<div class="am-u-sm-4">
			<select class="am-input-sm" name="user.dept">
	    		<c:forEach items="${depts}" var="e" varStatus="s">
	    			<option value="${e.name}">${e.name}</option>
	    		</c:forEach>
	    	</select>
		</div>
		<label class="am-u-sm-2 am-form-label">角色：</label>
		<div class="am-u-sm-4">
			<select class="am-input-sm" name="user.role">
	    		<c:forEach items="${roles}" var="e" varStatus="s">
	    			<option value="${e.name}">${e.name}</option>
	    		</c:forEach>
	    	</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">座机：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.tel" type="text">
		</div>
		<label class="am-u-sm-2 am-form-label">爱好：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.hobby" type="text">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">工资卡：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.salaryIdcard" type="text">
		</div>
		<label class="am-u-sm-2 am-form-label">手机：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.phone" type="text">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">身份证：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.idcard" type="text">
		</div>
		<label class="am-u-sm-2 am-form-label">地址：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.address" type="text">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">添加人：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.builder" type="text">
		</div>
		<label class="am-u-sm-2 am-form-label">Email：</label>
		<div class="am-u-sm-4">
			<input class="am-form-field am-input-sm" name="user.email" type="email">
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-offset-2 am-u-sm-4">
			<button id="add" type="button" class="am-btn am-btn-primary">添加</button>
			<button type="reset" class="am-btn am-btn-default">重置</button>
			<button type="button" class="am-btn am-btn-default">返回</button>
		</div>
	</div>
</form>