package constractor;

public class Address {
	
	public String streetName;
	public String unit;
	public String county;
	public int zipCode;
	
	public Address() {}
	public Address(String streetName, String unit, String county, int zipCode) {
		
		this.streetName = streetName;
		this.unit = unit;
		this.county = county;
		this.zipCode = zipCode;
	}
	
	
	
		
	
	
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	

}
