<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="com.tarena.crm.entity.*"%>
<%@page import="java.util.*,java.text.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
	<head>
		<jsp:include page="common/head.jsp"></jsp:include>
	</head>
	<body>
		<jsp:include page="common/header.jsp"></jsp:include>
		<div class="am-cf admin-main">
			<jsp:include page="common/sidebar.jsp"></jsp:include>
			<!-- content start -->
			<div id="crm-main" class="admin-content am-padding">
				<div class="am-panel am-panel-default">
					<div class="am-panel-hd">关怀提醒</div>
					<div class="am-panel-bd">
						<div class="am-g">
							<select data-am-selected="{btnSize: 'sm'}">
						    	<option value="option1">当天</option>
						    	<option value="option2">一周内</option>
								<option value="option3">半月内</option>
								<option value="option3">一月内</option>
					    	</select>
					    	<a class="am-btn am-btn-warning am-btn-sm" href="#">
								<i class="am-icon-search"></i>
								搜索
							</a>
						</div>
					    <div class="am-scrollable-horizontal">
					    	<table class="am-table am-table-compact am-table-striped am-table-hover am-text-nowrap">
								<thead>
									<tr>
										<th>关怀主题</th>
										<th>关怀时间</th>
										<th>关怀对象</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${futureCareList==null }">
										<tr>
											<td colspan="3">没有要关怀的对象！</td>
										</tr>
									</c:if>
									<c:forEach items="${futureCareList}" var="care" varStatus="status">
										<tr>
											<td>${care.theme }</td>
											<td><fmt:formatDate value="${care.next}" type="date" pattern="yyyy-MM-dd"></fmt:formatDate></td>
											<td>${care.object }</td>
										</tr>
									</c:forEach>
    							</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="am-panel am-panel-default">
					<div class="am-panel-hd">联系提醒</div>
					<div class="am-panel-bd">
						<div class="am-g">
							<select data-am-selected="{btnSize: 'sm'}">
						    	<option value="option1">当天</option>
						    	<option value="option2">一周内</option>
								<option value="option3">半月内</option>
								<option value="option3">一月内</option>
					    	</select>
					    	<a class="am-btn am-btn-warning am-btn-sm" href="#">
								<i class="am-icon-search"></i>
								搜索
							</a>
						</div>
					    <div class="am-scrollable-horizontal">
						    <table class="am-table am-table-compact am-table-striped am-table-hover am-text-nowrap">
								<thead>
									<tr>
										<th>联系主题</th>
										<th>联系方式</th>
										<th>应联系时间</th>
										<th>联系对象</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${futureRecordList==null}">
										<tr>
											<td colspan="4">没有要联系的对象！</td>
										</tr>
									</c:if>
									<c:forEach items="${futureRecordList}" var="record" varStatus="status">
									<tr>
										<td>${record.theme }</td>
										<td>1597556699</td>
										<td><fmt:formatDate value="${record.next}" type="date" pattern="yyyy-MM-dd"></fmt:formatDate></td>
										<td>${record.name }</td>
									</tr>
									</c:forEach>
	    						</tbody>
							</table>
					    </div>
					</div>
				</div>
				<div class="am-panel am-panel-default">
					<div class="am-panel-hd">有效公告</div>
					<div class="am-panel-bd">
				    	<div class="am-scrollable-horizontal">
					    	<table class="am-table am-table-compact am-table-striped am-table-hover am-text-nowrap">
								<thead>
									<tr>
										<th>公告主题</th>
										<th>公告内容</th>
										<th>截止时间</th>
										<th>公告人</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${validNoticeList==null }">
										<tr>
											<td colspan="4">没有有效的公告！</td>
										</tr>
									</c:if>
									<c:forEach items="${validNoticeList}" var="notice">
										<tr>
											<td>${notice.theme }</td>
											<td>${notice.message }</td>
											<td><fmt:formatDate value="${notice.deadline }" type="date" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate></td>
											<td>${notice.name }</td>
										</tr>
									</c:forEach>
    							</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="am-panel am-panel-default">
					<div class="am-panel-hd">生日提醒</div>
					<div class="am-panel-bd">
						<div class="am-g">
							<select data-am-selected="{btnSize: 'sm'}">
						    	<option value="option1">当天</option>
						    	<option value="option2">一周内</option>
								<option value="option3">半月内</option>
								<option value="option3">一月内</option>
					    	</select>
					    	<a class="am-btn am-btn-warning am-btn-sm" href="#">
								<i class="am-icon-search"></i>
								结账
							</a>
						</div>
					    <div class="am-scrollable-horizontal">
						    <table class="am-table am-table-compact am-table-striped am-table-hover am-text-nowrap">
								<thead>
									<tr>
										<th>过生的人</th>
										<th>生日时间</th>
										<th>手机号码</th>
										<th>客户状态</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${birthdayCustomerList==null}">
										<tr>
											<td colspan="4">没有要过生日的人！</td>
										</tr>
									</c:if>
									<c:forEach items="${birthdayCustomerList}" var="customer">
										<tr>
											<td>${customer.name }</td>
											<td><fmt:formatDate value="${customer.birthday }" type="date" pattern="yyyy-MM-dd"></fmt:formatDate></td>
											<td>${customer.phone }</td>
											<td>${customer.state }</td>
										</tr>
									</c:forEach>
    							</tbody>
							</table>
						</div>
					</div>
				</div>
			<!-- content end -->
			</div>
		</div>
		<jsp:include page="common/footer.jsp"></jsp:include>
		<jsp:include page="common/js.jsp"></jsp:include>
	</body>
</html>