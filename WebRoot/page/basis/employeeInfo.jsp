<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<strong class="am-text-primary am-text-lg">员工信息详情</strong>&nbsp;/&nbsp;<small>员工信息</small>&nbsp;/&nbsp;<small>基础相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">姓名：</label>
		<div class="am-u-sm-4">
			${user.name}
		</div>
		<label class="am-u-sm-2 am-form-label">年龄：</label>
		<div class="am-u-sm-4">
			${user.age}
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">性别：</label>
		<div class="am-u-sm-4">
			${user.gender}
		</div>
		<label class="am-u-sm-2 am-form-label">民族：</label>
		<div class="am-u-sm-4">
			${user.nation}
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">学历：</label>
		<div class="am-u-sm-4">
			${user.education}
		</div>
		<label class="am-u-sm-2 am-form-label">婚姻：</label>
		<div class="am-u-sm-4">
			${user.marriage}
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">部门：</label>
		<div class="am-u-sm-4">
			${user.dept}
		</div>
		<label class="am-u-sm-2 am-form-label">角色：</label>
		<div class="am-u-sm-4">
			${user.role}
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">座机：</label>
		<div class="am-u-sm-4">
			${user.tel}
		</div>
		<label class="am-u-sm-2 am-form-label">爱好：</label>
		<div class="am-u-sm-4">
			${user.hobby}
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">工资卡号：</label>
		<div class="am-u-sm-4">
			${user.salaryIdcard}
		</div>
		<label class="am-u-sm-2 am-form-label">手机：</label>
		<div class="am-u-sm-4">
			${user.phone}
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">身份证：</label>
		<div class="am-u-sm-4">
			${user.idcard}
		</div>
		<label class="am-u-sm-2 am-form-label">添加时间：</label>
		<div class="am-u-sm-4">
			<fmt:formatDate value="${user.addtime }" type="date" pattern="yyyy-MM-dd hh:mm:ss"/>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">添加人：</label>
		<div class="am-u-sm-4">
			${user.builder}
		</div>
		<label class="am-u-sm-2 am-form-label">修改人：</label>
		<div class="am-u-sm-4">
			<c:if test="${user.modifier}==null">未修改</c:if>
			<c:if test="${user.modifier}!=null">${user.modifier}</c:if>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">邮箱：</label>
		<div class="am-u-sm-4">
			${user.email}
		</div>
		<label for="age" class="am-u-sm-2 am-form-label">修改时间：</label>
		<div class="am-u-sm-4">
			<fmt:formatDate value="${user.modifytime }" type="date" pattern="yyyy-MM-dd hh:mm:ss"/>
		</div>
	</div>
	<div class="am-form-group">
		<label for="age" class="am-u-sm-2 am-form-label">住址：</label>
		<div class="am-u-sm-10">
			${user.address}
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="submit" class="am-btn am-btn-primary">
				确认
			</button>
			<button type="submit" class="am-btn am-btn-default">
				返回
			</button>
		</div>
	</div>
</form>