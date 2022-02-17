<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-bordered" id="dataTable" width="100%"
		cellspacing="0">
		<thead>
			<tr>
				<th>아이디</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${member}" var="members">
				<tr>
					<td>${members.m_email }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>