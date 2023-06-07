package co.edu.unbosque.PoliceDataSystem.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.PoliceDataSystem.model.PoliceDTO;
import co.edu.unbosque.PoliceDataSystem.model.RaidDTO;
import co.edu.unbosque.PoliceDataSystem.repository.PoliceRepository;
import co.edu.unbosque.PoliceDataSystem.repository.RaidRepository;
import jakarta.transaction.Transactional;

@Transactional
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/johnpolice")
public class DataSystemController {

	@Autowired
	private PoliceRepository policeresp;

	@Autowired
	private RaidRepository raidsresp;

	@PostMapping("/system/police/add")
	public ResponseEntity<String> addPolice(@RequestParam String name, @RequestParam int age, @RequestParam Date start,
			@RequestParam String charge, @RequestParam int num_raid) {

		PoliceDTO temp = new PoliceDTO();
		temp.setName(name);
		temp.setAge(age);
		temp.setStart(start);
		temp.setCharge(charge);
		temp.setNum_raid(num_raid);
		policeresp.save(temp);
		return ResponseEntity.status(HttpStatus.CREATED).body("Dato Creado con exito 201");

	}

	@GetMapping("/system/police/search")
	public ResponseEntity<List<PoliceDTO>> searchAllPolice() {

		List<PoliceDTO> list = policeresp.findAll();
		if (list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(list);

	}

	@GetMapping("/system/police/searchById/{id}")
	public ResponseEntity<Optional<PoliceDTO>> searchByIDPolice(@RequestParam Integer id) {
		Optional<PoliceDTO> dato = policeresp.findById(id);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(dato);
	}

	@GetMapping("/system/police/searchByName/{name}")
	public ResponseEntity<Optional<List<PoliceDTO>>> searchByNamePolice(@RequestParam String name) {
		Optional<List<PoliceDTO>> dato = policeresp.findByName(name);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(dato);
	}

	@PutMapping("/system/police/update/{id}")
	public ResponseEntity<String> updateByIDPolice(@RequestParam Integer id, @RequestParam String name,
			@RequestParam int age, @RequestParam Date start, @RequestParam String charge, @RequestParam int num_raid) {
		Optional<PoliceDTO> dato = policeresp.findById(id);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dato no encontrado");
		}
		PoliceDTO temp = dato.get();
		temp.setName(name);
		temp.setAge(age);
		temp.setStart(start);
		temp.setCharge(charge);
		temp.setNum_raid(num_raid);
		policeresp.save(temp);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Actualizado con exito");

	}

	@DeleteMapping("/system/police/deleteById/{id}")
	public ResponseEntity<String> deleteByIDPolice(@RequestParam Integer id) {
		Optional<PoliceDTO> dato = policeresp.findById(id);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se ha podido eliminar la ID deseada");
		}
		policeresp.deleteById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Se ha podido elimianr la ID deseada");
	}

	@DeleteMapping("/system/police/deleteByName/{name}")
	public ResponseEntity<String> deleteByNamePolice(@RequestParam String name) {
		Optional<List<PoliceDTO>> dato = policeresp.findByName(name);
		List<PoliceDTO> temp = dato.get();

		if (temp.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}

		policeresp.deleteByName(name);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Eliminado con exito");
	}

	@PostMapping("/system/raid/add")
	public ResponseEntity<String> add(@RequestParam String name, @RequestParam Date operative,
			@RequestParam String op_start, @RequestParam String op_finish, @RequestParam int captures,
			@RequestParam String namedrugs, @RequestParam Double weightdrugs, @RequestParam int amounthdrugs) {

		RaidDTO temp = new RaidDTO();
		temp.setName(name);
		temp.setOperative(operative);
		temp.setOp_start(op_start);
		temp.setOp_finish(op_finish);
		temp.setCaptures(captures);
		temp.setNamedrugs(namedrugs);
		temp.setWeightdrugs(weightdrugs);
		temp.setAmounthdrugs(amounthdrugs);
		raidsresp.save(temp);
		return ResponseEntity.status(HttpStatus.CREATED).body("Dato Creado con éxito 201");
	}

	@GetMapping("/system/raid/search")
	public ResponseEntity<List<RaidDTO>> searchAll() {

		List<RaidDTO> list = raidsresp.findAll();
		if (list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(list);

	}

	@GetMapping("/system/raid/searchByID/{id}")
	public ResponseEntity<Optional<RaidDTO>> searchByID(@RequestParam Integer id) {
		Optional<RaidDTO> dato = raidsresp.findById(id);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(dato);
	}

	@GetMapping("/system/raid/searchByName/{name}")
	public ResponseEntity<Optional<List<RaidDTO>>> searchByName(@RequestParam String name) {
		Optional<List<RaidDTO>> dato = raidsresp.findByName(name);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(dato);
	}

	@PutMapping("/system/raid/update/{id}")
	public ResponseEntity<String> updateByID(@RequestParam Integer id, @RequestParam String name,
			@RequestParam Date operative, @RequestParam String op_start, @RequestParam String op_finish,
			@RequestParam int captures, @RequestParam String namedrugs, @RequestParam Double weightdrugs,
			@RequestParam int amounthdrugs) {
		Optional<RaidDTO> dato = raidsresp.findById(id);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dato no encontrado");
		}
		RaidDTO temp = dato.get();
		temp.setName(name);
		temp.setOperative(operative);
		temp.setOp_start(op_start);
		temp.setOp_finish(op_finish);
		temp.setCaptures(captures);
		temp.setNamedrugs(namedrugs);
		temp.setWeightdrugs(weightdrugs);
		temp.setAmounthdrugs(amounthdrugs);
		raidsresp.save(temp);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Actualizado con exito");

	}

	@DeleteMapping("/system/raid/deleteById/{id}")
	public ResponseEntity<String> deleteByID(@RequestParam Integer id) {
		Optional<RaidDTO> dato = raidsresp.findById(id);
		if (dato.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No se ha podido eliminar la ID deseada");
		}
		policeresp.deleteById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Se ha podido elimianr la ID deseada");
	}

	@DeleteMapping("/system/raid/deleteByName/{name}")
	public ResponseEntity<String> deleteByName(@RequestParam String name) {
		Optional<List<RaidDTO>> dato = raidsresp.findByName(name);
		List<RaidDTO> temp = dato.get();

		if (temp.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}

		policeresp.deleteByName(name);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Eliminado con exito");
	}

}
