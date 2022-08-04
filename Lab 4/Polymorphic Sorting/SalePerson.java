public class SalePerson implements Comparable<Object> {
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson (String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + " : " + totalSales;
	}
	
	public boolean equals(Object o) {
		if(o instanceof SalePerson) {
			SalePerson s = (SalePerson) o;
			if(firstName == s.getFirstName() && lastName == getLastName()) {
				return true;
			} 
		}
		return false;
	}
	
	public int compareTo(Object o) {
		if(o instanceof SalePerson) {
			SalePerson s = (SalePerson) o;
			if(totalSales == s.getTotalSales()) {
				return (s.getLastName().compareTo(lastName));
			} else return (totalSales - s.getTotalSales());
		}
		return -1;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getTotalSales() {
		return this.totalSales;
	}
}
