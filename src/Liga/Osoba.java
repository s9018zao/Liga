package Liga;


import java.util.Date;
//import java.util.GregorianCalendar;




public class Osoba {
	
	private String imie;
	private String nazwisko;
	private Date DataUrodzenia;
	//private Integer wiek;

	
	
	public Osoba(String imie, String nazwisko, Date DataUrodzenia) 
	{
		
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.DataUrodzenia=DataUrodzenia;
		//Osoba.wiek=wiek;
	}

	
	
	
	public String getImie() {
		return imie;
	}


	public void setImie(String imie) {
		this.imie = imie;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	

	public Date getDataUrodzenia() {
		return DataUrodzenia;
	}


	public void setDataUrodzenia(Date dataUrodzenia) {
		DataUrodzenia = dataUrodzenia;
	}

   public void WypiszOsobe(){
	   
	   System.out.println("Imie : " + this.imie + "Nazwisko : " + this.nazwisko + "Data Urodzenia : " + this.DataUrodzenia);
	   
   }
	
}