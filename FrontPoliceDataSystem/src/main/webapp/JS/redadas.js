function agregarRedada() {
	var nombre = document.getElementById("nombreRedada").value;
	var fechaRedada = document.getElementById("fechaRedada").value;
	var horaInicio = document.getElementById("horaInicio").value;
	var horaFin = document.getElementById("horaFin").value;
	var capturados = parseInt(document.getElementById("capturados").value);
	var nombreDroga = document.getElementById("nombreDroga").value;
	var pesoDroga = Number(document.getElementById("pesoDroga").value);
	var numPaquetes = parseInt(document.getElementById("numPaquetes").value);

	var url = "/system/raid/add";

	var data = new FormData();
	data.append("name", nombre);
	data.append("operative", fechaRedada);
	data.append("op_start", horaInicio);
	data.append("op_finish", horaFin);
	data.append("captures", capturados);
	data.append("namedrugs", nombreDroga);
	data.append("weightdrugs", pesoDroga);
	data.append("amounthdrugs", numPaquetes);

	fetch(url, {
		method: "POST",
		body: data
	})
		.then(function(response) {
			if (response.ok) {
				return response.text();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(message) {
			console.log("Message: " + message);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function eliminarRedadaPorNombre() {
	var name = document.getElementById("nombreEliminarRedada").value;

	fetch("/system/raid/deleteByName/" + name, {
		method: "DELETE",
	})
		.then(function(response) {
			if (!response.ok) {
				throw new Error("Error en la solicitud: " + response.status);
			}
			return response.text();
		})
		.then(function(data) {
			alert(data);
		})
		.catch(function(error) {
			console.log(error);
			alert("Se produjo un error al eliminar la redada");
		});
}

function eliminarRedadaPorId() {
	var id = document.getElementById("idEliminarRedada").value;

	fetch("/system/raid/deleteById/" + id, {
		method: "DELETE",
	})
		.then(function(response) {
			if (!response.ok) {
				throw new Error("Error en la solicitud: " + response.status);
			}
			return response.text();
		})
		.then(function(data) {
			alert(data);
		})
		.catch(function(error) {
			console.log(error);
			alert("Se produjo un error al eliminar la redada");
		});
}

function actualizarRedadaPorId() {
	var id = document.getElementById("idActualizarRedada").value;
	var name = document.getElementById("nombreActualizarRedada").value;
	var operative = document.getElementById("fechaRedadaActualizar").value;
	var op_start = document.getElementById("horaInicioActualizar").value;
	var op_finish = document.getElementById("horaFinActualizar").value;
	var captures = document.getElementById("capturadosActualizar").value;
	var namedrugs = document.getElementById("nombreDrogaActualizar").value;
	var weightdrugs = document.getElementById("pesoDrogaActualizar").value;
	var amounthdrugs = document.getElementById("numPaquetesActualizar").value;

	fetch("/system/raid/update/" + id, {
		method: "PUT",
		headers: {
			"Content-Type": "application/x-www-form-urlencoded",
		},
		body: new URLSearchParams({
			name: name,
			operative: operative,
			op_start: op_start,
			op_finish: op_finish,
			captures: captures,
			namedrugs: namedrugs,
			weightdrugs: weightdrugs,
			amounthdrugs: amounthdrugs,
		}),
	})
		.then(function(response) {
			if (!response.ok) {
				throw new Error("Error en la solicitud: " + response.status);
			}
			return response.text();
		})
		.then(function(data) {
			alert(data);
		})
		.catch(function(error) {
			console.log(error);
			alert("Se produjo un error al actualizar la redada");
		});
}

function buscarRedadaPorId() {
	var id = document.getElementById("idMostrarRedada").value;

	fetch("/system/raid/searchByID/" + id)
		.then(function(response) {
			if (!response.ok) {
				throw new Error("Error en la solicitud: " + response.status);
			}
			return response.json();
		})
		.then(function(data) {
			if (data == null) {
				alert("No se encontró ninguna redada con el ID especificado");
			} else {
				alert("Redada encontrada:\n" + JSON.stringify(data));
			}
		})
		.catch(function(error) {
			console.log(error);
			alert("Se produjo un error al buscar la redada por ID");
		});
}

function buscarRedadaPorNombre() {
	var name = document.getElementById("nombreMostrarRedada").value;

	fetch("/system/raid/searchByName/" + name)
		.then(function(response) {
			if (!response.ok) {
				throw new Error("Error en la solicitud: " + response.status);
			}
			return response.json();
		})
		.then(function(data) {
			if (data == null) {
				alert("No se encontró ninguna redada con el nombre especificado");
			} else {
				alert("Redadas encontradas:\n" + JSON.stringify(data));
			}
		})
		.catch(function(error) {
			console.log(error);
			alert("Se produjo un error al buscar la redada por nombre");
		});
}

function mostrarTodosLasRedadas() {
	fetch("/system/raid/search")
		.then(function(response) {
			if (!response.ok) {
				throw new Error("Error en la solicitud: " + response.status);
			}
			return response.json();
		})
		.then(function(data) {
			if (data == null || data.length === 0) {
				alert("No se encontraron redadas");
			} else {
				alert("Redadas encontradas:\n" + JSON.stringify(data));
			}
		})
		.catch(function(error) {
			console.log(error);
			alert("Se produjo un error al mostrar todas las redadas");
		});
}

