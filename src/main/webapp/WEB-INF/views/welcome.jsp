<%--
  Created by IntelliJ IDEA.
  User: nickk
  Date: 5/8/2017
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Welcome Fam</title>
</head>
<body>
<div align="center">
<h2> Please enter your shit! </h2>
<form:form method="POST" action="/route">
    <table>
    <tr>
    <td><form:label path="currentLoc">From : </form:label></td>
    <td><form:input path="currentLoc"/></td>
    </tr>
    <tr>
    <td><form:label path="destinationLoc">To : </form:label></td>
    <td><form:input path="destinationLoc"/></td>
    </tr>
    <tr>
    <td colspan="2">

    <input type="submit" value="Submit" align="center"/>
    </td>
    </tr>
    </table>
</form:form>

    </div>
</body>
</html>
