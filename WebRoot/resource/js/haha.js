function haha(url){
	$.ajax({
		'url':url,
		'type':'post',
		data:$('form').serialize(),
		'success':function(url){
			link(url);
		},'error':function(){
			alert("出错");
		}
	});
}