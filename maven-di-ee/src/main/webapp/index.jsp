<%--
//<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
//<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
//<%@ page import = "org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag" %>
//<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
//<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
--%>
<html>
<body>
<h2>Agent Manager</h2>
<%--
    <br/>
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "java:/datasources/manager"
         user = "root"  password = "1234"/>

         <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from Agents;
         </sql:query>
         
         
              <table border = "1" width = "100%">
         <tr>
            <th>Emp ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.agentCode}"/></td>
               <td> <c:out value = "${row.agentCode}"/></td>
               <td> <c:out value = "${row.agentCode}}"/></td>
               <td> <c:out value = "${row.agentCode}"/></td>
            </tr>
         </c:forEach>
      </table>
--%>
    <h3>Save</h3>
    <form action="saveAgent" method="POST">
        <input type="text" name="agentName" placeholder="ISBN" /><br />
      
        <input type="submit" value="Save" />
    </form>
    <h3>Get</h3>
    <form action="get" method="POST">
        <input type="number" name="id" placeholder="BookID" /><br />
        <input type="submit" value="Get" />
    </form>
    <h3>Add Agente</h3>
    <form action="/AddAgent" method="POST">
        <input type="number" name="agentCode" placeholder="AgentCode" /><br />
        <input type="text" name="agentName" placeholder="agentName" /><br />
        <input type="number" name="commission" placeholder="commision" /><br />
        <input type="text" name="phoneNo" placeholder="phone" /><br />

        <input type="text" name="workingAre" placeholder="working Area" /><br />
        <input type="submit" value="Update" />




    </form>
    <h3>Delete</h3>
    <form action="delete" method="POST">
        <input type="number" name="agentCode" placeholder="ID" /><br />
        <input type="submit" value="Delete" />
    </form>
</body>
</html>