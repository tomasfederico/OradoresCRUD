<%-- 
    Document   : oratorsTable
    Created on : dic 16, 2023, 1:02:55 a.m.
    Author     : Tomas
--%>

<%@page import="java.util.List"%>
<%@page import="com.cac.pojo.Orator"%>
<%@include file="updateOratorModal.jsp"%>
<%@include file="deleteOratorModal.jsp"%>
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

                int pageSize = 10; // Number of items per page
                int currentPage = (request.getParameter("currentPage") != null) ? Integer.parseInt(request.getParameter("currentPage")) : 1;
                int startIdx = (currentPage - 1) * pageSize; // Start index 
                int endIdx = Math.min(startIdx + pageSize, orators.size()); // End index

                List<Orator> displayedOrators = orators.subList(startIdx, endIdx);

            %>
            <tbody>
                <%                    //for (Orator orator : orators) {
                    for (Orator orator : displayedOrators) {
                %>
                <tr>
                    <td><%=orator.getId()%></td>
                    <td><%=orator.getFirstName()%></td>
                    <td><%=orator.getLastname()%></td>
                    <td><%=orator.getEmail()%></td>
                    <td><%=orator.getTopic()%></td>
                    <td>
                        <button type="button" class="btn btn-warning btn-sm" onclick="openUpdateOratorModal('<%=orator.getId()%>', '<%=orator.getFirstName()%>', '<%=orator.getLastname()%>', '<%=orator.getEmail()%>', '<%=orator.getTopic()%>')">
                            Editar
                        </button>

                        <button type="button" class="btn btn-danger btn-sm" onclick="openDeleteOratorModal('<%=orator.getId()%>')">
                            Eliminar
                        </button>
                    </td>
                </tr>
                <%
                    } // FINISH LOOP TO CREATE TABLE
                %>
            </tbody>
            <!-- Bootstrap 5.2.3 Pagination Links -->
        </table>
        <!-- Bootstrap 5.2.3 Pagination Links -->
        <nav aria-label="Page navigation">
            <ul class="pagination justify-content-center">
                <%
                    int totalPages = (int) Math.ceil((double) orators.size() / pageSize);
                    for (int i = 1; i <= totalPages; i++) {
                %>
                <li class="page-item <%= (i == currentPage) ? "active" : ""%>">
                    <a class="page-link" href="?currentPage=<%= i%>&pageSize=<%= pageSize%>"><%= i%></a>
                </li>
                <%
                    }
                %>
            </ul>
        </nav>
    </div>
</div>
</section>
