package constractor;

public class MainAddress {

	public static void main(String[] args) {

		
	Address address = new Address("8213 CC","2A","Woodhaven",11421);
	
	System.out.println(address.getStreetName()+","+address.getUnit()+","+address.getCounty()+"'"+address.getZipCode());
	
	
	}

}
