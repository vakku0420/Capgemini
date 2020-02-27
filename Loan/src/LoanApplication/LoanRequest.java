package LoanApplication;

public class LoanRequest {
//Defining the attributes
		protected String accountId;
		private double amount;
		private int tenure;
		private int creditScore; 
		private double roi;
		private String status;
		private String type;
		
//creating constructor		
public LoanRequest	(String accountId ,
		double amount,
		int tenure,
		int creditScore,
		double roi,
		String status,
		String type)
		{
	this.accountId = accountId;
	this.amount = amount;
	this.tenure = tenure;
	this.creditScore = creditScore;
	this.roi = roi;
	this.status= status;
	this.type = type;
			
		}
LoanRequest(){
	
}

public LoanRequest(String accountId){
	this.accountId=accountId;
	
	}
//Creating Getters and Setters of every Attributes

public String getAccountId() {
	return accountId;
}

public void setAccountId(String accountId) {
	this.accountId=accountId;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount=amount;
}

public int getTenure() {
	return tenure;
}

public  void setTenure(int tenure) {
	this.tenure = tenure;
}

public int getCreditScore() {
	return creditScore;
}

public void setCreditScore(int creditScore) {
	this.creditScore=creditScore;
}

public double getRoi() {
	return roi;
}

public void setRoi(double roi) {
	this.roi=roi;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status=status;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type=type;
}


		public boolean equals(Object obj) 
		  {
		    if (this == obj) return true;
		    if (obj == null) return false;
		    if (this.getClass() != obj.getClass()) return false;
		    LoanRequest that = (LoanRequest) obj;
		    if (!this.accountId.equals(that.accountId)) return false;
		    return true;
		  }
		

}
