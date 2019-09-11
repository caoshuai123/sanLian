<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/resource/css/bootstrap.css" />

	<script type="text/javascript"
		src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/jquery.validate.js" ></script>
	<script type="text/javascript" src="/resource/js/localization/messages_zh.js"></script>		
</head>
<style>
  .error{
    color:red;
  }
  
</style>

<script type="text/javascript">
$(function() {
	//给省赋值  ---三级联动
    change("sheng","#shengid");
	
})
//三级联动
function change(chg,xiaId) {
	if(chg=='sheng'){
		parentId=0;
	}else{
		parentId=chg.val();
	}
	alert("parentId"+parentId);
	
	$.post(
	    "san",
	    {parentId:parentId},
	    function(address) {
	    	//清空下列
	    	$(xiaId).empty;
	    	
			$(xiaId).append("<option value='0'>请选择</option>")
			
			for ( var i in address) {
				$(xiaId).append("<option value='"+address[i].id+"'>"+address[i].name+"</option>")
			}
		}
			
	)
	
}


function add() {
	var check=$("#form").valid();
	if(!check){
		alert("验证不通过");
		return;
	}else{
		$.post(
				   "add",
				   $("form").serialize(),
				   function(b) {
					  if(b){
						  alert("添加成功");
						  location.href="list";
					  }else{
						  alert("添加失败")
					  }
				   }
				
				)
		
	}
	
	
}
</script>
<body>
<form id="form">
  <div class="form-group row">
    <label for="num" class="col-sm-2 col-form-label">驾驶证号</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="num" name="num" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label">司机姓名</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name" required>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="sex" class="col-sm-2 col-form-label">姓别</label>
    <div class="col-sm-10">
      <input type="radio"  id="sex" name="sex" value="男">男
      <input type="radio"  id="sex" name="sex" value="女">女
    </div>
  </div>
  
  <div class="form-group row">
    <label for="shengid" class="col-sm-2 col-form-label">省</label>
    <div class="col-sm-10">
      <select id="shengid" name="shengid" onchange="change($(this),'#shiid')">
      
      </select>
      
    </div>
  </div>
  
  <div class="form-group row">
    <label for="shiid" class="col-sm-2 col-form-label">市</label>
    <div class="col-sm-10">
      <select id="shiid" name="shiid" onchange="change($(this),'#quid')">
      
      </select>
      
    </div>
  </div>
  
  <div class="form-group row">
    <label for="quid" class="col-sm-2 col-form-label">区</label>
    <div class="col-sm-10">
      <select id="quid" name="quid" >
      
      </select>
      
    </div>
  </div>
  
  
  
  <div class="form-group row">
    <label for="createDate" class="col-sm-2 col-form-label">发证日期</label>
    <div class="col-sm-10">
      <input type="date"  id="createDate" name="createDate">
      
    </div>
  </div>
  
   
   <input type="button" value="添加" onclick="add()">
     
 
  
</form>
</body>
</html>