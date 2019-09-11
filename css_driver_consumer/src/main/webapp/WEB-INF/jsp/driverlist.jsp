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
</head>
<script type="text/javascript">
function add() {
	location.href="/toadd"
}
function update(id) {
	location.href="/toupdate?id="+id;
}

</script>
<body>
<input type="button" value="添加" onclick="add()">
<form action="list" method="post">
司机姓名:<input type="text" name="name" value="${name }">
<button>查寻</button>
</form>
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">驾驶证号码</th>
      <th scope="col">司机姓名</th>
      <th scope="col">性别</th>
      <th scope="col">省</th>
      <th scope="col">市</th>
      <th scope="col">区</th>
      <th scope="col">发证日期</th>
      <th scope="col">操作</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${pageInfo.list}" var="s">
      <tr>
      <th scope="row">${s.num }</th>
      <td>${s.name }</td>
      <td>${s.sex }</td>
      <td>${s.shengName }</td>
      <td>${s.shiName }</td>
      <td>${s.quName }</td>
      <td>${s.createDate }</td>
      <td>
        <input type="button" value="修改" onclick="update(${s.id})">
        <input type="button" value="删除" onclick="del(${s.id})">
      
      </td>
     
    </tr>
   
   </c:forEach>
     <tr>
      <td colspan="10">
        
       <nav aria-label="...">
  <ul class="pagination">
  
     <li class="page-item">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=1">首页</a>
    </li>
  
  
    <li class="page-item">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=${page-1>0?page-1:1}">上一页</a>
    </li>
   
    <li class="page-item">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=${page+1>pageInfo.pages?pageInfo.pages:page+1}">下一页</a>
    </li>
    
     <li class="page-item">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=${pageInfo.pages}">尾页</a>
    </li>
  </ul>
</nav>
      
      </td>
    </tr>
    
    </tbody>
    </table>
    
    
    

</body>
</html>