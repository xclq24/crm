<%@ page import="java.util.*,java.text.*" %>
<%@ page import="com.tarena.crm.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">房屋信息编辑</strong>&nbsp;/&nbsp;<small>房屋信息</small>&nbsp;/&nbsp;<small>基础相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<input type="hidden" id="id" name="id" value="${house.id }">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋类型：
		</label>
		<div class="am-u-sm-10" >
			<select id="houseType" name="houseType">
				<c:forEach items="${houseTypeList }" var="houseType">
					
					<option value="${houseType.name }" <c:if test="${houseType.name==house.type }">selected</c:if>>${houseType.name }</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋管理者：
		</label>
		<div class="am-u-sm-10">
			<select id="manager" name="manager">
				<c:forEach items="${userList }" var="user">
					<option value="${user.name }"  <c:if test="${user.name==house.manager }">selected</c:if>>${user.name }</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋地址：
		</label>
		<div class="am-u-sm-10">
			<input type="text" value="${house.address }" id="address" name="address">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			价格（每平米）：
		</label>
		<div class="am-u-sm-10">
			<input type="number" value="${house.price }" id="price" name="price">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋环境：
		</label>
		<div class="am-u-sm-10">
			<textarea rows="8" id="environment" name="environment">${house.environment }</textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary"
			onclick="javascript:link('${pageContext.request.contextPath}/page/basis/updateHouse.do?id='+$('#id').val()+'&houseType='+$('#houseType').val()+'&manager='+$('#manager').val()+'&address='+$('#address').val()+'&price='+$('#price').val()+'&environment='+$('#environment').val());">
				确认
			</button>
			<button type="button" class="am-btn am-btn-default">
				返回
			</button>
		</div>
	</div>
</form>