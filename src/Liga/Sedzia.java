package Liga;



public class Sedzia extends Osoba{
	
	String dzielnica;
	

	
	public Sedzia(Osoba Kalosz, String dzielnica) {
		
		super(Kalosz.getImie(), Kalosz.getNazwisko(),Kalosz.getDataUrodzenia());
		
		this.dzielnica=dzielnica;
	}
	
	public String getDzielnica() {
		return dzielnica;
	}


	public void setDzielnica(String dzielnica) {
		this.dzielnica = dzielnica;
	}



}
