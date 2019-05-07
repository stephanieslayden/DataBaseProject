<%@include file="/WEB-INF/jsp/template/header.jsp" %>

<!-- Jumbotron -->
<div class="jumbotron">
<div class="row">
			<div class="col-lg-12 col-md-12">
				<table class="table table-hover table-striped table-bordered">
					<thead>
						<tr>
							<th>Title</th>
							<th>Producer</th>
							<th>Year</th>
							<th>Rating</th>
							<th>Price</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${Movie}" var="Movie">
							<tr>
								<td>${Movie.title}</td>
								<td>${Movie.producer}</td>
								<td>${Movie.year}</td>
								<td>${Movie.rating}</td>
								<td>${Movie.price}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
</div>

<!-- Example row of columns -->
<div class="row">

</div>
<%@include file="/WEB-INF/jsp/template/footer.jsp" %>