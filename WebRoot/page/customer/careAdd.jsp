<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="resource/js/Calendar6.js" type="text/javascript"></script>
<strong class="am-text-primary am-text-lg">客户关怀添加</strong>&nbsp;/&nbsp;<small>客户关怀</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀主题：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.theme">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀对象：
		</label>
		<div class="am-u-sm-10">
			<select name="care.object">
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
			关怀时间：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.time"  onclick="SelectDate(this,'yyyy-MM-dd hh:mm:ss')"/>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			下次关怀时间：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.next" onclick="SelectDate(this,'yyyy-MM-dd')">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀方式：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.way">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀人：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="care.people">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			关怀备注：
		</label>
		<div class="am-u-sm-10">
			<textarea rows="8" name="care.note"></textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary" onclick="javacript:haha('${pageContext.request.contextPath}/page/customer/careAdd2.do');">
				添加
			</button>
			<button type="reset" class="am-btn am-btn-default">
				重置
			</button>
			<button type="submit" class="am-btn am-btn-default" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/careList.do');">
				返回
			</button>
		</div>
	</div>
</form>