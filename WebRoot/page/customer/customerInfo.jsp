<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<strong class="am-text-primary am-text-lg">客户信息详情</strong>&nbsp;/&nbsp;<small>客户信息</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">负责员工：</label>
		<div class="am-u-sm-4">
			${customer.ename }
		</div>
		<label class="am-u-sm-2 am-form-label">客户来源：</label>
		<div class="am-u-sm-4">
			${customer.source }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">客户姓名：</label>
		<div class="am-u-sm-4">
			${customer.name }
		</div>
		<label class="am-u-sm-2 am-form-label">客户状态：</label>
		<div class="am-u-sm-4">
			${customer.state }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">性别：</label>
		<div class="am-u-sm-4">
			${customer.gender }
		</div>
		<label class="am-u-sm-2 am-form-label">客户类型：</label>
		<div class="am-u-sm-4">
			${customer.type }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">出生日期：</label>
		<div class="am-u-sm-4">
			<fmt:formatDate type="date" value="${customer.birthday }" pattern="yyyy-MM-dd"></fmt:formatDate>
		</div>
		<label class="am-u-sm-2 am-form-label">客户手机：</label>
		<div class="am-u-sm-4">
			${customer.phone }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">客户QQ：</label>
		<div class="am-u-sm-4">
			${customer.qq }
		</div>
		<label class="am-u-sm-2 am-form-label">客户地址：</label>
		<div class="am-u-sm-4">
			${customer.addr }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">客户邮箱：</label>
		<div class="am-u-sm-4">
			${customer.email }
		</div>
		<label class="am-u-sm-2 am-form-label">客户职位：</label>
		<div class="am-u-sm-4">
			${customer.position }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">客户微博：</label>
		<div class="am-u-sm-4">
			${customer.weibo }
		</div>
		<label class="am-u-sm-2 am-form-label">客户座机：</label>
		<div class="am-u-sm-4">
			${customer.tel }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">客户MSN：</label>
		<div class="am-u-sm-4">
			${customer.msn }
		</div>
		<label class="am-u-sm-2 am-form-label">客户公司：</label>
		<div class="am-u-sm-4">
			${customer.company }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">创建人：</label>
		<div class="am-u-sm-4">
			${customer.builder }
		</div>
		<label class="am-u-sm-2 am-form-label">修改人：</label>
		<div class="am-u-sm-4">
			${customer.modifier }
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">创建时间：</label>
		<div class="am-u-sm-4">
			<fmt:formatDate type="date" value="${customer.createtime }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
		</div>
		<label class="am-u-sm-2 am-form-label">修改时间：</label>
		<div class="am-u-sm-4">
			<fmt:formatDate type="date" value="${customer.modifytime }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-offset-2 am-u-sm-4">
			<input type="button" class="am-btn am-btn-default" value="编辑" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/customerEdit.do?id=${customer.id }');">
			<input type="button" class="am-btn am-btn-default" value="返回" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/customerList.do');">
		</div>
	</div>
</form>