<%--
  Created by IntelliJ IDEA.
  User: echushkin
  Date: 11/10/16
  Time: 8:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Information Tab</h2>
  <form:form method="POST" action="/HelloWeb/login">
    <table>
      <tr>
        <td><form:label path="email">Email:</form:label></td>
        <td><form:input path="email" /></td>
      </tr>
      <tr>
        <td><form:label path="password">Password:</form:label></td>
        <td><form:input path="password" /></td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" value="Login"/>
        </td>
      </tr>
    </table>
  </form:form>

  </body>
</html>
