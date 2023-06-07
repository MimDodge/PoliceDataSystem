function agregarPolicia() {
	var nombre = document.getElementById("nombre").value;
	var edad = parseInt(document.getElementById("edad").value);
	var fechaInicio = document.getElementById("fechaInicio").value;
	var cargo = document.getElementById("cargo").value;
	var numRedadas = parseInt(document.getElementById("numRedadas").value);

	var url = "/system/police/add";
	var data = {
		name: nombre,
		age: edad,
		start: fechaInicio,
		charge: cargo,
		num_raid: numRedadas
	};

	fetch(url, {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify(data)
	})
		.then(function(response) {
			if (response.ok) {
				return response.text();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(responseText) {
			console.log("Response: " + responseText);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function eliminarPoliciaPorNombre() {
	var name = document.getElementById("nombreEliminar").value;

	var url = "/system/police/deleteByName/" + name;

	fetch(url, {
		method: "DELETE"
	})
		.then(function(response) {
			if (response.ok) {
				return response.text();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(responseText) {
			console.log("Response: " + responseText);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function eliminarPoliciaPorId() {
	var id = document.getElementById("idEliminar").value;

	var url = "/system/police/deleteById/" + id;

	fetch(url, {
		method: "DELETE"
	})
		.then(function(response) {
			if (response.ok) {
				return response.text();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(responseText) {
			console.log("Response: " + responseText);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function actualizarPoliciaPorId() {
	var id = document.getElementById("idActualizar").value;
	var nombre = document.getElementById("nombreActualizar").value;
	var edad = document.getElementById("edadActualizar").value;
	var fechaInicio = document.getElementById("fechaInicioActualizar").value;
	var cargo = document.getElementById("cargoActualizar").value;
	var numRedadas = document.getElementById("numRedadasActualizar").value;

	var url = "/system/police/update/" + id;

	fetch(url, {
		method: "PUT",
		body: JSON.stringify({
			name: nombre,
			age: edad,
			start: fechaInicio,
			charge: cargo,
			num_raid: numRedadas
		}),
		headers: {
			"Content-Type": "application/json"
		}
	})
		.then(function(response) {
			if (response.ok) {
				return response.text();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(responseText) {
			console.log("Response: " + responseText);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function buscarPoliciaPorId() {
	var id = document.getElementById("idMostrar").value;

	var url = "/system/police/searchById/" + id;

	fetch(url)
		.then(function(response) {
			if (response.ok) {
				return response.json();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(data) {
			console.log("Data: ", data);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function buscarPoliciaPorNombre() {
	var name = document.getElementById("nombreMostrar").value;

	var url = "/system/police/searchByName/" + name;

	fetch(url)
		.then(function(response) {
			if (response.ok) {
				return response.json();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(data) {
			console.log("Data: ", data);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}

function mostrarTodosLosPolicias() {
	var url = "/system/police/search";

	fetch(url)
		.then(function(response) {
			if (response.ok) {
				return response.json();
			}
			throw new Error("Error: " + response.status);
		})
		.then(function(data) {
			console.log("Data: ", data);
		})
		.catch(function(error) {
			console.log("Error: " + error.message);
		});
}