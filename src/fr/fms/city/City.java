package fr.fms.city;

public class City {
	//attributs exo 1.1
	private String name;
	private String country;
	private int nbInhabitants;
	
	//public static final int MIN_CITY_NBINHABITANTS = 0;
	
	public static int counter = 0; //1.7 (variable statique)
	
	//constructeur
	public City (String name, String country, int nbInhabitants) { //1.1
		this.name = name;
		this.country = country;
		this.nbInhabitants = nbInhabitants;
		counter++; //1.7 (incrémente le compteur)
		
		//setName(name);    //1.2
		//setCountry(country);
		//setNbInhabitants(nbInhabitants);
	}
	
	//public City (String name, String country) {
		//this(name, country, MIN_CITY_NBINHABITANTS);
	//}
	
	//public City (String name, int nbInhabitants) {//1.3
		//this.name = name;
		//this.country = "unknown";
		//this.nbInhabitants = nbInhabitants;
	//}
	
	public City (String name, String country) { //1.9
		this.name = name;
		this.country = country;
		this.nbInhabitants = 0;
	}

	//accesseurs exo 1.2
	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNbInhabitants() {
		return nbInhabitants;
	}

	public void setNbInhabitants(int nbInhabitants) {
		this.nbInhabitants = nbInhabitants;
	//	if (nbInhabitants < 0) 
	//		throw new RuntimeException("le nombre ne peut pas être négatif");
	//	this.nbInhabitants = nbInhabitants;
	}
	
	//public String toString(){
		//return "name: " + getName() + "\t" +  //1.2
		//"country: " + getCountry() + "\t" +
		//"population: " + getNbInhabitants(); 
		//return "[city: " + name + "] " //1.3
				//+ "[country: " + country + "] "
						//+ "[population: " + nbInhabitants + "]";
		//return "ville de " + this.name+  //1.6
			//	" en "+this.country+ 
			//	" ayant "+nbInhabitants+ " habitants.";
	//}
	
	
	

	public void display() {
		System.out.println("name: " + this.name + "\t" + //1.1
						   "country: " + country + "\t" +
						  "population: " + this.nbInhabitants);
		//System.out.println("ville de " + this.name+
				//" en "+this.country+ 
				//" ayant "+nbInhabitants+ " habitants." );
	}
	
	//1.7 (méthode pour obtenir le nombre)
	public static int getCount(){
		return counter;
	}
	
}
