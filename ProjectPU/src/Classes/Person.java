package Classes;

import java.util.Date;

public class Person {
	private String name;
	private String adress;
	private int SSN; 
	private String email; 
	private final Calendar calendar;
	
	public Person(String name, String adress, int SSN, String email){
		this.name = name;
		this.adress = adress;
		this.SSN = SSN;
		this.calendar = new Calendar(email);
		this.email = email;
	}
	
	public void setAppointment(Appointment appoint){
		calendar.addAppointment(appoint);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}
	
	public Calendar getCalendar(){
		return calendar;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getSSN() {
		return SSN;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
