package Validator;
import java.util.regex.*; 
public class Validator {
public Validator() {
		super();
	}
	
	public boolean validateAccountId(String accountId) throws Exception{
		if(accountId.length()==12) {
			return true;
		}
		else
			throw new Exception("Invalid AccountId"); 
	}
	
	public boolean validateAmount(double amount)throws Exception{
		if(amount>=1000 && amount<=10000000) {
			return true;
		}
		else
			throw new Exception("Enter the amount in range 1000-10000000");
	}
	public boolean validateTenure(int tenure) throws Exception{
		if(tenure >=12 && tenure <=240) {
			return true;
		}
		else
			throw new Exception("Enter tenure in range 12-240");
	}
	public boolean validateCreditScore(int creditScore) throws Exception{
		if(creditScore >=100 && creditScore <=999) {
			return true;
		}
		else
			throw new Exception("Enter credit score in range 100-999");
	}
	
	
	public boolean validateRoi(double roi) throws Exception{
		if(roi>=4 && roi<=15) {
			return true;
		}
		else
			throw new Exception("Enter rate of interest in range 4-15");
	}
	
	public  boolean validateStatus(String status) throws Exception{
		if(status.equals("Accepted") || status.equals("Rejected") || status.equals("Pending") || status.equals(null)) {
			return true;
		}
		else
			throw new Exception("Enter valid status");
	}
	
	public boolean validateType(String type) throws Exception{
		if(type.equals("Home_Loan") || type.equals("Education_Loan") || type.equals("Vehicle_Loan")) {
			return true;
		}
		else
			throw new Exception("Invalid Loan Type");
	}
}
