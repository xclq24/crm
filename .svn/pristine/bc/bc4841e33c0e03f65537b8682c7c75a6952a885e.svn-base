<%@page import="com.tarena.crm.dao.impl.EmailDaoImpl"%>
<%@page import="com.tarena.crm.entity.*"%>
<%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">草稿箱</strong>&nbsp;/&nbsp;<small>邮件相关</small>
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
  	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/email/queryDraftBox.do?classify='+$('#classify').val()+'&keyword='+$('#keyword').val());">
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
				<th>收件人</th>
				<th>主题</th>
				<th>邮件内容</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${emailList}" var="email" varStatus="status">
				<tr>
					<td>${status.index+1 }</td>
					<td>${email.receiver }</td>
					<td>${email.theme }</td>
					<td>${email.message }</td>
					<td>
						<a href="javascript:link('${pageContext.request.contextPath}/page/email/sendDraft.do?id=${email.id }');">发送</a>
						<a href="javascript:link('${pageContext.request.contextPath}/page/email/deleteEmail.do?id=${email.id }');">删除</a>
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