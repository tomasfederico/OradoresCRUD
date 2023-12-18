<%-- 
    Document   : newOrator
    Created on : dic 16, 2023, 12:58:27 a.m.
    Author     : Tomas
--%>

<section class="col-9 mx-auto mb-3" id="add-new-orator">
    <div class="text-center">
        <h1>CRUD DE ORADORES</h1>

        <!-- ADD ORATOR CONTAINER -->
        <div class="container border">
            <h2>Agregar un Orador</h2>
            <!-- ADD ORATOR FORM -->
            <form id="addOratorForm" action="${pageContext.request.contextPath}/AddOratorController" method="post" class="mb-3">
                <input type="hidden" name="action" value="create">
                <div class="row">
                    <div class="col">
                        <input type="text" id="addFirstname" name="addFirstname" class="form-control" placeholder="Nombre" required>
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
                        <button type="button" id="addOrator-btn" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#confirmAddOratorModal" onclick="openNewOratorModal()">Agregar Orador</button>
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
                        <p>Seguro/a que deseas agregar un item con esta informacion?</p>
                        <p id="modalContent">modelContent with no changes</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-success" onclick="submitAddOratorForm()">OK</button>
                    </div>
                </div>
            </div>
        </div>
</section>
