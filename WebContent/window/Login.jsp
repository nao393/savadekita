<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/header.jsp" %>
<body>
<div class="login-container">
	<h2>ログイン</h2>
	<form action="../index.jsp" method="post">
		<label for="id">ID:</label>
		<input type="text" name="id" id="id"><br>
		<label for="password">Password:</label>
		<input type="password" name="password" id="password"><br>
		<input type="submit" value="ログイン">
	</form>
</div>
</body>
<%@ include file="/footer.jsp" %>>
