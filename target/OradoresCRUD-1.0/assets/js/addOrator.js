/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
function updateModalContent() {
    // Get form values
    var addName = document.getElementById("addName").value;
    var addLastname = document.getElementById("addLastname").value;
    var addEmail = document.getElementById("addEmail").value;
    var addTopic = document.getElementById("addTopic").value;
    // Update modal content
    const modalContent = document.getElementById("modalContent");
    modalContent.innerHTML = "Name: " + addName + "<br>Lastname: " + addLastname + "<br>Email: " + addEmail + "<br>Topic: " + addTopic;
    console.log("Se ingreso al modal y se recibieron los datos del nuevo Orador")
}
function submitNewOratorForm() {
    // Submit the form when the OK button is clicked
    document.getElementById("addOratorForm").submit();
    console.log("Se confirmo el submit de los datos del nuevo Orador")
}

