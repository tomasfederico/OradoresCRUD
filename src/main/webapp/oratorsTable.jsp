<%-- 
    Document   : oratorsTable
    Created on : dic 16, 2023, 1:02:55 a.m.
    Author     : Tomas
--%>

<%@page import="java.util.List"%>
<%@page import="com.cac.pojo.Orator"%>

<section class="col-9 mx-auto mb-3" id="orator-table">   
    <div class="container my-2 text-center">
        <h2>Tabla de oradores</h2>

        <table class="table text-center">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Email</th>
                    <th scope="col">Tema</th>
                    <th scope="col">Acciones</th>
                </tr>
            </thead>

            <% // JAVA CODE: REQUEST ORADORES TABLE INFO FROM SQL DATABASE
                List<Orator> orators = (List<Orator>) request.getAttribute("orators");
                System.out.println("hola");
            %>
            <tbody>
                <%
                    for (Orator orator : orators) {
                %>
                <tr>
                    <td><%=orator.getId()%></td>
                    <td><%=orator.getName()%></td>
                    <td><%=orator.getLastname()%></td>
                    <td><%=orator.getEmail()%></td>
                    <td><%=orator.getTopic()%></td>
                    <td>
                        <a class="btn btn-warning btn-sm" href="<%=request.getContextPath()%>/api/UpdateOratorController?id=<%=orator.getId()%>">Edit</a>
                        <a class="btn btn-danger btn-sm" href="<%=request.getContextPath()%>/api/DeleteOratorController?id=<%=orator.getId()%>" >Delete</a>
                    </td>
                </tr>
                <%
                    } // FINISH LOOP TO CREATE TABLE
%>
            </tbody>
        </table>
    </div>
</div>
</section>
