package pl.pja.tpc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trace {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="source_city")
	private String sourceCity;
	
	@Column(name="source_street")
	private String sourceStreet;

	@Column(name="source_street_number")
	private String sourceStreetNumber;

	@Column(name="destination_city")
	private String destinationCity;

	@Column(name="destination_street")
	private String destinationStreet;

	@Column(name="destination_street_number")
	private String destinationStreetNumber;
	

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getSourceStreet() {
		return sourceStreet;
	}

	public void setSourceStreet(String sourceStreet) {
		this.sourceStreet = sourceStreet;
	}

	public String getSourceStreetNumber() {
		return sourceStreetNumber;
	}

	public void setSourceStreetNumber(String sourceStreetNumber) {
		this.sourceStreetNumber = sourceStreetNumber;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getDestinationStreet() {
		return destinationStreet;
	}

	public void setDestinationStreet(String destinationStreet) {
		this.destinationStreet = destinationStreet;
	}

	public String getDestinationStreetNumber() {
		return destinationStreetNumber;
	}

	public void setDestinationStreetNumber(String destinationStreetNumber) {
		this.destinationStreetNumber = destinationStreetNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}