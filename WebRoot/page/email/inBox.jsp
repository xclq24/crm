<%@page import="com.tarena.crm.dao.impl.EmailDaoImpl"%>
<%@page import="com.tarena.crm.entity.*"%>
<%@page import="java.util.*,java.text.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">收件箱</strong>&nbsp;/&nbsp;<small>邮件相关</small>
<hr/>
<form class="am-form am-form-inline" role="form">
	<div class="am-form-group am-u-sm-4">
		<input type="text" class="am-form-field am-input-sm" placeholder="请输入关键字" id="keyword">
	</div>
	<div class="am-form-group am-form-select am-u-sm-2">
	    <select class="am-input-sm" id="classify">
	    	<option value="sender">发件人</option>
	    	<option value="theme">邮件主题</option>
	    	<option value="message">邮件内容</option>
	    </select>
  	</div>
  	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/email/queryInBox.do?classify='+$('#classify').val()+'&keyword='+$('#keyword').val());">
		<i class="am-icon-search"></i>
		搜索
	</a>
</form>
<br/>
<div class="am-scrollable-horizontal">
	<table class="am-table am-table-compact am-table-striped am-table-hover am-text-nowrap">
		<thead>
			<tr>
				<th>序号</th>
				<th>发件人</th>
				<th>主题</th>
				<th>邮件内容</th>
				<th>时间</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${emailList}" var="email" varStatus="status">
				<tr>
					<td>${status.index+1 }</td>
					<td>${email.sender }</td>
					<td><a href="javascript:link('${pageContext.request.contextPath}/page/email/readEmail.do?id=${email.id}');">${email.theme }</a></td>
					<td>${email.message }</td>
					<td><fmt:formatDate value="${email.time}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
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