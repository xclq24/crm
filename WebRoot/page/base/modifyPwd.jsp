<%@ page language="java" pageEncoding="UTF-8"%>
<strong class="am-text-primary am-text-lg">修改密码</strong>&nbsp;/&nbsp;<small>个人信息</small>
<hr/>
<script>
	$(function(){
		
			$('#modify').click(function(){
				if(f1()+f2()+f3()==3){
					f4();
				}else{
					alert("请填完整");
				}
			});
		
	
		$('#new').blur(f1);
		$('#older').blur(f2);
		$('#again').blur(f3);
		function f1(){
			if($('#new').val().length==0){
				$('#span_new').text('不能为空');
				return false;
			}
			else{
				$('#span_new').text('');
				return true;
			}
		}
		function f2(){
			if($('#older').val().length==0){
				$('#span_older').text('不能为空');
				return false;
			}
			else{
				$('#span_older').text('');
				return true;
			}
		}
		function f3(){
			if($('#again').val().length==0){
				$('#span_again').text('不能为空');
				return false;
			}
			else if($('#again').val()!=$('#new').val()){
				$('#span_again').text('确认密码要与新密码相同');
				return false;
			}else{
				$('#span_again').text('');
				return true;
			}
		}
		function f4(){
			$.ajax({
				'url':'/crm/page/basis/check_Pwd.do?pwd='+$('#older').val()+'&&id=${id}&&new_pwd='+$('#new').val(),
				'type':'get',
				'dataType':'json',
				'success':function(data){
					if(data.length==2){
						alert(data[0]);
						location.href = data[1];
					}else{
						alert(data[0]);
					}
					
				},'error':function(){
				alert("出错");
				return false;
			}
			});
		}
	});
</script>
<form class="am-form am-form-horizontal">
	<div class="am-form-group">
		<input type="hidden" id="user.id" name="user.id" value="${id}">
		<label class="am-u-sm-2 am-form-label" >
			旧密码：
		</label>
		<div class="am-u-sm-10">
			<input type="password" name="older" id="older">
			<span id="span_older"></span>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			新密码：
		</label>
		<div class="am-u-sm-10">
			<input type="password" name="new" id="new">
			<span id="span_new"></span>
		</div>
	</div>
	<div class="am-form-group">
		<label class="am-u-sm-2 am-form-label">
			确认新密码：
		</label>
		<div class="am-u-sm-10">
			<input type="password" name="again" id="again">
			<span id="span_again"></span>
		</div>
	</div>
	<div class="am-form-group">
		<div class="am-u-sm-10 am-u-sm-offset-2">
			<button type="button" id="modify" class="am-btn am-btn-primary">
				修改
			</button>
			<button type="reset" class="am-btn am-btn-default">
				重置
			</button>
		</div>
	</div>
</form>