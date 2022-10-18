
public class CustomerManager {
	private Customer _customer;//Sadece bu alanda kullanılacak customer
	
	ICreditManager _creditManager;
	
	public CustomerManager(Customer customer,  ICreditManager creditManager) {//Constructer=Classın ismi yazılır Aynı clasla constructer oluşturma.
		
		_customer=customer;
		_creditManager=creditManager;
		
	}
	
	public void Save () {//Customer müşteri listesini parametre olarak gönder
		
		System.out.println("Müşteri Kaydedildi"  );
	}
	
	public void Delete() {
		
		System.out.println("Müşteri Silindi.");
	}
	
	public void List() {
		
		//System.out.println(_customer.FirstName + _customer.LastName  + _customer.id );
	}
	public void GiveCredit() {
		
		_creditManager.Calculate();//Krediverilmeden önce hesapla
		System.out.println("Kredi verildi");
		
	}

}
