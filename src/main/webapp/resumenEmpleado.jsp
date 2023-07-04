<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Resumen de Registro de Empleado</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
  <h1>Resumen de Registro de Empleado</h1>

  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Datos del Empleado</h5>
      <p class="card-text"><strong>Nombre:</strong> <%= request.getParameter("nombre") %></p>
      <p class="card-text"><strong>Apellido:</strong> <%= request.getParameter("apellido") %></p>
      <p class="card-text"><strong>Correo Electrónico:</strong> <%= request.getParameter("correo") %></p>
    </div>
  </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
