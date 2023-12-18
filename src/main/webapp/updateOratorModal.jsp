<%-- 
    Document   : updateOratorModal
    Created on : dic 17, 2023, 11:06:32 p.m.
    Author     : Tomas
--%>

<!-- MODAL UPDATE ORATOR -->
<div class="modal fade" id="updateOratorModal" tabindex="-1" role="dialog" aria-labelledby="updateOratorModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header bg-dark text-white text-center">
                <h5 class="modal-title" id="updateOratorModalLabel">Editar Orador</h5>
            </div>
            <div class="modal-body">
                <!-- Form for updating orator details -->
                <form id="updateOratorForm" action="${pageContext.request.contextPath}/UpdateOratorController" method="post">
                    <div class="form-group">
                        <label for="staticId">Id:</label>
                        <input type="text" class="form-control" id="staticId" name="staticId" readonly required>
                    </div>
                    <div class="form-group">
                        <label for="inputFirstname">First Name:</label>
                        <input type="text" class="form-control" id="inputFirstname" name="inputFirstname" required>
                    </div>
                    <div class="form-group">
                        <label for="inputLastname">Last Name:</label>
                        <input type="text" class="form-control" id="inputLastname" name="inputLastname" required>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail">Email:</label>
                        <input type="email" class="form-control" id="inputEmail" name="inputEmail" required>
                    </div>
                    <div class="form-group">
                        <label for="inputTopic">Topic:</label>
                        <input type="text" class="form-control" id="inputTopic" name="inputTopic" required>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>               
                <button type="button" class="btn btn-primary" onclick="updateOrator()">Confirm</button>
            </div>
        </div>
    </div>
</div>


