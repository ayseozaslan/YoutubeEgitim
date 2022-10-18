
public class CreditManager {
	
	public void Calculator () {
		System.out.println("Kredi Hesaplandı");
		
	}
	public void Save() {
		System.out.println("Kredi Verildi");
		
		
	}

}

interface ICreditManager
{
	void Calculate();//Metodun ne döndürdüğü,ismini ve varsa parametreleri
	void Save();//imzası

}
