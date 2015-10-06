<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<strong class="am-text-primary am-text-lg">联系人编辑</strong>
&nbsp;/&nbsp;
<small>联系人</small>
&nbsp;/&nbsp;
<small>客户相关</small>
<hr />
<form class="am-form am-form-horizontal">
	<input type="hidden" name="contact.id" value="${contact.id }" />
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 关联客户： </label>
		<div class="am-u-sm-10">
			<select name="contact.customer">
				<c:forEach var="item" items="${customers }">
					<option <c:if test="${care.object == item.name }"> selected="seleted"</c:if> value="${item.name }">
						${item.name }
					</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 联系人名称： </label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.name" disabled="disabled" value="${contact.name }">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 联系人性别： </label>
		<div class="am-u-sm-10">
			<label class="am-radio-inline"> <input type="radio"
				name="contact.gender" value="男"
				<c:if test="${contact.gender == '男' }">checked="checked"</c:if>>&nbsp;男
			</label> <label class="am-radio-inline"> <input type="radio"
				name="contact.gender" value="女"
				<c:if test="${contact.gender == '女' }">checked="checked"</c:if>>&nbsp;女
			</label>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 联系人年龄： </label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.age" value="${contact.age }">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 联系人职位： </label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.position" value="${contact.position }">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 联系人手机： </label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.phone" value="${contact.phone }">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label"> 与客户关系： </label>
		<div class="am-u-sm-10">
			<input type="text" name="contact.relation" value="${contact.relation }">
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<input type="button" value="添加" class="am-btn am-btn-primary" onclicl="javascript:haha('${pageContext.request.contextPath}/page/customer/contactEdit2.do');"/>
			<button type="reset" class="am-btn am-btn-default">重置</button>
			<input type="button" value="返回" class="am-btn am-btn-default"
				onclick="javascript:link('${pageContext.request.contextPath}/page/customer/contactList.do');" />
		</div>
	</div>
</form>