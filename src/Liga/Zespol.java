package Liga;


import java.util.ArrayList;
import java.util.List;

public class Zespol {
	
	private String nazwa;
	private String dzielnica;
	private Trener trener;
	private List<Zawodnik> Zawodnicy = new ArrayList<Zawodnik>();
	

	public Zespol(String dzielnica, List<Zawodnik> zawodnicy, String nazwa, Trener trener) {
		
		this.dzielnica = dzielnica;
		this.Zawodnicy = zawodnicy;
		this.nazwa = nazwa;
		this.trener=trener;
	}
	
	
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getDzielnica() {
		return dzielnica;
	}
	public void setDzielnica(String dzielnica) {
		this.dzielnica = dzielnica;
	}
	public List<Zawodnik> getZawodnicy() {
		return Zawodnicy;
	}
	public void setZawodnicy(List<Zawodnik> zawodnicy) {
		Zawodnicy = zawodnicy;
	}
	
	public void DodajZawodnika (Zawodnik Z){
		
		Zawodnicy.add(Z);
}
	
	public void DodajTrenera (Osoba Selekcjoner,String Specjalnosc){
		
		 trener.DodajTrenera(new Trener(Selekcjoner, Specjalnosc));
		
	}
   public void WypiszDruzyne(){
	  
	  System.out.println("Zawodnicy : ");
	  
	  for (Zawodnik P : Zawodnicy){
		  P.WypiszZawodnika();
	  }
	  System.out.println("Trener : "); 
	  trener.WypiszTrenera();
   }
    public Zawodnik ZnajdzZawodnika (String Nazwisko){
    	
    	for (Zawodnik nazwisko1 : Zawodnicy){
    		if(nazwisko1.getNazwisko().equals(nazwisko1));{
    			return nazwisko1;
    		}
    	}
    		return null;
    		
    	}
    public void UsunZawodnika(String Nazwisko){
    	Zawodnicy.remove(ZnajdzZawodnika(Nazwisko));
    	
    }
   public List<Zawodnik>  SzukajZawodnikow(String imie){
	   
	   List<Zawodnik> znalezieni = new ArrayList<Zawodnik>();
	   
	   for(Zawodnik Zawodnik: Zawodnicy){
		   if(Zawodnik.getImie().equals(imie));{
			   Zawodnik.WypiszZawodnika();
			   znalezieni.add(Zawodnik);
			   
		   }
	   }
	return znalezieni;
    	
    }
 }
