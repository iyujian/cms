<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
	<title>用户管理</title>
</head>
<body>
	<div class="table-responsive">
		<table class="table table-striped table-bordered table-hover table-condensed">
			<thead>
				<tr>
					<th>#</th>
					<th>用户名</th>
					<th>邮箱</th>
					<th>电话</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users }" varStatus="status">
				<tr>
					<td>${status.index + 1 }</td>
					<td>${user.username }</td>
					<td>${user.email }</td>
					<td>${user.phone }</td>
					<td>
						<button type="button" class="btn btn-info btn-xs">编辑</button>
						<button type="button" class="btn btn-danger btn-xs">删除</button>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3">
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">添加</button>
			</div>
			<div class="col-md-9">
				<nav class="text-right">
					<ul class="pagination pagination-sm">
						<li><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">添加用户</h4>
	      </div>
	      <div class="modal-body">
	        ...
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
</body>
</html>