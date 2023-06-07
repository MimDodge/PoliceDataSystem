package co.edu.unbosque.PoliceDataSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.PoliceDataSystem.model.RaidDTO;

public interface RaidRepository extends CrudRepository<RaidDTO, Integer> {

	public void deleteByName(String name);

	public Optional<RaidDTO> findById(Integer id);

	public Optional<List<RaidDTO>> findByName(String name);

	public List<RaidDTO> findAll();

}
