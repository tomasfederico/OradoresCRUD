<%-- 
    Document   : index
    Created on : dic 14, 2023, 1:24:23 p.m.
    Author     : Tomas
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>TP FINAL CODO A CODO - ORADORES CRUD - TOMAS FEDERICO</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script type="text/javascript" src="assets/js/greetuser.js"></script>
        <script type="text/javascript" src="assets/js/addOrator.js"></script>
    </head>
    <body>
        <!-- NAVBAR -->
        <nav class="navbar navbar-expand-lg bg-dark">
            <div class="container-fluid">
                <div class="d-flex justify-content-end align-items-center">
                    <img src="assets/img/cac_logo.png" width="90em" alt="Logo de Codo a Codo" />
                    <a class="navbar-brand text-white" href="https://buenosaires.gob.ar/educacion/codo-codo-40">Codo a codo 4.0</a>
                </div>

                <div class="d-flex justify-content-center align-items-center flex-grow-1" id="navbartitle">
                    <p class="navbar-brand text-white my-auto ms-auto">CRUD de Oradores</p>
                </div>
            </div>
        </nav>

        <!-- NEW ORATOR FORM -->
        <section class="col-9 mx-auto mb-3" id="add-new-orator">
            <div class="text-center">
                <h1>CRUD DE ORADORES</h1>

                <!-- ADD ORATOR CONTAINER -->
                <div class="container border">
                    <h2>Agregar un Orador</h2>
                    <!-- ADD ORATOR FORM -->
                    <form id="addOratorForm" action="${pageContext.request.contextPath}/orators" method="post" class="mb-3">
                        <input type="hidden" name="action" value="create">
                        <div class="row">
                            <div class="col">
                                <input type="text" id="addName" name="addName" class="form-control" placeholder="Nombre" required>
                            </div>
                            <div class="col">
                                <input type="text" id="addLastname" name="addLastname" class="form-control" placeholder="Apellido" required>
                            </div>
                            <div class="col">
                                <input type="text" id="addEmail" name="addEmail" class="form-control" placeholder="Email" required>
                            </div>
                            <div class="col">
                                <input type="text" id="addTopic" name="addTopic" class="form-control" placeholder="Tema" required>
                            </div>
                            <div class="col">
                                <button type="button" id="addOrator-btn" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#confirmAddOratorModal" onclick="updateModalContent()">Agregar Orador</button>
                            </div>
                        </div>
                    </form>
                </div>

                <!-- Confirmation modal for adding an orator -->
                <div class="modal fade" id="confirmAddOratorModal" tabindex="-1" aria-labelledby="confirmAddOratorModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="confirmAddOratorModalLabel">Confirmation</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure you want to add a new orator with the following details?</p>
                                <p id="modalContent">modelContent with no changes</p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                                <button type="submit" class="btn btn-success" onclick="submitNewOratorForm()">OK</button>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        <!-- CRUD TABLE -->
        <section class="col-9 mx-auto mb-3" id="orator-table">   
            <div class="container my-2 text-center">
                <h2>Tabla de oradores</h2>

                <table class="table text-center">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Lastname</th>
                            <th>Email</th>
                            <th>Topic</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="orator" items="${orators}">
                        <tr>
                            <td>${orator.id}</td>
                            <td>${orator.name}</td>
                            <td>${orator.lastname}</td>
                            <td>${orator.email}</td>
                            <td>${orator.topic}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/orators?action=edit&id=${orator.id}" class="btn btn-warning btn-sm">Edit</a>
                                <a href="${pageContext.request.contextPath}/orators?action=delete&id=${orator.id}" class="btn btn-danger btn-sm">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </section>

    <!-- FOOTER -->
    <footer class="text-white bg-dark">
        <div class="row d-flex justify-content-center mx-auto ">
            <div class="col text-center">CODO A CODO - CRUD de Oradores - 2023</div>
        </div>
    </footer>

    <!-- JS IMPORT -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
    crossorigin="anonymous"></script>
</body>
</html>

