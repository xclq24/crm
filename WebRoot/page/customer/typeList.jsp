<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<strong class="am-text-primary am-text-lg">客户类型</strong>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-inline" role="form">
	<div class="am-form-group am-u-sm-4">
		<input type="text" class="am-form-field am-input-sm" placeholder="请输入客户类型关键字" id="type" name="type">
	</div>
  	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/customer/typeSearch.do?type='+$('#type').val());">
		<i class="am-icon-search"></i>
		搜索
	</a>
	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/customer/typeAdd.jsp');">
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
				<th>客户类型</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="item" items="${types }" varStatus="s">
			<tr>
				<td>${s.count+page.everyPage*(page.currentPage-1) }</td>
				<td>${item.type }</td>
				<td><a href="javascript:link('${pageContext.request.contextPath}/page/customer/typeDel.do?id=${item.id}');">删除</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
<ul class="am-pagination am-pagination-right">
	<li class="am-disabled"><a href="#">&laquo;</a></li>
	<li class="am-active"><a href="javascript:link('${pageContext.request.contextPath}/page/customer/typeList.do?currentPage=${page.currentPage }');">${page.currentPage }</a></li>
	<li><a href="javascript:link('${pageContext.request.contextPath}/page/customer/typeList.do?currentPage=${page.currentPage +1}');">${page.currentPage +1}</a></li>
	<li><a href="javascript:link('${pageContext.request.contextPath}/page/customer/typeList.do?currentPage=${page.currentPage +2}');">${page.currentPage +2}</a></li>
	<li><a href="javascript:link('${pageContext.request.contextPath}/page/customer/typeList.do?currentPage=${page.currentPage +3}');">${page.currentPage +3}</a></li>
	<li><a href="javascript:link('${pageContext.request.contextPath}/page/customer/typeList.do?currentPage=${page.currentPage +4}');">${page.currentPage +4}</a></li>
	<li><a href="#">&raquo;</a></li>
</ul>