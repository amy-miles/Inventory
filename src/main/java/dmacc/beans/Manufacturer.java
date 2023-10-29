package dmacc.beans;


import jakarta.persistence.Embeddable;

/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Oct 28, 2023
 */

//annotation declares that a class is meant to be embedded by other entities

@Embeddable
public class Manufacturer {
	
	private String manName;
	private String street;
	private String city;
	private String state;
	/**
	 * 
	 */
	public Manufacturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param manName
	 * @param street
	 * @param city
	 * @param state
	 */
	public Manufacturer(String manName, String street, String city, String state) {
		super();
		this.manName = manName;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	/**
	 * @return the manName
	 */
	public String getManName() {
		return manName;
	}
	/**
	 * @param manName the manName to set
	 */
	public void setManName(String manName) {
		this.manName = manName;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Manufacturer [manName=" + manName + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
