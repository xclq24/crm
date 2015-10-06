<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<strong class="am-text-primary am-text-lg">客户关怀编辑</strong>&nbsp;/&nbsp;<small>客户关怀</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<input type="hidden" name="care.id" value="${care.id }" />
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀主题：
		</label>
		<div class="am-u-sm-10">
			<input type="text" value="${care.theme }" name="care.theme">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀对象：
		</label>
		<div class="am-u-sm-10">
			<select name="care.object">
				<c:forEach var="item" items="${customers }">
					<option <c:if test="${care.object == item.name }"> selected="seleted"</c:if> value="${item.name }">
						${item.name }
					</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀时间：
		</label>
		<div class="am-u-sm-10">
			<input type="text" disabled="disabled" name="care.time" value='<fmt:formatDate type="date" value="${care.time }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>' />
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			下次关怀时间：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.next" value="<fmt:formatDate type="date" value="${care.next }" pattern="yyyy-MM-dd"></fmt:formatDate> ">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀方式：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.way" value="${care.way }">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀人：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.people" value="${care.people }">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀备注：
		</label>
		<div class="am-u-sm-10">
			<textarea rows="8" name="care.note">${care.note }</textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary" onclick="javacript:haha('${pageContext.request.contextPath}/page/customer/careEdit2.do');">
				添加
			</button>
			<input type="reset" value="重置" class="am-btn am-btn-default">
			<input type="button" value="返回" class="am-btn am-btn-default" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/careList.do');">
		</div>
	</div>
</form>