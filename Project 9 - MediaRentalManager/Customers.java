package mediaRentalManager;

import java.util.LinkedList;
import java.util.Queue;

public class Customers implements Comparable<Customers> {

	private String customersName ;
	private String customerAddress;
	private String customerPlan;
	
	private int limit;
	
	
	
	private Queue<String> inter = new LinkedList<String>();
	private Queue<String> rent=new LinkedList<String>();
	
	/**
	 * 
	 * @param customersName The Customer Name
	 * @param customerAddress The Customer Address
	 * @param customerPlan The Customer Plan
	 */

	public Customers(String customersName, String customerAddress, String customerPlan)
	{
		
		
		this.customersName = customersName;
		this.customerAddress = customerAddress;
		this.customerPlan = customerPlan;
		this.limit=this.customerPlan.equals("LIMITED")? 2 :Integer.MAX_VALUE;
		
	}
	/**
	 * 
	 * @param customersName
	 */
	public void setCustomerName(String customersName)
	{
		this.customersName=customersName;
	}
	/**
	 * 
	 * @param customerAddress
	 */
	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress=customerAddress;
	}
	/**
	 * 
	 * @param limit
	 */
	public void setCustomerPlan(int limit)
	{
		this.limit = limit;
	}
	/**
	 * 
	 * @return Customer Name
	 */

	public String getCustomertName()
	{
		return customersName;
	}
	/**
	 * 
	 * @return Customer Address
	 */
	public String getCustomerAddress()
	{
		return customerAddress;
	}

	/**
	 * 
	 * @return Customer Plan
	 */
	public String getCustomerPlan()
	{
		return customerPlan;
	}
	
	/**
	 * 
	 * @return 
	 */

	public boolean Space()
	{
		return this.rent.size() == limit;
	}

	/**
	 * 
	 * @param copy
	 */
	public void addToInter(String copy)
	{
		inter.add(copy);
	}

	/**
	 * 
	 * @param copy
	 * @return
	 */
	public boolean Rented(String copy) {
		
		return rent.add(copy);
		
	}

	/**
	 * 
	 * @param copy
	 */
	public void removeInter(String copy)
	{
		inter.remove(copy);
	}

	/**
	 * 
	 * @param copy
	 */
	public void removeRent(String copy)
	{
		rent.remove(copy);
	}

	/**
	 * 
	 * @return 
	 */
	public Queue<String> getInter()
	{
		return inter;
	}
	/**
	 * 
	 * @return rent
	 */
	public Queue<String> getRented()
	{
		return rent;
	}
	/**
	 * 
	 */
	public boolean equals (Object object)
	{
		
		if (object==null||(!(object instanceof Customers)))
		{
			return false;
			
		}
		
		Customers Customer = (Customers) object;
		
		if (this.customersName.equals(Customer.customersName))
		{
			return true;
		
		}
		return false;
	}
	


	public int compareTo(Customers object)
	{
		int answer;
		
		
		answer = customersName.compareTo(object.customersName);
		
		return answer; 
	}


	/**
	 * 
	 */
	public String toString()
	{
		String answer="";
		
		
		answer = "Name: " + getCustomertName() + ", Address: " + getCustomerAddress() + ", ";
		answer+= "Plan: " + customerPlan;
		answer+="\nRented: " + getRented()  + "\nQueue: " + getInter() + "\n";
		
		
		return answer;
	}

	

}