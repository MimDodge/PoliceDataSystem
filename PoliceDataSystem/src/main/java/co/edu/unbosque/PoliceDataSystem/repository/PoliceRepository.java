package co.edu.unbosque.PoliceDataSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.PoliceDataSystem.model.PoliceDTO;

public interface PoliceRepository extends CrudRepository<PoliceDTO, Integer> {

	public void deleteByName(String name);

	public Optional<PoliceDTO> findById(Integer id);

	public Optional<List<PoliceDTO>> findByName(String name);

	public List<PoliceDTO> findAll();

}
