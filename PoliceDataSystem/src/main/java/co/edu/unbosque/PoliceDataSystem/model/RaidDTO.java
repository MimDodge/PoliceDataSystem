package co.edu.unbosque.PoliceDataSystem.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RaidDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Date operative;
	private String op_start;
	private String op_finish;
	private int captures;
	private String namedrugs;
	private Double weightdrugs;
	private int amounthdrugs;

	public RaidDTO() {
		// TODO Auto-generated constructor stub
	}

	public RaidDTO(Integer id, String name, Date operative, String op_start, String op_finish, int captures,
			String namedrugs, Double weightdrugs, int amounthdrugs) {
		super();
		this.id = id;
		this.name = name;
		this.operative = operative;
		this.op_start = op_start;
		this.op_finish = op_finish;
		this.captures = captures;
		this.namedrugs = namedrugs;
		this.weightdrugs = weightdrugs;
		this.amounthdrugs = amounthdrugs;
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

	public Date getOperative() {
		return operative;
	}

	public void setOperative(Date operative) {
		this.operative = operative;
	}

	public String getOp_start() {
		return op_start;
	}

	public void setOp_start(String op_start) {
		this.op_start = op_start;
	}

	public String getOp_finish() {
		return op_finish;
	}

	public void setOp_finish(String op_finish) {
		this.op_finish = op_finish;
	}

	public int getCaptures() {
		return captures;
	}

	public void setCaptures(int captures) {
		this.captures = captures;
	}

	public String getNamedrugs() {
		return namedrugs;
	}

	public void setNamedrugs(String namedrugs) {
		this.namedrugs = namedrugs;
	}

	public Double getWeightdrugs() {
		return weightdrugs;
	}

	public void setWeightdrugs(Double weightdrugs) {
		this.weightdrugs = weightdrugs;
	}

	public int getAmounthdrugs() {
		return amounthdrugs;
	}

	public void setAmounthdrugs(int amounthdrugs) {
		this.amounthdrugs = amounthdrugs;
	}

}
