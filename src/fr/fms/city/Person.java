package fr.fms.city;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	//attributs 1.8
	private String lastName;
	private String firstName;
	private int age;
	private String address;
	private City city;
	
	//constructeurs 1.8
	public Person(String lastName, String firstName, int age, String address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	
	}

	public Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = "unknown";
	}

	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = 0;
		this.address = "unknown";
		
	}

	public Person(String lastName, String firstName, int age, String address, City city) { //1.9
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.city = city;
	}
	
	//2.0 - accesseurs
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	

	@Override
	public String toString() {
		//return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address=" + address
				//+ "]";
		//if(city == null) return "Person [lastName=" + lastName +  //1.9
				//", firstName=" + firstName + ","
				//+ " age=" + age + ", address=" + address+ "] Bornull";
		//else
		//return "Person [lastName=" + lastName + 
				//", firstName=" + firstName + ","
					//	+ " age=" + age + ", address=" + address+ "]"+
				//"BornCity[name=" +city.name+", country="+city.country+", population=" +city.nbInhabitants+"]";
		
		//2.0
		if(city.getNbInhabitants() == 0) return lastName+", "+firstName+", "+age+" ans, habitant "+address
				+", Ville de naissance: "+city.getName()+", "+city.getCountry();
		else
		return lastName+", "+firstName+", "+age+" ans, habitant "+address
				+", Ville de naissance: "+city.getName()+", "+city.getCountry()
				+", population "+city.getName()+ " "+city.getNbInhabitants()+" d'habitants"	;		
	}	

}
