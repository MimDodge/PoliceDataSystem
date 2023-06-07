<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Policía</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="CSS/redadas.css" rel="stylesheet">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container">
			<a class="navbar-brand" href="#"> <img
				src="https://ingearq.com.co/wp-content/uploads/2020/01/logo-policia-nacional.png"
				alt="Logo">Policía
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item"><a class="nav-link" href="index.jsp">INICIO</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="policias.jsp">POLICIAS</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="redadas.jsp">REDADAS</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-12">
				<h2>Agregar Redada</h2>
				<form>
					<div class="mb-3">
						<label for="nombreRedada">Nombre:</label> <input type="text"
							id="nombreRedada" name="nombreRedada" class="form-control">
					</div>
					<div class="mb-3">
						<label for="fechaRedada">Fecha de la redada:</label> <input
							type="date" id="fechaRedada" name="fechaRedada"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="horaInicio">Hora de inicio:</label> <input type="time"
							id="horaInicio" name="horaInicio" class="form-control">
					</div>
					<div class="mb-3">
						<label for="horaFin">Hora de finalización:</label> <input
							type="time" id="horaFin" name="horaFin" class="form-control">
					</div>
					<div class="mb-3">
						<label for="capturados">Capturados:</label> <input type="number"
							id="capturados" name="capturados" class="form-control">
					</div>
					<div class="mb-3">
						<label for="nombreDroga">Nombre de la droga:</label> <input
							type="text" id="nombreDroga" name="nombreDroga"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="pesoDroga">Peso de la droga:</label> <input
							type="number" step="0.01" id="pesoDroga" name="pesoDroga"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="numPaquetes">Número de paquetes:</label> <input
							type="number" id="numPaquetes" name="numPaquetes"
							class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="agregarRedada()">Agregar</button>
				</form>
			</div>
		</div>

		<div class="row mt-4">
			<div class="col-md-6">
				<h2>Eliminar Redada por Nombre</h2>
				<form>
					<div class="mb-3">
						<label for="nombreEliminarRedada">Nombre:</label> <input
							type="text" id="nombreEliminarRedada" name="nombreEliminarRedada"
							class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="eliminarRedadaPorNombre()">Eliminar por Nombre</button>
				</form>
			</div>
			<div class="col-md-6">
				<h2>Eliminar Redada por ID</h2>
				<form>
					<div class="mb-3">
						<label for="idEliminarRedada">ID:</label> <input type="text"
							id="idEliminarRedada" name="idEliminarRedada"
							class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="eliminarRedadaPorId()">Eliminar por ID</button>
				</form>
			</div>
		</div>

		<div class="row mt-4">
			<div class="col-md-12">
				<h2>Actualizar Redada</h2>
				<form>
					<div class="mb-3">
						<label for="idActualizarRedada">ID:</label> <input type="text"
							id="idActualizarRedada" name="idActualizarRedada"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="nombreActualizarRedada">Nombre:</label> <input
							type="text" id="nombreActualizarRedada"
							name="nombreActualizarRedada" class="form-control">
					</div>
					<div class="mb-3">
						<label for="fechaRedadaActualizar">Fecha de la redada:</label> <input
							type="date" id="fechaRedadaActualizar"
							name="fechaRedadaActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="horaInicioActualizar">Hora de inicio:</label> <input
							type="time" id="horaInicioActualizar" name="horaInicioActualizar"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="horaFinActualizar">Hora de finalización:</label> <input
							type="time" id="horaFinActualizar" name="horaFinActualizar"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="capturadosActualizar">Capturados:</label> <input
							type="number" id="capturadosActualizar"
							name="capturadosActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="nombreDrogaActualizar">Nombre de la droga:</label> <input
							type="text" id="nombreDrogaActualizar"
							name="nombreDrogaActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="pesoDrogaActualizar">Peso de la droga:</label> <input
							type="number" step="0.01" id="pesoDrogaActualizar"
							name="pesoDrogaActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="numPaquetesActualizar">Número de paquetes:</label> <input
							type="number" id="numPaquetesActualizar"
							name="numPaquetesActualizar" class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="actualizarRedadaPorId()">Actualizar por ID</button>
				</form>
			</div>
		</div>

		<div class="row mt-4">
			<div class="col-md-4">
				<h2>Mostrar Redada por ID</h2>
				<form>
					<div class="mb-3">
						<label for="idMostrarRedada">ID:</label> <input type="text"
							id="idMostrarRedada" name="idMostrarRedada" class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="buscarRedadaPorId()">Buscar por ID</button>
				</form>
			</div>
			<div class="col-md-4">
				<h2>Mostrar Redada por Nombre</h2>
				<form>
					<div class="mb-3">
						<label for="nombreMostrarRedada">Nombre:</label> <input
							type="text" id="nombreMostrarRedada" name="nombreMostrarRedada"
							class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="buscarRedadaPorNombre()">Buscar por Nombre</button>
				</form>
			</div>
			<div class="col-md-4">
				<h2>Mostrar Todas las Redadas</h2>
				<form>
					<button type="button" class="btn btn-primary"
						onclick="mostrarTodosLasRedadas()">Mostrar Todos</button>
				</form>
			</div>
		</div>
	</div>

	<footer class="footer mt-4">
		<div class="container text-center">
			<p>Pagina realizada con motivos educativos desde la Universidad
				El Bosque</p>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>