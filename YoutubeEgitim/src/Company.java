
public class Company  extends Customer{
	//Company de olanlar taxnumber,CompanyName ve customerden gelenler
	
	public String TaxNumber;
	public String CompanyName;
	

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	

}
