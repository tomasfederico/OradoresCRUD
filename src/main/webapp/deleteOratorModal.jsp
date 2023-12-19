<%-- 
    Document   : deleteOratorModal
    Created on : dic 18, 2023, 8:20:28 p.m.
    Author     : Tomas
--%>

<!-- Delete Confirmation Modal -->
<div class="modal fade" id="deleteOratorModal" tabindex="-1" aria-labelledby="deleteOratorModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header bg-dark text-white text-center">
                <h5 class="modal-title" id="deleteOratorModalTitle">Eliminar Orador</h5>
            </div>
            <div class="modal-body">
                Estás seguro/a que deseas eliminar a este orador/a?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary btn-sm" data-bs-dismiss="modal">Cancelar</button>

                <!-- Form to submit the ID to the servlet -->
                <form id="deleteOratorForm" action="<%=request.getContextPath()%>/DeleteOratorController" method="post">
                    <input type="hidden" id="deleteOratorId" name="id" value="" readonly required>
                    <button type="button" id="deleteOratorModalButton" class="btn btn-danger btn-sm" onclick="deleteOrator()">Eliminar</button>
                </form>
            </div>
        </div>
    </div>
</div>

