package Liga;



public class Zawodnik extends Osoba{
	
      

	private Integer GoleZdobyte;
    private Integer MinutyKarne;
	
	public Zawodnik(Osoba Gracz, Integer GoleZdobyte, Integer MinutyKarne) {
		
		super(Gracz.getImie(), Gracz.getNazwisko(), Gracz.getDataUrodzenia());
		
		this.GoleZdobyte=GoleZdobyte;
		this.MinutyKarne=MinutyKarne;
		
	}
	
	 public Integer getGoleZdobyte() {
			return GoleZdobyte;
		}

		public void setGoleZdobyte(Integer goleZdobyte) {
			GoleZdobyte = goleZdobyte;
		}

		public Integer getMinutyKarne() {
			return MinutyKarne;
		}

		public void setMinutyKarne(Integer minutyKarne) {
			MinutyKarne = minutyKarne;
		}
		
		public void WypiszZawodnika(){
			   
			   System.out.println("Imie :  " + this.getImie() + "Nazwisko :  " + this.getNazwisko() + "Data Urodzenia : " 
			   + this.getDataUrodzenia() +"Bramki :"+this.GoleZdobyte + "Minuty : "+ this.MinutyKarne);
			   
		   }

}
