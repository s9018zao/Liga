package Liga;



public class Trener extends Osoba {
	
	private String specjalnosc;
	

    public Trener(Osoba Selekcjoner, String specjalnosc) {
		
		super(Selekcjoner.getImie(), Selekcjoner.getNazwisko(), Selekcjoner.getDataUrodzenia());
		
		this.specjalnosc=specjalnosc;
	}

	public String getSpecjalnosc() {
		return specjalnosc;
	}


	public void setSpecjalnosc(String specjalnosc) {
		this.specjalnosc = specjalnosc;
	}
	public void WypiszTrenera(){
		   
		   System.out.println("Imie : " + this.getImie() + "Nazwisko : " + this.getNazwisko() + "Data Urodzenia : " + this.getDataUrodzenia() +"Specjalnosc : "+ this.specjalnosc);
		   
	   }

	public void DodajTrenera(Trener trener) {
		
		
	}
		

}
