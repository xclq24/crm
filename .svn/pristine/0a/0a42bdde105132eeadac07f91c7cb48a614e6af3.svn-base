<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<strong class="am-text-primary am-text-lg">客户关怀</strong>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-inline" role="form">
	<div class="am-form-group am-u-sm-4">
		<input type="text" class="am-form-field am-input-sm" placeholder="请输入关键字" name="name" id="name">
	</div>
	<div class="am-form-group am-form-select am-u-sm-2">
	    <select class="am-input-sm">
	    	<option value="option1">关怀客户</option>
	    </select>
  	</div>
  	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/customer/careSearch.do?name='+$('#name').val());">
		<i class="am-icon-search"></i>
		搜索
	</a>
	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/customer/careAdd1.do');">
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
				<th>客户</th>
				<th>关怀主题</th>
				<th>关怀方式</th>
				<th>关怀时间</th>
				<th>下次关怀时间</th>
				<th>备注</th>
				<th>关怀人</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${cares }" varStatus="s">
			<tr>
				<td>${s.count }</td>
				<td>${item.object }</td>
				<td>${item.theme }</td>
				<td>${item.way }</td>
				<td><fmt:formatDate type="date" value="${item.time }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
				<td><fmt:formatDate type="date" value="${item.next }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
				<td>${item.note }</td>
				<td>${item.people }</td>
				<td>
					<a href="javascript:link('${pageContext.request.contextPath}/page/customer/careEdit1.do?id=${item.id }');">编辑</a>
					<a href="javascript:link('${pageContext.request.contextPath}/page/customer/careDel.do?id=${item.id }');">删除</a>
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