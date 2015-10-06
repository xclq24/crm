<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="resource/js/Calendar6.js" type="text/javascript"></script>
<strong class="am-text-primary am-text-lg">联系记录添加</strong>&nbsp;/&nbsp;<small>联系记录</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			客户名称：
		</label>
		<div class="am-u-sm-10">
			<select name="record.name">
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
			联系类型：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="record.type">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			本次联系时间：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="time" onclick="SelectDate(this,'yyyy-MM-dd')">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			下次联系时间：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="next" onclick="SelectDate(this,'yyyy-MM-dd')">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			是谁联系的：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="record.contacter">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系主题：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="record.theme">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			联系备注：
		</label>
		<div class="am-u-sm-10">
			<textarea rows="8" name="record.note"></textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary"  onclick="javascript:haha('${pageContext.request.contextPath}/page/customer/recordAdd2.do');">
				添加
			</button>
			<button type="reset" class="am-btn am-btn-default">
				重置
			</button>
			<button type="button" class="am-btn am-btn-default" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/recordList.do');" >
				返回
			</button>
		</div>
	</div>
</form>