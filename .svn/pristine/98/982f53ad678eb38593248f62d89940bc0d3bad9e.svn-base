<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<strong class="am-text-primary am-text-lg">添加角色</strong>&nbsp;/&nbsp;<small>管理员</small>
<hr/>
<form class="am-form am-form-inline" >
	<div class="am-form-group am-u-sm-4">
		<input type="text" class="am-form-field am-input-sm" name="role.name" id="name" placeholder="请输入角色名称">
	</div>
	<div class="am-form-group am-form-select am-u-sm-2">
	    <select class="am-input-sm" name="role.level" id="level">
	    	<option value="1">一星</option>
	    	<option value="2">二星</option>
	    	<option value="3">三星</option>
	    </select>
  	</div>
  	<a class="am-btn am-btn-warning am-btn-sm" href="javascript:link('${pageContext.request.contextPath}/page/basis/addRole.do?name='+$('#name').val()+'&level='+$('#level').val())">
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
				<th>角色名</th>
				<th>权限等级</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${roles}" var="e" varStatus="s">
			<tr>
				<td>${s.index+1}</td>
				<td>${e.name}</td>
				<td>${e.level}</td>
				<td>
					<a href="javascript:link('${pageContext.request.contextPath}/page/basis/roleDelete.do?id=${e.id}');" onclick="return confirm('确定删除${e.name}吗？');">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
