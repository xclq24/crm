<%@ page import="java.util.*,java.text.*"%>
<%@ page import="com.tarena.crm.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">房屋信息添加</strong>&nbsp;/&nbsp;<small>房屋信息</small>&nbsp;/&nbsp;<small>基础相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋类型：
		</label>
		<div class="am-u-sm-10">
			<select id="houseType" name="houseType">
				<c:forEach items="${houseTypeList }" var="houseType">
					<option value="${houseType.name }">${houseType.name }</option>
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
					<option value="${user.name }">${user.name }</option>
				</c:forEach>
			</select>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋地址：
		</label>
		<div class="am-u-sm-10">
			<input type="text" id="address" name="address">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			价格（每平米）：
		</label>
		<div class="am-u-sm-10">
			<input type="text" id="price" name="price">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			房屋环境：
		</label>
		<div class="am-u-sm-10">
			<textarea rows="8" id="environment" name="environment"></textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary"
			onclick="javascript:link('${pageContext.request.contextPath}/page/basis/addHouse.do?houseType='+$('#houseType').val()+'&manager='+$('#manager').val()+'&address='+$('#address').val()+'&price='+$('#price').val()+'&environment='+$('#environment').val());">
				添加
			</button>
			<button type="reset" class="am-btn am-btn-default">
				重置
			</button>
			<button type="button" class="am-btn am-btn-default">
				返回
			</button>
		</div>
	</div>
</form>