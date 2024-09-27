package fr.fms.city;

public class TestCity {

	public static void main(String[] args) {
		// instancier plusieurs villes 1.1
		
		City toulouse = new City("Toulouse","France",450000);
		City tarbes = new City("Tarbes","France",44000);
		City barcelone = new City("Barcelone","Espagne",1620000);
		City londres = new City("Londres","Angleterre",8870000);
		
		toulouse.display(); 
		tarbes.display();
		barcelone.display();
		londres.display();
		
		
		
		//modification nb d'habitants de toulouse 
		//toulouse.nbInhabitants += 20000;
		//toulouse.display();
		
		// exo 1.2 
		
		//System.out.println(toulouse);
		//System.out.println(tarbes);
		//System.out.println(barcelone);
		//System.out.println(londres);
		
		//toulouse.setNbInhabitants(450000-100000);
		//System.out.println(toulouse);
		
		//toulouse.setNbInhabitants(-200);
		//System.out.println(toulouse);
		
		//exo 1.3
		//City city = new City ("Rabat", 577000 );
		//System.out.println(city);
		
		//city.setCountry("Maroc");
		//System.out.println(city);

		//1.4
		//toulouse.display();
		
		//1.5
		//System.out.println(toulouse); //il appelle l'objet dans le fichier mère = City.java

		//1.7
		System.out.println("Nombre d'instances pour City: " + City.counter);
	}

}
