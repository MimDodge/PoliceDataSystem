package co.edu.unbosque.PoliceDataSystem.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PoliceDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private int age;
	private Date start;
	private String charge;
	private int num_raid;

	public PoliceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PoliceDTO(Integer id, String name, int age, Date start, String charge, int num_raid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.start = start;
		this.charge = charge;
		this.num_raid = num_raid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public int getNum_raid() {
		return num_raid;
	}

	public void setNum_raid(int num_raid) {
		this.num_raid = num_raid;
	}

}