<%@page import="java.util.*,java.text.*" %>
<%@page import="com.tarena.crm.entity.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">房屋信息</strong>&nbsp;/&nbsp;<small>基础相关</small>
<hr/>
<form class="am-form am-form-inline" role="form">
	<div class="am-form-group am-u-sm-4">
		<input type="text" class="am-form-field am-input-sm" placeholder="请输入关键字" id="keyword">
	</div>
	<div class="am-form-group am-form-select am-u-sm-2">
	    <select class="am-input-sm" id="classify">
	    	<option value="type">房屋类型</option>
	    	<option value="manager">管理员</option>
	    </select>
  	</div>
  	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/basis/queryHouseList.do?classify='+$('#classify').val()+'&keyword='+$('#keyword').val());">
		<i class="am-icon-search"></i>
		搜索
	</a>
	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/basis/loadAddHouse.do');">
		<i class="am-icon-plus"></i>
		添加
	</a>
</form>
<br/>
<div class="am-scrollable-horizontal">
	<table class="am-table am-table-compact am-table-striped am-table-hover am-text-nowrap">
		<thead>
			<tr>
				<th>序号</th>
				<th>户型</th>
				<th>管理员工</th>
				<th>房屋地址</th>
				<th>房屋价格（平米）</th>
				<th>房屋环境</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${houseList }" var="house" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${house.type }</td>
					<td>${house.manager }</td>
					<td>${house.address }</td>
					<td>${house.price }</td>
					<td>${house.environment }</td>
					<td>
						<a href="javascript:link('${pageContext.request.contextPath}/page/basis/houseEdit.do?id=${house.id }');">编辑</a>
						<a href="javascript:link('${pageContext.request.contextPath}/page/basis/deleteHouse.do?id=${house.id }');">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<ul class="am-pagination am-pagination-right">
	<li class="am-disabled"><a href="#">&laquo;</a></li>
	<li class="am-active"><a href="#">1</a></li>
	<li><a href="#">2</a></li>
	<li><a href="#">3</a></li>
	<li><a href="#">4</a></li>
	<li><a href="#">5</a></li>
	<li><a href="#">&raquo;</a></li>
</ul>