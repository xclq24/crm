<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">添加部门</strong>&nbsp;/&nbsp;<small>管理员</small>
<hr/>
<form class="am-form am-form-horizontal" method="post" action="${pageContext.request.contextPath}/page/basis/addDept.do">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			部门名称：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="dept.name">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			部门描述：
		</label>
		<div class="am-u-sm-10" >
			<textarea rows="8" name="dept.description"></textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="submit" class="am-btn am-btn-primary">
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