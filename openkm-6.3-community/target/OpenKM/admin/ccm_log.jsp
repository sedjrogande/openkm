<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.openkm.servlet.admin.BaseServlet" %>
<%@ page import="java.io.File" %>
<%@ page import="com.openkm.core.Config" %>
<%@ page import="com.openkm.bean.Repository" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <link rel="Shortcut icon" href="favicon.ico" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <link rel="stylesheet" type="text/css" href="css/fixedTableHeader.css" />
  <script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
  <script type="text/javascript" src="js/fixedTableHeader.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
    	TABLE.fixHeader('table');
	});
  </script>
  <title>Log</title>
</head>
<body>
  <c:set var="isAdmin"><%=BaseServlet.isAdmin(request)%></c:set>
  <c:choose>
    <c:when test="${isAdmin}">
      <ul id="breadcrumb">
        <li class="path">
          <a href="ccm_log.jsp">Log</a>
        </li>
      </ul>
      <br/>
      <table class="results" width="80%">
        <thead>
          <tr>
            <th>Name</th>
          </tr>
        </thead>
        <tbody>
        <%
        File log_directory = null;
        String log_path = Config.LOGS_DIR;
        log_directory = new File(log_path);
        String filePath;
        File[] listDirectories = log_directory.listFiles();
		for (int i = 0; i < listDirectories.length; i++) { 
			filePath = "/" + Repository.ROOT;
			File directory = listDirectories[i];
			if (directory.isDirectory()) {
				String name = directory.getName();%>
			<c:url value="/log/view" var="urlIcon">
            </c:url>
			 <c:url value="ccm_log.jsp" var="urlView">
             <c:param name="action" value="view"/>
             <c:param name="log_id" value="<%= name %>"/>
           </c:url>
			  <tr class='<% if(i % 2 == 0){ %> even <% }else{%> odd <% } %>'><td>  <a href="logView.jsp?log_id=<%= name %>"> <img src="../img/folder.png" > <%= name %> </a></td></tr>
		 <%	}
		}
		%>
        </tbody>
      </table>
    </c:when>
    <c:otherwise>
      <div class="error"><h3>Only admin users allowed</h3></div>
    </c:otherwise>
  </c:choose>
</body>
</html>