/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

/* FRONTEND FUNCTIONS TO CREATE A NEW ORATOR
 * openNewOratorModal
 * submitAddOratorForm
 */
function openNewOratorModal() {
    // Get form values
    var addFirstname = document.getElementById("addFirstname").value;
    var addLastname = document.getElementById("addLastname").value;
    var addEmail = document.getElementById("addEmail").value;
    var addTopic = document.getElementById("addTopic").value;
    // Update modal content
    const modalContent = document.getElementById("modalContent");
    modalContent.innerHTML = "Nombre: " + addFirstname + "<br>Apellido: " + addLastname + "<br>Email: " + addEmail + "<br>Tema: " + addTopic;
    console.log("Se ingreso al modal y se recibieron los datos del nuevo Orador");
}

function submitAddOratorForm() {
    // Submit the form
    document.getElementById("addOratorForm").submit();
}

/* FRONTEND FUNCTIONS TO EDIT AN EXISTING ORATOR
 * openUpdateOratorModal
 * updateOrator
 */
function openUpdateOratorModal(staticId, inputFirstname, inputLastname, inputEmail, inputTopic) {

    console.log('ID:', staticId);
    console.log('First Name:', inputFirstname);
    console.log('Last Name:', inputLastname);
    console.log('Email:', inputEmail);
    console.log('Topic:', inputTopic);
    // Set the initial values of modal fields
    document.getElementById('staticId').value = staticId;
    document.getElementById('inputFirstname').value = inputFirstname;
    document.getElementById('inputLastname').value = inputLastname;
    document.getElementById('inputEmail').value = inputEmail;
    document.getElementById('inputTopic').value = inputTopic;

    // Show the modal
    var modal = new bootstrap.Modal(document.getElementById('updateOratorModal'));
    modal.show();
}

function updateOrator() {
    // Submit the form
    console.log("Updating orator...");
    document.getElementById('updateOratorForm').submit();
}

function closeUpdateOratorModal() {
    var modal = new bootstrap.Modal(document.getElementById('updateOratorModal'));
    modal.hide();
}

/* FRONTEND FUNCTIONS TO DELETE AN ORATOR
 * openDeleteOratorModal
 * deleteOrator
 * closeDeleteOratorModal
 */

function openDeleteOratorModal(id) {

    console.log('ID: ', id);

    // Get the modal element
    var deleteOratorModal = document.getElementById('deleteOratorModal');

    // Set the orator ID in the form input
    var deleteOratorId = document.getElementById('deleteOratorId');
    deleteOratorId.value = id;

    console.log('value > ', deleteOratorId.value)

    // Show the confirmation modal
    var modal = new bootstrap.Modal(deleteOratorModal);
    modal.show();
}

function deleteOrator() {
    // Directly use the ID to trigger the servlet or perform any action
    // Submit the form when the "Eliminar" button is clicked
    var deleteOratorForm = document.getElementById('deleteOratorForm');
    deleteOratorForm.submit();
    // Close the modal if needed
    closeDeleteOratorModal();
}

function closeDeleteOratorModal() {
    var modal2 = new bootstrap.Modal(document.getElementById('deleteOratorModal'));
    modal2.hide();
}
