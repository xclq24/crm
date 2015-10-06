<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<strong class="am-text-primary am-text-lg">联系人添加</strong>&nbsp;/&nbsp;<small>联系人</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关联客户：
		</label>
		<div class="am-u-sm-10">
			<select name="contact.customer">
				<c:forEach var="item" items="${customers }">
					<option value="${item.name }">
						${item.name }
					</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系人名称：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.name">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系人性别：
		</label>
		<div class="am-u-sm-10">
			<label class="am-radio-inline">
				<input type="radio" name="contact.gender" checked="checked" value="男">&nbsp;男
			</label>
			<label class="am-radio-inline">
				<input type="radio" name="contact.gender" value="女">&nbsp;女
			</label>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系人年龄：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.age">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系人职位：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.position">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系人手机：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.phone">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			与客户关系：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.relation">
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary" onclick="javascript:haha('${pageContext.request.contextPath}/page/customer/contactAdd2.do');">
				添加
			</button>
			<button type="reset" class="am-btn am-btn-default">
				重置
			</button>
			<button type="button" class="am-btn am-btn-default" 
			onclick="javascript:link('${pageContext.request.contextPath}/page/customer/contactList.do');">
				返回
			</button>
		</div>
	</div>
</form>