<%@page import="com.tarena.crm.dao.impl.UserDaoImpl,java.util.*"%>
<%@page import="com.tarena.crm.entity.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" pageEncoding="UTF-8"%>
	
<strong class="am-text-primary am-text-lg">写邮件</strong>&nbsp;/&nbsp;<small>邮件相关</small>
<hr/>
<form action="${pageContext.request.contextPath}/page/email/sendEmail.do" class="am-form am-form-horizontal" method="post">
	<div class="am-form-group">
		<label for="person" class="am-u-sm-2 am-form-label">收件人：</label>
	    <div id="person" class="am-u-sm-10">
	    	<select name="receiver">
	    		<c:if test="${email==null}">
		    		<c:forEach items="${userList}" var="user" varStatus="status">
				        <option value="${user.name}">${user.name}</option>
		    		</c:forEach>
	    		</c:if>
	    		<c:if test="${email!=null}">
	    			<option value="${email.sender}">${email.sender}</option>
	    		</c:if>
      		</select>
	    </div>
	</div>
	<div class="am-form-group">
    	<label for="title" class="am-u-sm-2 am-form-label">邮件主题：</label>
    	<div class="am-u-sm-10">
      		<input type="text" id="title" placeholder="请输入邮件主题" name="theme" value="${email.theme }">
    	</div>
	</div>
	<div class="am-form-group">
    	<label for="context" class="am-u-sm-2 am-form-label">邮件内容：</label>
    	<div class="am-u-sm-10">
    		<textarea rows="10" id="context" name="message" >${email.message }</textarea>
    	</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<c:if test="${email==null}">
	      		<button type="submit" class="am-btn am-btn-primary" onclick="javascript:this.form.action='${pageContext.request.contextPath}/page/email/sendEmail.do';">发送</button>
	      		<button type="submit" class="am-btn am-btn-default" onclick="javascript:this.form.action='${pageContext.request.contextPath}/page/email/saveDraft.do';">存草稿</button>
	      		<button type="reset" class="am-btn am-btn-default">重写</button>
	    	</c:if>
		</div>
  	</div>
</form>