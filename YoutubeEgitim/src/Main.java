
public class Main {

	public static void main(String[] args) {
		   
		   /*int sayi1=10;
	       int sayi2=20;
	       sayi1=sayi2;
	       sayi2=100;
	       //sayi1=20
	       //sayi2=100

	       System.out.println(sayi1);
	       */
		
		
		/*int[] sayilar1= {1,2,3};
		int[] sayilar2={10,20,30};
		sayilar1=sayilar2;
		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);
		*/
		
		
		/*CreditManager creditManager=new CreditManager();
		creditManager.Calculator();
		creditManager.Save();

		
		Customer customer=new Customer();//İnstance oluşturmak.Heap de örmeğini karşılığını oluşturmak.
		customer.id=1;
		customer.City="İstanbul";
		
		CustomerManager customerManager=new CustomerManager(customer);
		//customerManager.Save(1,"Ayşe","Özaslan","1234567");//save e tek tek bilgileri girmek yerine parametre yolla
		customerManager.Save();
		customerManager.Delete();
		customerManager.List();
		
		     //iNHERİTANCE EDİLEN CLASSLARIN ÇAĞIRILMASI
		Company company =new Company();
		company.TaxNumber="1000000";
		company.CompanyName="Arçelik";
		company.id=100;
		
		CustomerManager customerManager2=new CustomerManager(new Person());
		
		Person person=new Person();
		person.NationalIdentity="56789624";
		person.FirstName="zehra";
		
		Customer c1=new Customer();//Şu sekil newlenebilir.
		Customer c2=new Person();
		Customer c3=new Company();
		*/
		
		CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager.GiveCredit();
		
		
		
		System.out.println();
	}

}
