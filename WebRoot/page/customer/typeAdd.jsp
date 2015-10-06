<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">客户类型添加</strong>&nbsp;/&nbsp;<small>客户类型</small>&nbsp;/&nbsp;<small>客户相关</small>
<hr/>
<script type="text/javascript">

</script>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			客户类型名称：
		</label>
		<div class="am-u-sm-10">
			<input type="text" name="type.type" id="type">
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary" onclick="javascript:haha('${pageContext.request.contextPath}/page/customer/typeAdd.do');">
				提交
			</button>
			<button type="button" class="am-btn am-btn-default" onclick="javascript:link('${pageContext.request.contextPath}/page/customer/typeList.do');">
				返回
			</button>
		</div>
	</div>
</form>