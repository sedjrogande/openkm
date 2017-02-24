<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.openkm.servlet.admin.BaseServlet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.io.File"%>
<%@ page import="com.openkm.core.Config"%>
<%@ page import="com.openkm.bean.Repository"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="Shortcut icon" href="favicon.ico" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="../js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="../js/vanadium-min.js" type="text/javascript"></script>
<title>Logs</title>
</head>
<body>
	<c:set var="isAdmin"><%=BaseServlet.isAdmin(request)%></c:set>
	<c:choose>
		<c:when test="${isAdmin}">
			<ul id="breadcrumb">
				<li class="path"><a href="ccm_log.jsp">Log</a></li>
				<li class="path"><c:choose>
						<c:when test="${action == 'view'}">Les fichiers de log</c:when>
						<c:when test="${action == 'edit'}">Edit</c:when>
						<c:when test="${action == 'delete'}">Delete</c:when>
					</c:choose></li>
			</ul>
			<br />

			<input type="hidden" name="log_id" value="${name}" />
			<table class="results" width="80%">
				<thead>
					<tr>
						<th>Name</th>
					</tr>
				</thead>
				<tbody>
					<%
						//String user_path = "tkarambe";
								String user_path = (String) request.getParameter("log_id");
								File log_directory = null;
								String log_path = Config.LOGS_DIR;
								String log_file_path = log_path + File.separator
										+ user_path;
								log_directory = new File(log_file_path);
								String filePath;
								File[] listFiles = log_directory.listFiles();
								for (int i = 0; i < listFiles.length; i++) {
									filePath = "/" + Repository.ROOT;
									File file = listFiles[i];
									String fileName = file.getName();
									//Pattern pattern = Pattern.compile("txt");
									//Matcher matcher = pattern.matcher(fileName);
									if (fileName.endsWith(".txt")) {
					%>
					<tr class='<% if(i % 2 == 0){ %> even <% }else{%> odd <% } %>'>
						<td><a href="../admin/log/<%=user_path %>/<%= fileName%>"><img src="../admin/img/action/rtf.png" > <%=fileName %></a></td>
					</tr>
					<%
						}
								}
					%>
				</tbody>
			</table>
		</c:when>
		<c:otherwise>
			<div class="error">
				<h3>Only admin users allowed</h3>
			</div>
		</c:otherwise>
	</c:choose>
</body>
</html>