<%@ page language="java" pageEncoding="UTF-8"%>
<script src="resource/js/Calendar6.js" type="text/javascript"></script>
<strong class="am-text-primary am-text-lg">公告添加</strong>&nbsp;/&nbsp;<small>公告</small>&nbsp;/&nbsp;<small>基础相关</small>
<hr/>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			公告主题：
		</label>
		<div class="am-u-sm-10">
			<input type="text" placeholder="输入公告标题" id="theme">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			截止日期：
		</label>
		<div class="am-u-sm-10">
			<input type="text" id="deadline" onclick="SelectDate(this,'yyyy-MM-dd,hh:mm:ss')">
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			公告内容：
		</label>
		<div class="am-u-sm-10">
			<textarea rows="8" id="message"></textarea>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" class="am-btn am-btn-primary" onclick="javascript:link('${pageContext.request.contextPath}/page/basis/noticeAdd.do?theme='+$('#theme').val()+'&deadline='+$('#deadline').val()+'&message='+$('#message').val());">
				发布
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