<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">客户来源添加</strong>&nbsp;/&nbsp;<small>客户来源</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			客户来源名称：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="source.source">
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary"  onclick="javascript:haha('${pageContext.request.contextPath}/page/customer/sourceAdd.do');">
				提交
			</button>
			<button type="button" class="am-btn am-btn-default" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/sourceList.do');">
				返回
			</button>
		</div>
	</div>
</form>