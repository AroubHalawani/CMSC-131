package sysutilities;

public class Address{
	
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String street, String city, String state, String zip ) throws IllegalArgumentException
	 { 
		if (street.equals(null) || city.equals(null)|| state.equals(null) || zip.equals(null))			
		       {
		           throw new IllegalArgumentException("Invalid Address Argument");
		       }		       
		       else
		       {		           	           
		           for (int characters = 0; characters < zip.length(); characters++)
		           {
		               if (!Character.isDigit(zip.charAt(characters)))
		               {
		                   throw new IllegalArgumentException("Invalid Address Argument");
		               }
		           }		           		           
		           this.street = street;
		           this.city = city;
		           this.state = state;
		           this.zip = zip;
		       }
	}
	public Address()
	{
		this.street="8223 Paint Branch Dr.";
		this.city="College Park";
		this.state="MD";
		this.zip="20742";
	}	
	public Address( Address address)
	{
		this.street = address.street;
		this.city = address.city;
	    this.state = address.state;
	    this.zip = address.zip;
	}	
	public Address(String street)
	{
		this.street=street;
		this.city="College Park";
		this.state="MD";
		this.zip="20742";
	}	
	public String getStreet()
	{
		return street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getZipCode()
	{
		return zip;
	}
	
	public boolean equals(Address address)
	{
		boolean answer;
		
		if(street.equals(address.getStreet())&&city.equals(address.getCity())&&state.equals(address.getState())&&zip.equals(address.getZipCode()))
		{
			answer=true;
		}
		else
		{
			answer=false;
		}
		return answer;
	}
	
	public String toString()
	{
		String answer;
		
		answer= this.street+" "+this.city+" "+this.state+" "+this.zip;
		
		return answer;
	}			
}

