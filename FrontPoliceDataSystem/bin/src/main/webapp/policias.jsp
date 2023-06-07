<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Policía</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="CSS/policias.css" rel="stylesheet">
<script src="JS/policia.js"></script>
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
				<h2>Agregar Policía</h2>
				<form>
					<div class="mb-3">
						<label for="nombre">Nombre:</label> <input type="text" id="nombre"
							name="nombre" class="form-control">
					</div>
					<div class="mb-3">
						<label for="edad">Edad:</label> <input type="text" id="edad"
							name="edad" class="form-control">
					</div>
					<div class="mb-3">
						<label for="fechaInicio">Fecha de inicio en la
							institución:</label> <input type="text" id="fechaInicio"
							name="fechaInicio" class="form-control">
					</div>
					<div class="mb-3">
						<label for="cargo">Cargo:</label> <input type="text" id="cargo"
							name="cargo" class="form-control">
					</div>
					<div class="mb-3">
						<label for="numRedadas">Número de redadas:</label> <input
							type="text" id="numRedadas" name="numRedadas"
							class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="agregarPolicia()">Agregar</button>
				</form>
			</div>
		</div>

		<div class="row mt-4">
			<div class="col-md-6">
				<h2>Eliminar Policía por Nombre</h2>
				<form>
					<div class="mb-3">
						<label for="nombreEliminar">Nombre:</label> <input type="text"
							id="nombreEliminar" name="nombreEliminar" class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="eliminarPoliciaPorNombre()">Eliminar por Nombre</button>
				</form>
			</div>
			<div class="col-md-6">
				<h2>Eliminar Policía por ID</h2>
				<form>
					<div class="mb-3">
						<label for="idEliminar">ID:</label> <input type="text"
							id="idEliminar" name="idEliminar" class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="eliminarPoliciaPorId()">Eliminar por ID</button>
				</form>
			</div>
		</div>

		<div class="row mt-4">
			<div class="col-md-12">
				<h2>Actualizar Información del Policía</h2>
				<form>
					<div class="mb-3">
						<label for="idActualizar">ID:</label> <input type="text"
							id="idActualizar" name="idActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="nombreActualizar">Nombre:</label> <input type="text"
							id="nombreActualizar" name="nombreActualizar"
							class="form-control">
					</div>
					<div class="mb-3">
						<label for="edadActualizar">Edad:</label> <input type="text"
							id="edadActualizar" name="edadActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="fechaInicioActualizar">Fecha de inicio en la
							institución:</label> <input type="text" id="fechaInicioActualizar"
							name="fechaInicioActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="cargoActualizar">Cargo:</label> <input type="text"
							id="cargoActualizar" name="cargoActualizar" class="form-control">
					</div>
					<div class="mb-3">
						<label for="numRedadasActualizar">Número de redadas:</label> <input
							type="text" id="numRedadasActualizar" name="numRedadasActualizar"
							class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="actualizarPoliciaPorId()">Actualizar por ID</button>
				</form>
			</div>
		</div>

		<div class="row mt-4">
			<div class="col-md-4">
				<h2>Mostrar Policía por ID</h2>
				<form>
					<div class="mb-3">
						<label for="idMostrar">ID:</label> <input type="text"
							id="idMostrar" name="idMostrar" class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="buscarPoliciaPorId()">Buscar por ID</button>
				</form>
			</div>
			<div class="col-md-4">
				<h2>Mostrar Policía por Nombre</h2>
				<form>
					<div class="mb-3">
						<label for="nombreMostrar">Nombre:</label> <input type="text"
							id="nombreMostrar" name="nombreMostrar" class="form-control">
					</div>
					<button type="button" class="btn btn-primary"
						onclick="buscarPoliciaPorNombre()">Buscar por Nombre</button>
				</form>
			</div>
			<div class="col-md-4">
				<h2>Mostrar Todos los Policías</h2>
				<button type="button" class="btn btn-primary"
					onclick="mostrarTodosLosPolicias()">Mostrar Todos</button>
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