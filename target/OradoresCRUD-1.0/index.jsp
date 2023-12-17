<%-- 
    Document   : index
    Created on : dic 14, 2023, 1:24:23 p.m.
    Author     : Tomas
--%>
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
        <%@include file="navbar.jsp" %>	
        <!-- NEW ORATOR FORM -->
        <%@include file="newOrator.jsp" %>
        <!-- CRUD TABLE -->
        <%@include file="oratorsTable.jsp" %>
        <!-- FOOTER -->
        <%@include file="footer.jsp" %>
        <!-- JS IMPORT -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
    </body>
</html>

