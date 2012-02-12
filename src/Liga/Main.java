package Liga;

import java.util.ArrayList;
import java.util.GregorianCalendar;
//import java.util.Date;
import java.util.List;

public class Main {

	
	
	public static void main(String[] args) {
		
		List<Zawodnik> Zawodnicy = new ArrayList<Zawodnik>();
		Osoba t1 = new Osoba("Jan", "Tomaszewski", new GregorianCalendar(1951,9,8).getTime());
		
		Osoba z1 = new Osoba("Kazimierz", "Moskal", new GregorianCalendar(1986,3,24).getTime());
		Osoba z2 = new Osoba("Bogdan", "Wisniewski", new GregorianCalendar(1987,5,9).getTime());
		Osoba z3 = new Osoba("Adam", "Jędrzejczyk", new GregorianCalendar(1979,1,2).getTime());
		Osoba z4 = new Osoba("Tomasz", "Groniec", new GregorianCalendar(1990,9,3).getTime());
		Osoba z5 = new Osoba("Adam", "Buzala", new GregorianCalendar(1984,0,9).getTime());
		Trener Treneiro = new Trener(t1, "Bramkarze");
		
		Zespol PolneKrzoki = new Zespol("Wrzeszcz",Zawodnicy, "Polne Krzoki", Treneiro);
		
		PolneKrzoki.DodajZawodnika(new Zawodnik(z1,0,0));
		PolneKrzoki.DodajZawodnika(new Zawodnik(z2, 2,4));
		PolneKrzoki.DodajZawodnika(new Zawodnik(z3, 1,6));
		PolneKrzoki.DodajZawodnika(new Zawodnik(z4, 3,2));
		PolneKrzoki.DodajZawodnika(new Zawodnik(z5, 1,3));
			
		PolneKrzoki.WypiszDruzyne();
		
		System.out.println("______________________________________________________");
		System.out.println("");		
		PolneKrzoki.ZnajdzZawodnika("Moskal").WypiszZawodnika();
		PolneKrzoki.UsunZawodnika("Moskal");
		System.out.println("______________________________________________________");
		System.out.println("");		
		
		PolneKrzoki.WypiszDruzyne();
		
		System.out.println("______________________________________________________");
		System.out.println("");		
		
		
		PolneKrzoki.SzukajZawodnikow("Adam");
		
		
	}
}
