<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="/WEB-INF/jsp/template/header.jsp" %>

<c:choose>
	<c:when test="${mode == 'MODE_HOME' }">
		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>Test Task Management!</h1>
			<h2>By using spring boot with bootstrap and MySQL DB!</h2>
			<p class="lead">Cras justo odio, dapibus ac facilisis in, egestas
				eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris
				condimentum nibh, ut fermentum massa justo sit amet.</p>
			<p>
				<a class="btn btn-lg btn-success" href="alltaskslist" role="button">View
					all datas</a>
			</p>
		</div>

		<!-- Example row of columns -->
		<div class="row"></div>
	</c:when>
	<c:when test="${mode == 'MODE_TASKS' }">
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<h2>List all task data...</h2>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<table class="table table-hover table-striped table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Description</th>
							<th>Date Created</th>
							<th>Finished</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${testTasks}" var="testTask">
							<tr>
								<td>${testTask.id }</td>
								<td>${testTask.name }</td>
								<td>${testTask.description }</td>
								<td><fmt:formatDate pattern="dd-MM-yyyy HH:mm:ss" value="${testTask.dateCreated }"/></td>
								<td>${testTask.finished }</td>
								<td class="text-center">
									<a href="updatetask?id=${testTask.id}"><span class="glyphicon glyphicon-pencil"></span></a>&nbsp;
									<a href="deletetask?id=${testTask.id}"><span class="glyphicon glyphicon-trash"></span></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</c:when>
	<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE' }">
		<div class="container text-center">
			<h3>Test Task Management</h3>
			<hr>
			<form action="savetask" method="post" class="form-horizontal">
				<input type="hidden" name="id" value="${testTask.id}" />
				<div class="form-group">
					<label class="control-label col-md-3">Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="name" value="${testTasks.name}" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3">Description</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="description" value="${testTasks.description}" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3">Finished</label>
					<div class="col-md-7">
						<input type="radio" class="col-sm-1" name="finished" value="true" />
						<div class="col-sm-1">Yes</div>
						<input type="radio" class="col-sm-1" name="finished" value="false" checked />
						<div class="col-sm-1">No</div>
					</div>
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Save" />
				</div>
			</form>
		</div>
	</c:when>
</c:choose>

<%@include file="/WEB-INF/jsp/template/footer.jsp" %>