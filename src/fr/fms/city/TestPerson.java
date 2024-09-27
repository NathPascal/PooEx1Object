package fr.fms.city;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		//Person macron = new Person("Macron","Emmanuel",43,"Elysée à Paris"); //1.8
		//Person poutine = new Person("Poutine","Vladimir",68);
		//Person biden = new Person("Biden","Joe");
		
		//Person macron = new Person("Macron","Emmanuel",43,"Elysée à Paris", new City("Amiens","France")); //1.9
		//Person poutine = new Person("Poutine","Vladimir",68);
		//Person biden = new Person("Biden","Joe");
		
		//System.out.println(macron);
		//System.out.println(poutine);
		//System.out.println(biden);
		
		//2.0
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("Macron","Emmanuel",43,"l'Elysée à Paris", new City("Amiens","France"))); //1.9
		persons.add(new Person("Sarkozy","Nicolas",66,"Paris", new City("Paris","France", 2000000)));
		persons.add(new Person ("Jonhson","Boris",56,"Downing Street à Londres", new City("New York", "Etats-Unis")));
		persons.add(new Person("Depardieu","Gérard",72,"Moscou", new City("Châteauroux","France")));
		persons.add(new Person("Kravitz","Lenny",56,"hôtel particulier à Paris", new City("New York","USA")));
		persons.add(new Person("Lawrence","Jennifer",30,"Louisville aux USA", new City("Indian Hills","USA")));
		
		System.out.println("Liste des personnalités");
		for (Person p : persons) {
			System.out.println(p);}
		
		System.out.println("--------------------------");
		System.out.println("Liste après filtre");
		for (Person p : persons) {
			if(p.getCity().getCountry().equals("France") || p.getAddress().contains("Paris")) System.out.println(p);
			}
		
		
		}

}
